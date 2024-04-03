FROM openjdk:17-alpine
EXPOSE 8085
ADD target/docker-assignment.jar docker-assignment.jar
ENTRYPOINT ["java", "-jar", "docker-assignment.jar"]