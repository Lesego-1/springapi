# 🌟 User API - Spring Boot REST API

This is a simple **Java Spring Boot REST API** that allows you to manage users with **GET**, **POST**, and **DELETE** endpoints. The project stores users in memory using a simple `List<User>` for demonstration purposes.

---

## 🚀 Features

- **GET /user** 🔍
  Retrieve user information.  
  - If `id` is provided as a query parameter, returns a single user.
  - If `id` is not provided, returns all users.

- **POST /user** ✏️
  Create a new user.  
  - Accepts JSON body containing user details (id, name, age, email).

- **DELETE /user/{id}** ❌
  Delete a user by ID.  
  - Returns `204 No Content` if deleted, or `404 Not Found` if the user does not exist.

---

## 📁 Project Structure

```

src/main/java/com/example/springapi/
│
├─ api/
│   ├─ controller/
│   │   └─ UserController.java
│   └─ model/
│       └─ User.java
│
└─ service/
    └─ UserService.java

````

---

## User Model

```java
public class User {
    private Integer id;
    private String name;
    private Integer age;
    private String email;

    // Constructors, getters, setters
}
````

---

## 💻 Example Requests

### GET all users 🌐

```
GET http://localhost:8080/user
```

Response:

```json
[
  {
    "id": 1,
    "name": "Ida",
    "age": 32,
    "email": "ida@mail.com"
  }
]
```

### GET user by ID 🔎

```
GET http://localhost:8080/user?id=1
```

Response:

```json
{
  "id": 1,
  "name": "Ida",
  "age": 32,
  "email": "ida@mail.com"
}
```

### POST create user 📝

```
POST http://localhost:8080/user
Content-Type: application/json
```

Request Body:

```json
{
  "id": 2,
  "name": "John",
  "age": 28,
  "email": "john@mail.com"
}
```

Response:

```json
{
  "id": 2,
  "name": "John",
  "age": 28,
  "email": "john@mail.com"
}
```

### DELETE user 🗑️

```
DELETE http://localhost:8080/user/2
```

Response:

* `204 No Content` → user deleted
* `404 Not Found` → user not found

---

## 🏃 Running the Project

1. Make sure you have **Java 11+** and **Maven** installed.
2. Clone the repository:

```bash
git clone https://github.com/Lesego-1/springapi.git
cd springapi
```

3. Build and run the project:

```bash
mvn spring-boot:run
```

4. API will be available at: `http://localhost:8080`

---

## ⚠️ Notes

* This project uses an **in-memory list**, so all data will be lost when the application stops.
* No database is required for this demo.
