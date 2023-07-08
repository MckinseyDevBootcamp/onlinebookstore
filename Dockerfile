FROM openjdk:17
ARG VERSION=0.0.1-SNAPSHOT
COPY build/libs/onlinebookstore-${VERSION}.jar onlinebookstore.jar

EXPOSE 8080
ENTRYPOINT ["/bin/sh", "-c" , "java -jar onlinebookstore.jar"]