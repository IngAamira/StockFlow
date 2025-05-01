
# StockFlow

## Overview
StockFlow is an Inventory Management System that allows users to manage categories, products, and view dashboards with charts. It is built with **Spring Boot** for the backend and **Angular** for the frontend. The application integrates with **Keycloak** for authentication and supports exporting data to Excel.

## Table of Contents
1. [Features](#features)
2. [Technologies Used](#technologies-used)
3. [Prerequisites](#prerequisites)
4. [Installation Instructions](#installation-instructions)
5. [Endpoints Overview](#endpoints-overview)
6. [Project Structure](#project-structure)
7. [Contributing](#contributing)
8. [License](#license)
9. [Contact Information](#contact-information)

## Features
- **Category Management**: Add, edit, delete, search categories, and export data to Excel.
- **Product Management**: Add, edit, delete products, upload product images, and assign products to categories.
- **Dashboard**: View product statistics with bar and doughnut charts.
- **Authentication**: Secured with Keycloak.
- **Export to Excel**: Export category and product data.

## Technologies Used
- **Backend**: Spring Boot, Spring Framework, MySQL
- **Frontend**: Angular, Angular Material, ng2-charts (Chart.js)
- **Authentication**: Keycloak
- **Build Tools**: Gradle, npm

## Prerequisites
- **Backend**:
  - JDK 17
  - MySQL 8.0.35
  - Gradle
- **Frontend**:
  - Node.js (v16 or later)
  - Angular CLI (v15 or later)
  - Keycloak server running at `http://localhost:8082/`

## Project Structure
```bash
/StockFlow
/back
├── src
│   ├── main
│   │   ├── java
│   │   │   ├── com.ingaamira.inventory
│   │   │   │   ├── controller
│   │   │   │   ├── dao
│   │   │   │   ├── model
│   │   │   │   ├── response
│   │   │   │   ├── service
│   │   │   │   ├── util
│   │   ├── resources
│   │   │   ├── application.properties
│   ├── test
├── .gitignore
├── build.gradle
├── settings.gradle
├── README.md

/front
├── src
│   ├── app
│   │   ├── modules
│   │   │   ├── category
│   │   │   ├── dashboard
│   │   │   ├── product
│   │   │   ├── shared
├── angular.json
├── package.json
├── tsconfig.json
├── README.md
```

## Installation Instructions

### Backend
1. Clone the repository:
    ```bash
    git clone git@github.com:IngAamira/inventory-bk.git
    ```

2. Configure the database in `application.properties`:
    ```properties
    spring.datasource.url=jdbc:mysql://localhost/your_db_name
    spring.datasource.username=root
    spring.datasource.password=your_password
    ```

3. Run the application:
    ```bash
    ./gradlew bootRun
    ```

### Frontend
1. Clone the repository:
    ```bash
    git clone <repository-url>
    cd <repository-folder>
    ```

2. Install dependencies:
    ```bash
    npm install
    ```

3. Run the application:
    ```bash
    ng serve
    ```

## Endpoints Overview

### Category Endpoints
- Get All Categories: `GET /api/v1/categories`
- Get Category by ID: `GET /api/v1/categories/{id}`
- Create Category: `POST /api/v1/categories`
- Update Category: `PUT /api/v1/categories/{id}`
- Delete Category: `DELETE /api/v1/categories/{id}`
- Export Categories to Excel: `GET /api/v1/categories/export/excel`

### Product Endpoints
- Get All Products: `GET /api/v1/products`
- Get Product by ID: `GET /api/v1/products/{id}`
- Create Product: `POST /api/v1/products`
- Update Product: `PUT /api/v1/products/{id}`
- Delete Product: `DELETE /api/v1/products/{id}`
- Export Products to Excel: `GET /api/v1/products/export/excel`

## License
This project is licensed under the GNU General Public License for the backend and the MIT License for the frontend.

## Contact Information
For questions or feedback, contact me [IngAamira](https://ingaamira.github.io/)