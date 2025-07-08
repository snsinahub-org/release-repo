# Automated Release Spring Boot Application

## Project Overview

This project is a Spring Boot web application that demonstrates automated release workflows using GitHub Actions. The application serves a simple REST endpoint that returns "Greetings from Spring Boot!" when accessed at the root URL.

## Application Structure

The project follows a standard Spring Boot application structure:

- [`src/main/java/com/example/springboot/Application.java`](src/main/java/com/example/springboot/Application.java ): Main application entry point
- [`src/main/java/com/example/springboot/HelloController.java`](src/main/java/com/example/springboot/HelloController.java ): REST controller serving the root endpoint
- [`src/test/java/com/example/demo/DemoApplicationTests.java`](src/test/java/com/example/demo/DemoApplicationTests.java ): Test class
- [`pom.xml`](pom.xml ): Maven configuration file for dependencies and build settings

## Development Setup

### Prerequisites

- Java 8 (as specified in pom.xml)
- Maven 3.x

### Building the Application

To build the application, run:

```bash
./mvnw clean package