# JSP and Spring MVC CRM Platform

## Overview

This Spring MVC application is designed to manage customer relationships. It provides a simple interface for performing basic CRUD (Create, Read, Update, Delete) operations on customer records. The application allows users to add new customers, view a list of existing customers, update customer details , search , and delete customers.

## Features

- **`Create`**: Users can add new customer records.
- **`Read`**: Users can view a list of all customers.
- **`Update`**: Users can edit existing customer information.
- **`Delete`**: Users can remove customers from the system.
- **`Search`**: Users can search for customers by their name.

## Technologies Used

- **`Spring MVC`**: For the MVC framework.
- **`Hibernate`**: For ORM (Object-Relational Mapping) and database interactions.
- **`MySQL`**: As the database management system.
- **`JSP (JavaServer Pages)`**: For the view layer.
- **`JSTL (JavaServer Pages Standard Tag Library)`**: For simplifying JSP coding.
- **`C3P0`**: For connection pooling.
- **`Aspect-Oriented Programming (AOP)`**: For separating cross-cutting concerns, such as logging and transaction management.

## AOP Details

**`Aspect-Oriented Programming (AOP)`**: AOP is used to handle cross-cutting concerns like logging, security, and transaction management. It allows you to define these concerns in separate aspects and apply them to various parts of your application. In this project, AOP is configured to enable the automatic application of aspects.

## Project Structure

```

SpringJSPAOP
│
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com
│   │   │       └── luv2code
│   │   │           └── springdemo
│   │   │               ├── controller
|   |   |               |   └── CustomerController
│   │   │               ├── service
│   │   │               |   └── CustomerService
│   │   │               |   └── CustomerServiceImpl
│   │   │               ├── dao
│   │   │               |   └── CustomerDAO
│   │   │               |   └── CustomerDAOImpl
│   │   │               ├── entity
│   │   │                   └── Customer
│   │   └── resources
│   │   │   ├── database.sql
|   |   └── webapp
|   |       └── index.jsp
│   │       ├── META-INF
|   |       |   └── MANIFEST.MF
|   |       ├── WEB-INF
|   |       |   └── web.xml
|   |       |   └── spring-mvc-crud-demo-servlet.xml
|   |       |   ├── view
|   |       |   |   └── customer-form.jsp
|   |       |   |   └── list-customers.jsp
|   |       ├── resources
|   |           ├── css
|   |               └── add-customer-style.css
|   |               └── style.css
└── pom.xml

```

## Installation

- **`Clone the repository`**:
  - git clone https://github.com/ahmedelazab1220/SpringJSPAOP
  - you can also download Zip file and extract.
- **`Set up the MySQL database`**:
  - you can copy sql database from this link `https://github.com/ahmedelazab1220/SpringJSPAOP/blob/main/src/main/resources/database.sql` and set in your device.
- **`Build and run the application`**:
  - click right click on project and run on server `Tomcat`.

## License

This project is licensed under the Apache License 2.0 - see the <a href = "https://github.com/ahmedelazab1220/SpringJSPAOP/blob/main/LICENSE"> LICENSE </a> file for details.

## Conclusion

The CRM project showcases the effective use of the Spring Framework, JSP, and AOP to build a comprehensive customer management system. By leveraging these technologies, the project delivers a well-structured application with robust customer data management and a dynamic user interface. This solution demonstrates a practical approach to combining traditional Java technologies to create a scalable and maintainable web application.
