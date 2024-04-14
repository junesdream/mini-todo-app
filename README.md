# Mini-Todo-App

This is a mini Java-based RESTful API for managing todo items. It's built with Spring Boot and uses an in-memory H2 database for persistence.

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes.

### Prerequisites

What things you need to install the software:

- Java JDK 11 or later
- Maven
- An IDE of your choice (Optional)

### Installing

A step-by-step series of examples that tell you how to get a development environment running:

1. Clone the repository to your local machine.
- cd mini-todo-app
- mvn spring-boot:run

### Usage
- GET /todo - Retrieves a list of all todo items.
- POST /todo - Creates a new todo item.
- 
### Get all todo items
- curl -X GET http://localhost:8080/todo
- curl -X POST http://localhost:8080/todo -H 'Content-Type: application/json' -d '{"name": "New Todo", "done": false}'
