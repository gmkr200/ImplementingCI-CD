# Use a lightweight JDK base image
FROM openjdk:17-jdk-slim


# Set working directory
WORKDIR /app

# Copy the built jar file (adjust name if needed)
COPY target/*.jar app.jar

# Expose your Spring Boot app's port
EXPOSE 8080

# Run the application
ENTRYPOINT ["java", "-jar", "app.jar"]
