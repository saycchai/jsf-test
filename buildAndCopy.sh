#!/bin/sh
mvn clean package
cp -p -f ./target/jsf-test.war /home/cchai/java/jboss/wildfly-18.0.0.Final/standalone/deployments
