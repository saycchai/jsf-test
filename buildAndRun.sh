#!/bin/sh
mvn clean package && docker build -t cchai-doris/jsf-test .
docker rm -f jsf-test || true && docker run -d -p 8080:8080 -p 4848:4848 --name jsf-test cchai-doris/jsf-test
