# Use Eclipse Temurin JDK 17 as the base image
FROM eclipse-temurin:17-jdk

# Set the working directory
WORKDIR /app

# Copy the generated JAR file
COPY target/*.jar app.jar

# Expose application port
EXPOSE 8080

# Run the Spring Boot application
ENTRYPOINT ["java","-jar","app.jar"]
