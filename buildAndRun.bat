@echo off
call mvn clean package
call docker build -t cchai-doris/jsf-test .
call docker rm -f jsf-test
call docker run -d -p 18080:18080 -p 14848:14848 --name jsf-test cchai-doris/jsf-test
