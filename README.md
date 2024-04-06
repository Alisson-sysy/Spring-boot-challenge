<h1 align="center">
  TODO List
</h1>


## Technologies
 
- [Spring Boot](https://spring.io/projects/spring-boot)
- [Spring MVC](https://docs.spring.io/spring-framework/reference/web/webmvc.html)
- [Spring Data JPA](https://spring.io/projects/spring-data-jpa)
- [Mysql](https://dev.mysql.com/downloads/)

## Code practices

- API REST
- Queries with Spring Data JPA
- Dependency Injection
- Handling error responses
- Automatic Swagger generation with OpenAPI 3

## How to Run

- Clone git repository
- Build the project:
```
$ ./mvnw clean package
```
- Run the application:
```
$ java -jar target/todolist-0.0.1-SNAPSHOT.jar
```

The API can be accessed at [localhost:8080](http://localhost:8080).
Swagger can be viewed at [localhost:8080/swagger-ui.html](http://localhost:8080/swagger-ui.html)

## API Endpoints

 To make the HTTP requests below, the [Postman](https://www.postman.com/) tool was used:

<h2 align="center">Create</h2>

- Request URL
```
POST - localhost:8080/todos
```
- Body
```
  {
    "descricao": "Desc Todo 1",
    "id": 1,
    "nome": "Todo 1",
    "prioridade": 1,
    "realizado": false
  }
```
<h2 align="center">List</h2>

- Request URL
```
GET - localhost:8080/todos
```
- Body
```
{}
```

<!-- - Atualizar Tarefa
```
$ http PUT :8080/todos/1 nome="Todo 1 Up" descricao="Desc Todo 1 Up" prioridade=2

[
  {
    "descricao": "Desc Todo 1 Up",
    "id": 1,
    "nome": "Todo 1 Up",
    "prioridade": 2,
    "realizado": false
  }
]
```

- Remover Tarefa
```
http DELETE :8080/todos/1

[ ] -->
```