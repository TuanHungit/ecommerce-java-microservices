FROM openjdk:11
VOLUME /tmp
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} auth-service.jar
ENTRYPOINT ["java", "-jar", "/auth-service.jar"]
