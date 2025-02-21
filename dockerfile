FROM openjdk:17-jdk-alpine
WORKDIR /project
COPY /target/project.jar /project
ENTRYPOINT["java","-jar","project.jar"]
