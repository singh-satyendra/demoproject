FROM anapsix/alpine-java:latest 
COPY target/demoproject-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 9999 
ENTRYPOINT java -jar ./app.jar