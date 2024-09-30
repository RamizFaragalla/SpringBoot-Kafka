FROM amazoncorretto:17
WORKDIR /app
COPY target/SpringBoot-Kafka-0.0.1-SNAPSHOT.jar /app/application.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/app/application.jar"]
