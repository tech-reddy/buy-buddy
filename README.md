��#   b u y - b u d d y 
 
 E-Commerce Backend API (Spring Boot + MySQL)
A robust and scalable e-commerce backend developed using Spring Boot. This project provides RESTful APIs for managing products, users, authentication, orders, and more. It uses MySQL as the database and follows a layered architecture for clean code separation.

🚀 Features
✅ User registration & JWT-based authentication

🛒 Product & category management

🧾 Cart and order processing

🔐 Role-based access control (Admin/User)

📦 Inventory management


🛠️ Tech Stack
Backend: Spring Boot, Spring Security, Spring Data JPA

Database: MySQL

Authentication: JWT (JSON Web Token)

API Design: RESTful

Documentation: Swagger (optional)

⚙️ Setup Instructions
🔧 Prerequisites
Java 17+ (or 11+)

Maven

MySQL Server

Git

1️⃣ Clone the Repository
bash
Copy
Edit
git clone https://github.com/your-username/ecommerce-backend.git
cd ecommerce-backend
2️⃣ Configure MySQL Database
Open MySQL and create a new database:

sql
Copy
Edit
CREATE DATABASE ecommerce_db;
In the project, go to:

css
Copy
Edit
src/main/resources/application.properties
Update the following properties:

properties
Copy
Edit
spring.datasource.url=jdbc:mysql://localhost:3306/ecommerce_db
spring.datasource.username=your_mysql_username
spring.datasource.password=your_mysql_password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL8Dialect

# Optional: Server port
server.port=8080
⚠️ Replace your_mysql_username and your_mysql_password with your actual credentials.

3️⃣ Build and Run the Project
Using Maven:
bash
Copy
Edit
./mvnw spring-boot:run
or

bash
Copy
Edit
mvn clean install
java -jar target/ecommerce-backend-0.0.1-SNAPSHOT.jar
The server will start at:

arduino
Copy
Edit
http://localhost:8080
