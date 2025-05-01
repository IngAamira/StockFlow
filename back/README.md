## Inventory Application
Inventory is an inventory management application developed with Spring Boot. It provides features to manage inventory, track products, and perform various inventory-related operations.

## Table of Contents
1. [Prerequisites](#prerequisites)
2. [Installation Instructions](#installation-instructions)
3. [Project Structure](#project-structure)
4. [Category Controller Endpoints](#category-controller-endpoints)
   - [Get All Categories](#get-all-categories)
   - [Get Category by ID](#get-category-by-id)
   - [Create a New Category](#create-a-new-category)
   - [Update a Category by ID](#update-a-category-by-id)
   - [Delete a Category by ID](#delete-a-category-by-id)
   - [Export Categories to Excel File](#export-categories-to-excel-file)
5. [Product Controller Endpoints](#product-controller-endpoints)
   - [Create a New Product](#create-a-new-product)
   - [Get Product by ID](#get-product-by-id)
   - [Get Products by Name](#get-products-by-name)
   - [Delete Product by ID](#delete-product-by-id)
   - [Get All Products](#get-all-products)
   - [Update Product by ID](#update-product-by-id)
   - [Export Products to Excel File](#export-products-to-excel-file)
6. [Contributing](#contributing)
7. [License](#license)
8. [Contact Information](#contact-information)

## Prerequisites
Make sure you have the following technologies installed:
- Spring Boot 3.0.4
- Spring Framework 6.0.6
- JDK 17.0.2 (build 17.0.2+8)
- Jakarta EE 9
- MySQL 8.0.35

## Installation Instructions
1. Clone the repository:
    ```bash
    git clone git@github.com:IngAamira/inventory-bk.git
    ```

2. Configure the database properties in `application.properties`:
   **Note:** Database:
   The application uses MySQL as its database. Make sure you create the database and set the correct properties in `application.properties`.

    ```properties
    spring.datasource.url=jdbc:mysql://localhost/your_db_name?allowPublicKeyRetrieval=true&useSSL=false&useLegacyDatetimeCode=false&serverTimezone=UTC
    spring.datasource.username=root
    spring.datasource.password=your_password
    spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
    spring.jpa.database-platform=org.hibernate.dialect.MySQL57Dialect
    spring.jpa.hibernate.ddl-auto=update
    logging.level.org.hibernate.SQL=debug
    spring.servlet.multipart.max-file-size=3MB
    spring.servlet.multipart.max-request-size=3MB
    ```

3. Run the application:
    ```bash
    ./gradlew bootRun
    ```

## Project Structure
```bash
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
```

## Category Controller Endpoints

### Get All Categories
- GET `/api/v1/categories`

```json
{
   "metadata": [
      {
         "date": "Respuesta exitosa",
         "code": "00",
         "type": "Respuesta ok"
      }
   ],
   "categoryResponse": {
      "category": [
         {
            "id": 1,
            "name": "prueba",
            "description": "test ok"
         }
      ]
   }
}
```

### Get Category by ID
- GET `/api/v1/categories/{id}`

```json
{
   "metadata": [
      {
         "date": "Respuesta exitosa",
         "code": "00",
         "type": "Respuesta ok"
      }
   ],
   "categoryResponse": {
      "category": {
         "id": 1,
         "name": "prueba",
         "description": "test ok"
      }
   }
}
```

### Create a New Category
- POST /api/v1/categories

Body:
```json
   {
   "name": "nueva_categoria",
   "description": "Descripción de la nueva categoría"
   }
```

Request:
```json
{
   "metadata": [
      {
         "date": "Respuesta exitosa",
         "code": "00",
         "type": "Respuesta ok"
      }
   ],
   "categoryResponse": {
      "category": {
         "id": 2,
         "name": "nueva_categoria",
         "description": "Descripción de la nueva categoría"
      }
   }
}
```

### Update a Category by ID
- PUT /api/v1/categories/{id}

Body:
```json
   {
   "name": "categoria_actualizada",
   "description": "Descripción actualizada"
   }
```

Request:
```json
{
   "metadata": [
      {
         "date": "Respuesta exitosa",
         "code": "00",
         "type": "Respuesta ok"
      }
   ],
   "categoryResponse": {
      "category": {
         "id": 2,
         "name": "categoria_actualizada",
         "description": "Descripción actualizada"
      }
   }
}
```

### Delete a Category by ID
- DELETE /api/v1/categories/{id}

Request:
```json
{
   "metadata": [
      {
         "date": "Respuesta exitosa",
         "code": "00",
         "type": "Respuesta ok"
      }
   ],
   "categoryResponse": {
      "message": "Categoría eliminada correctamente"
   }
}
```

### Export Categories to Excel File
- GET /api/v1/categories/export/excel

## Product Controller Endpoints

### Create a New Product
- POST /api/v1/products

Request Parameters:
- **picture:** Archivo (Imagen del producto)
- **name:** String (Nombre del producto)
- **price:** Integer (Precio del producto)
- **account:** Integer (Cantidad disponible)
- **categoryId:** Long (ID de la categoría a la que pertenece el producto)

Request:
```json
{
   "metadata": [
      {
         "date": "Respuesta exitosa",
         "code": "00",
         "type": "Respuesta ok"
      }
   ],
   "productResponse": {
      "product": {
         "id": 1,
         "name": "Nuevo Producto",
         "price": 30,
         "account": 20,
         "category": {
            "id": 1,
            "name": "prueba",
            "description": "test ok"
         }
      }
   }
}
```

### Get Product by ID
- GET /api/v1/products/{id}

Request:
```json
{
   "metadata": [
      {
         "date": "Respuesta exitosa",
         "code": "00",
         "type": "Respuesta ok"
      }
   ],
   "productResponse": {
      "product": {
         "id": 1,
         "name": "Nuevo Producto",
         "price": 30,
         "account": 20,
         "category": {
            "id": 1,
            "name": "prueba",
            "description": "test ok"
         }
      }
   }
}
```

### Get Products by Name
- GET /api/v1/products/filter/{name}

Request:
```json
{
   "metadata": [
      {
         "date": "Respuesta exitosa",
         "code": "00",
         "type": "Respuesta ok"
      }
   ],
   "productResponse": {
      "products": [
         {
            "id": 1,
            "name": "Nuevo Producto",
            "price": 30,
            "account": 20,
            "category": {
               "id": 1,
               "name": "prueba",
               "description": "test ok"
            }
         }
      ]
   }
}
```

### Delete Product by ID
- DELETE /api/v1/products/{id}

Request:
```json
{
   "metadata": [
      {
         "date": "Respuesta exitosa",
         "code": "00",
         "type": "Respuesta ok"
      }
   ],
   "productResponse": {
      "message": "Producto eliminado correctamente"
   }
}
```

### Get All Products
- GET /api/v1/products

Request:
```json
{
   "metadata": [
      {
         "date": "Respuesta exitosa",
         "code": "00",
         "type": "Respuesta ok"
      }
   ],
   "productResponse": {
      "products": [
         {
            "id": 1,
            "name": "Nuevo Producto",
            "price": 30,
            "account": 20,
            "category": {
               "id": 1,
               "name": "prueba",
               "description": "test ok"
            }
         }
      ]
   }
}
```

### Update Product by ID
- PUT /api/v1/products/{id}

Request Parameters:
- **picture:** Archivo (Imagen del producto)
- **name:** String (Nombre del producto)
- **price:** Integer (Precio del producto)
- **account:** Integer (Cantidad disponible)
- **categoryId:** Long (ID de la categoría a la que pertenece el producto)

Request:
```json
{
   "metadata": [
      {
         "date": "Respuesta exitosa",
         "code": "00",
         "type": "Respuesta ok"
      }
   ],
   "productResponse": {
      "product": {
         "id": 1,
         "name": "Producto Actualizado",
         "price": 40,
         "account": 30,
         "category": {
            "id": 3,
            "name": "Nueva Categoría",
            "description": "Descripción de la nueva categoría"
         }
      }
   }
}
```

### Export Products to Excel File
- GET /api/v1/products/export/excel

### Contributing
To contribute to this project:

* Fork the repository.
* Create a new branch: `git checkout -b feature/new_feature`.
* Make your changes and commit: `git commit -m "Add new_feature"`.
* Push to your branch: `git push origin feature/new_feature`.
* Open a pull request.

### License
This project is licensed under the [GNU GENERAL PUBLIC LICENSE]. See the LICENSE.md file for more details.

## Contact Information
For questions or feedback, contact me [IngAamira](https://ingaamira.github.io/)