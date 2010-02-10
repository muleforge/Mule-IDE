/*
 * $Id$
 * --------------------------------------------------------------------------------------
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */

import org.codehaus.groovy.ant.FileScanner

def cliBuilder = new CliBuilder()
cliBuilder.n(longOpt: "newVersion", required: true, args: 1, "new version")
cliBuilder.h(longOpt: "help", "show usage info")
cliBuilder.r(longOpt: "root", args: 1, "start scanning at this root folder")

def options = cliBuilder.parse(args)
if (!options)
{
    println ""
    println "Error parsing options " + args
    println ""
    System.exit(1)
}
if (options.h)
{
    cliBuilder.usage()
    System.exit(0)
}

newVersion = buildNewVersion(options.n)

scanRoot = new File("")
if (options.r)
{
    scanRoot = new File(options.r)
}

ant = new AntBuilder()

switchAllManifests()
switchAllFeatures()

//-----------------------------------------------------------------------------
// functions
//-----------------------------------------------------------------------------
def buildNewVersion(String version)
{
    if (version.contains(".qualifier") == false)
    {
        return "${version}.qualifier"
    }
    return version
}

def switchAllManifests()
{
    FileScanner scanner = ant.fileScanner
    {
        fileset(dir: scanRoot)
        {
            include(name: "**/MANIFEST.MF")

            // the common plugin follows its own versioning scheme as not only MuleIDE depens on it
            exclude(name: "**/org.mule.ide.common/**")

            // do not consider the old config visualization plugins
            exclude(name: "**/org.mule.ide.config.axis*/**")
            exclude(name: "**/org.mule.ide.config.common/**")
            exclude(name: "**/org.mule.ide.config.core/**")
            exclude(name: "**/org.mule.ide.config.editor*/**")
            exclude(name: "**/org.mule.ide.config.jms*/**")
            exclude(name: "**/org.mule.ide.config.spring*/**")
            exclude(name: "**/org.mule.ide.config.stdio*/**")
            exclude(name: "**/org.mule.ide.config.vm*/**")
        }
    }

    scanner.each
    {
        switchBundleVersion(it)
    }
}

def switchBundleVersion(File manifestFile)
{
    File updatedManifestFile = new File(manifestFile.parentFile, "MANIFEST.MF.new")
    BufferedWriter outWriter = updatedManifestFile.newWriter()
    def versionRegex = /.*Bundle-Version:.*/

    manifestFile.eachLine
    {
        line ->

        if (line =~ versionRegex)
        {
            outWriter.append("Bundle-Version: ${newVersion}")
            outWriter.newLine()
        }
        else
        {
            outWriter.append(line)
            outWriter.newLine()
        }
    }

    outWriter.close()

    updatedManifestFile.renameTo(manifestFile)
}

def switchAllFeatures()
{
    FileScanner scanner = ant.fileScanner
    {
        fileset(dir: scanRoot)
        {
            include(name: "**/feature.xml")
        }
    }

    scanner.each
    {
        switchFeatureVersion(it)
    }
}

def switchFeatureVersion(File featureFile)
{
    def feature = new XmlParser().parse(featureFile)
    feature.@version = newVersion

    File updatedFeatureFile = new File(featureFile.parentFile, "feature.xml.new")

    PrintWriter updatedFeatureWriter = updatedFeatureFile.newPrintWriter()
    new XmlNodePrinter(updatedFeatureWriter).print(feature)
    updatedFeatureWriter.close()

    updatedFeatureFile.renameTo(featureFile)
}
