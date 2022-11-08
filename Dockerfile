FROM amazoncorretto:11-alpine-jdk
ADD web/build/libs/*SNAPSHOT.jar song-service.jar
ENTRYPOINT ["java","-jar","song-service.jar"]