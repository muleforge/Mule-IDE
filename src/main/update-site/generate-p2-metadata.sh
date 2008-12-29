#!/bin/bash
# 
# Script to generate the P2 metadata required for a proper update site
#
# make sure you have the "eclipse" command on the PATH before running this script

DEPLOY_URL="http://snapshots.dist.muleforge.org/mule-ide/updates-2.0-M1"

if [ ! -d plugins ]; then
	echo "please build the update site first"
	exit 1
fi

rm artifacts.xml content.xml

eclipse -application org.eclipse.equinox.p2.metadata.generator.EclipseGenerator \
	-updateSite `pwd` \
	-site file://`pwd`/site.xml \
	-metadataRepository $DEPLOY_URL \
	-metadataRepositoryName "Mule IDE Update Site" \
	-artifactRepository $DEPLOY_URL \
	-artifactRepositoryName "Mule IDE Artifacts" \
	-compress \
	-reusePack200Files \
	-noDefaultIUs \
	-vmargs -Xmx256m
