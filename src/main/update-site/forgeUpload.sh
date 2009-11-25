#!/bin/bash
#
# Script for automatic upload to the forge
#

SNAPSHOT_URL="https://dav.muleforge.org/snapshots.dist/mule-ide/"
RELEASE_URL="https://dav.muleforge.org/dist/mule-ide/"

function processArgs()
{
    until [ -z "$1" ]
    do
        case "$1" in
            --user)
                shift
                USER="$1"
                ;;

            --password)
                shift
                PASSWORD="$1"
                ;;

            --snapshot)
                URL=${SNAPSHOT_URL}
                ;;

            --release)
            	URL=${RELEASE_URL}
            	;;

            *)
                echo "unknown arg: $1"
                exit
                ;;
        esac

        shift
    done
}

function usage()
{
    echo "$0 --user <user> --password <password> [--snapshot]"
    exit 1
}

function checkArgs()
{
    if [ "$USER" = "" ]; then
        usage
    fi
    if [ "$PASSWORD" = "" ]; then
        usage
    fi
}

function checkDirectory()
{
    dir="$1"
    if [ ! -d "$dir" ]; then
        echo "$dir directory does not exist"
        exit 1
    fi
    if [ `ls $dir | wc -l` -eq 0 ]; then
        echo "$dir directory does not contain any $dir"
        exit 1
    fi
}

function checkFile()
{
    file="$1"
    if [ ! -f "$file" ]; then
        echo "$file does not exist"
        exit 1
    fi
}

function checkPrerequisites()
{
    checkDirectory "features"
    checkDirectory "plugins"
    checkFile artifacts.jar
    checkFile content.jar
}

function makeBackup()
{
    file="$1"
    if [ -f $file ]; then
        mv "$file" "${file}${BACKUP_SUFFIX}"
    fi
}

function generateNetRc()
{
    file="$HOME/.netrc"
    makeBackup "$file"
    cat > "$file" <<End-of-message
machine dav.muleforge.org
login $USER
password $PASSWORD
End-of-message
}

function generateCadaverRc()
{
    file="$HOME/.cadaverrc"
    makeBackup "$file"
    cat > "$file" <<End-of-message
open $URL
cd updates
cd 3.4
cd features
End-of-message

    for feature in `ls features`
    do
        echo "put features/$feature" >> "$file"
    done

    echo "cd ../plugins" >> "$file"

    for plugin in `ls plugins`
    do
        echo "put plugins/$plugin" >> "$file"
    done

    cat >> $file <<End-of-message
cd ..
put artifacts.jar
put content.jar
put site.xml
exit
End-of-message
}

function runCadaver()
{
    cadaver "$URL"
}

function restoreNetRc()
{
    netRc="$HOME/.netrc"
    backupFile="$netrc$BACKUP_SUFFIX"
    if [ -f "$backupFile" ]; then
        mv "$backupFile" "$netRc"
    else
        rm "$netRc"
    fi
}

function restoreCadaverRc()
{
    cadaverRc="$HOME/.cadaverrc"
    backupFile="$cadaverRc$BACKUP_SUFFIX"
    if [ -f "$backupFile" ]; then
        mv "$backupFile" "$cadaverRc"
    else
        rm "$cadaverRc"
    fi
}

#
# main
#
URL=${SNAPSHOT_URL}
USER=
PASSWORD=
BACKUP_SUFFIX=".upload-bak"

processArgs $*
checkArgs
checkPrerequisites
generateNetRc
generateCadaverRc
runCadaver
restoreNetRc
restoreCadaverRc
