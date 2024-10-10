# Archi-Web-Service-Spring

---

![License](https://img.shields.io/github/license/Redstoneur/Archi-Web-Service-Spring)
![Top Language](https://img.shields.io/github/languages/top/Redstoneur/Archi-Web-Service-Spring)
![Java Version](https://img.shields.io/badge/Java-21-blue)
![Spring](https://img.shields.io/badge/Spring-Framework-brightgreen)
![Maven](https://img.shields.io/badge/Maven-3.8.6-blue)
![Size](https://img.shields.io/github/repo-size/Redstoneur/Archi-Web-Service-Spring)
![Contributors](https://img.shields.io/github/contributors/Redstoneur/Archi-Web-Service-Spring)
![Last Commit](https://img.shields.io/github/last-commit/Redstoneur/Archi-Web-Service-Spring)
![Issues](https://img.shields.io/github/issues/Redstoneur/Archi-Web-Service-Spring)
![Pull Requests](https://img.shields.io/github/issues-pr/Redstoneur/Archi-Web-Service-Spring)

---

![Forks](https://img.shields.io/github/forks/Redstoneur/Archi-Web-Service-Spring)
![Stars](https://img.shields.io/github/stars/Redstoneur/Archi-Web-Service-Spring)
![Watchers](https://img.shields.io/github/watchers/Redstoneur/Archi-Web-Service-Spring)

[//]: # (---)

[//]: # ()

[//]: # (![Latest Release]&#40;https://img.shields.io/github/v/release/Redstoneur/Archi-Web-Service-Spring&#41;)

[//]: # (![Release Date]&#40;https://img.shields.io/github/release-date/Redstoneur/Archi-Web-Service-Spring&#41;)

[//]: # (![Build Status]&#40;https://img.shields.io/github/actions/workflow/status/Redstoneur/Archi-Web-Service-Spring/pylint.yml&#41;)

---

## Table of Contents

<!-- TOC -->
* [Archi-Web-Service-Spring](#archi-web-service-spring)
  * [Table of Contents](#table-of-contents)
  * [Description](#description)
  * [Execution Instructions](#execution-instructions)
    * [Without Docker](#without-docker)
    * [With Docker](#with-docker)
    * [Generating the JAR](#generating-the-jar)
  * [License](#license)
<!-- TOC -->

## Description

This project is a Spring Boot application developed as part of a course assignment. It provides a RESTful web service
for managing greetings.

## Execution Instructions

### Without Docker

1. **Clone the repository:**
   ```sh
   git clone https://github.com/Redstoneur/Archi-Web-Service-Spring.git
   cd Archi-Web-Service-Spring
   ```

2. **Run the application:**
   ```sh
   ./mvnw spring-boot:run
   ```

3. **Access the application:**
   Open your browser and navigate to `http://localhost:3000`.
    - To view Swagger UI, navigate to `http://localhost:3000/swagger-ui.html`.
    - To view the H2 console, navigate to `http://localhost:3000/h2-console`.
        - JDBC URL: `jdbc:h2:mem:testdb`
        - Username: `sa`
        - Password: `password`

### With Docker

1. **Clone the repository:**
   ```sh
   git clone https://github.com/Redstoneur/Archi-Web-Service-Spring.git
   cd Archi-Web-Service-Spring
   ```

2. **Build and run the Docker container:**
   ```sh
   docker-compose up --build
   ```

3. **Access the application:**
   Open your browser and navigate to `http://localhost:3000`.
    - To view Swagger UI, navigate to `http://localhost:3000/swagger-ui.html`.
    - To view the H2 console, navigate to `http://localhost:3000/h2-console`.
        - JDBC URL: `jdbc:h2:mem:testdb`
        - Username: `sa`
        - Password: `password`

### Generating the JAR

1. **Clone the repository:**
   ```sh
   git clone https://github.com/Redstoneur/Archi-Web-Service-Spring.git
   cd Archi-Web-Service-Spring
   ```

2. **Build the JAR file:**
   ```sh
   ./mvnw clean package
   ```

3. **The JAR file will be located in the `target` directory:**
   ```sh
   ls target/restservice-0.0.1-SNAPSHOT.jar
   ```

## License

This project is licensed under the Apache License 2.0. See the `LICENSE` file for more details.
