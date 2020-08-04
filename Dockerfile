FROM payara/server-full:latest
COPY target/jsf-test.war $DEPLOY_DIR
