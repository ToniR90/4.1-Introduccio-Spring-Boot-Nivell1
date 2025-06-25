# 4.1 Spring Boot - Introduction to Spring Boot with Maven

This project is an introductory exercise to get started with the **Spring Boot** framework using **Maven** as the dependency manager.

It demonstrates how to:

- Set up a Spring Boot project using [start.spring.io](https://start.spring.io/)
- Configure a REST API with simple endpoints
- Use HTTP GET methods with both `@RequestParam` and `@PathVariable`
- Execute basic Maven commands from the terminal

---

## Project Information

- **Group:** `cat.itacademy.s04.t01.n01`
- **Artifact:** `S04T01N01`
- **Name:** `S04T01N01`
- **Description:** `S04T01N01`
- **Package name:** `cat.itacademy.s04.t01.n01`
- **Packaging:** `Jar`
- **Java version:** 11 or higher
- **Dependencies:**
  - Spring Boot DevTools
  - Spring Web

---

## Configuration

In the `application.properties` file, the application is configured to run on port `9000`:

```properties
server.port=9000
```

---


## API Endpoints 

Two simple endpoints are defined in the HelloWorldController class.


### 1. GET /HelloWorld

Accepts an optional query parameter nom (default: "UNKNOWN").

Example requests:

http://localhost:9000/HelloWorld

http://localhost:9000/HelloWorld?nom=Toni

Returns:

text
Copiar
Editar
Hola, Toni. Estàs executant un projecte Maven


### 2. GET /HelloWorld2/{nom}

Accepts an optional path variable nom.

Example requests:

http://localhost:9000/HelloWorld2

http://localhost:9000/HelloWorld2/Toni

Returns the same greeting message.

---

## Running the Application

Open a terminal in the project root and use the following Maven commands:

Compile the project

bash
```mvn compile```

bash
```Clean the project```

bash
```mvn clean```

---

## Run the application

bash
```mvn spring-boot:run```

---

To import the project:

Copy the repository: 

Open Eclipse.

Go to File > Import > Existing Maven Project.

Select the project folder and finish the import.
