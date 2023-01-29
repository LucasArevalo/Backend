FROM amazoncorretto:11-alpine-jdk
MAINTAINER ALF
COPY target/alf.Produccion-0.0.1-SNAPSHOT.jar  alf-app.jar
ENTRYPOINT ["java","-jar","/alf-app.jar"]