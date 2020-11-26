FROM openjdk:8-jdk-alpine
MAINTAINER Anupam Sharma
ADD target/account-service.jar account-service.jar
EXPOSE 2223
ENTRYPOINT ["java", "-jar", "/account-service.jar"]