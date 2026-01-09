# First Rest Api Spring Project

**Student:** Saliya Komilova 73399 **University:** Vistula University **Subject:** Spring Framework

## What I did in this project:

1. **RESTful API Development**: Created a fully functional API using Spring Boot to manage a product catalog.
2. **Layered Architecture**: Implemented a professional structure including Controller, Service, Repository, and Domain layers[cite: 358, 381].
3. **CRUD Functionality**: Added support for Create, Read (single & all), and Delete operations[cite: 825, 843, 1327, 1393].
4. **Data Persistence**: Integrated an in-memory **H2 Database** using Spring Data JPA [cite: 1441-1443].
5. **Exception Handling**: Developed a global handler using `@ControllerAdvice` to return custom 404 error messages via `ProductNotFoundException` [cite: 1043, 1079-1081].
6. **Documentation**: Configured **Swagger UI** and **OpenAPI** for automated API documentation and interactive testing [cite: 721-723].

---

## How to test the app:

1. **Run the project**: Open in IntelliJ IDEA and run `FirstRestApiSpringApplication.java`[cite: 114, 754].
2. **Swagger UI**: Access `http://localhost:8080/swagger-ui/index.html` to interact with endpoints[cite: 768].
3. **H2 Database Console**: Access `http://localhost:8080/console` with JDBC URL: `jdbc:h2:mem:testdb`[cite: 1459, 1485].
4. **Endpoints**:
    - `POST /api/v1/products`: Create a product.
    - `GET /api/v1/products`: List all products.
    - `GET /api/v1/products/{id}`: Find by ID.
    - `DELETE /api/v1/products/{id}`: Remove a product.

---

## Functionality Screenshots

### 1. Interactive Documentation (Swagger UI)
Automated API overview and testing interface.
![Swagger UI](screenshots/Swagger%20UI.png)

### 2. Creating a Product (POST Request)
Demonstration of successful resource creation with a **201 Created** status.
![POST Method](screenshots/POST.png)

### 3. Data Retrieval (GET Request)
Fetching the list of products currently stored in the application.
![GET Method](screenshots/GET.png)

### 4. H2 Database Verification
Direct view of the `PRODUCTS` table in the H2 console, verifying data persistence.
![H2 Console](screenshots/H2%20Console.png)

### 5. Custom Exception Handling (404 Not Found)
System response returning a custom error message when a product is not found.
![404 Error](screenshots/404%20Not%20Found.png)