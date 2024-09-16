FROM openjdk:11-jdk-slim
WORKDIR /app
COPY . .
RUN ./mvnw package
CMD ["java", "-jar", "target/hello-devops-spring.jar"]
