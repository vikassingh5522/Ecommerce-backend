


# Ecommerce Backend

A robust and scalable backend for an e-commerce platform, designed to handle user authentication, product management, and order processing.

## Table of Contents

- [Project Overview](#project-overview)
- [Project Structure](#project-structure)
- [Features](#features)
- [Technologies Used](#technologies-used)
- [Setup Instructions](#setup-instructions)
- [Contributing](#contributing)
- [License](#license)

## Project Overview

This project serves as the backend for an e-commerce application, providing RESTful APIs to manage users, products, and orders. It supports functionalities like user registration, product browsing, and order placement.

## Project Structure

```

ecommerce-backend/
├── src/
│   ├── controllers/       # Business logic for handling requests
│   ├── models/            # Database schemas
│   ├── routes/            # API route definitions
│   ├── services/          # Core services for business logic
│   └── utils/             # Utility functions
├── .gitignore             # Specifies files to be ignored by Git
├── mvnw                   # Maven wrapper for Unix-based systems
├── mvnw.cmd               # Maven wrapper for Windows systems
├── pom.xml                # Project Object Model file for Maven
└── README.md              # Project documentation

````

## Features

- **User Authentication**: Secure login and registration using JWT tokens.
- **Product Management**: CRUD operations for product listings.
- **Order Processing**: Ability to place and manage orders.
- **Error Handling**: Centralized error management for consistent responses.

## Technologies Used

- **Java**: Core programming language
- **Spring Boot**: Framework for building the backend
- **Maven**: Dependency management and build automation
- **MySQL**: Relational database for data storage
- **JWT**: JSON Web Tokens for authentication

## Setup Instructions

### Prerequisites

- Java 11 or higher
- Maven 3.6 or higher
- MySQL 5.7 or higher

### Installation Steps

1. Clone the repository:

   ```bash
   git clone https://github.com/vikassingh5522/Ecommerce-backend.git
   cd Ecommerce-backend
````

2. Configure your database connection in `src/main/resources/application.properties`:

   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/ecommerce
   spring.datasource.username=root
   spring.datasource.password=yourpassword
   ```
 

3. Build and run the application:

   ```bash
   mvn clean install
   mvn spring-boot:run
   ```

4. The application will start on `http://localhost:8080`.

## Contributing

Contributions are welcome! Please fork the repository, create a new branch, and submit a pull request with your proposed changes.


<img width="1905" height="1021" alt="Screenshot 2025-10-01 150939" src="https://github.com/user-attachments/assets/30ddf43f-3dc1-41e0-aef4-747298be4058" />
<img width="1861" height="884" alt="Screenshot 2025-10-01 144010" src="https://github.com/user-attachments/assets/14eb6e42-952b-469e-81f0-dfe979cf3c26" />
<img width="1902" height="1026" alt="Screenshot 2025-10-01 143933" src="https://github.com/user-attachments/assets/18d96b20-5da3-4d20-b10d-111caca27707" />







