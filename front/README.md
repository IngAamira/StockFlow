# Inventory Management System
This is an **Inventory Management System** built with **Angular**. The application allows users to manage categories, products, and view dashboards with charts. It integrates with **Keycloak** for authentication and authorization.

## Project Structure
```bash
/front
├── src
│   ├── app
│   │   ├── modules
│   │   │   ├── category
│   │   │   │   ├── components
│   │   │   │   ├── modules
│   │   │   ├── dashboard
│   │   │   │   ├── components
│   │   │   │   ├── pages
│   │   │   │   ├── routing
│   │   │   │   ├── modules
│   │   │   ├── product
│   │   │   │   ├── components
│   │   │   │   ├── modules
│   │   │   ├── shared
│   │   │   │   ├── components
│   │   │   │   ├── services
│   │   │   │   ├── modules
├── angular.json
├── package.json
├── tsconfig.json
├── README.md
```

## Features
- **Category Management**: Add, edit, delete, and search categories.
- **Product Management**: Add, edit, delete, and upload product images.
- **Dashboard**: View product statistics with bar and doughnut charts.
- **Authentication**: Secured with Keycloak.
- **Export to Excel**: Export category data to an Excel file.

## Technologies Used
- **Frontend**: Angular, Angular Material
- **Authentication**: Keycloak
- **Charts**: ng2-charts (Chart.js)
- **Styling**: Angular Material prebuilt themes
- **Backend Integration**: HttpClientModule

## Prerequisites
- **Node.js** (v16 or later)
- **Angular CLI** (v15 or later)
- **Keycloak** server running at `http://localhost:8082/`

## Installation
1. Clone the repository:
   ```bash
   git clone <repository-url>
   cd <repository-folder>
   npm install
   ng serve
   ```

## Key Features Overview

### Category Management
* File: src/app/modules/category/components/category/category.component.ts
* Allows users to:
  * Add, edit, and delete categories.
  * Search categories by name.
  * Export category data to Excel.

### Product Management
* File: src/app/modules/product/new-product/new-product.component.ts
* Allows users to:
  * Add, edit, and delete products.
  * Upload product images.
  * Assign products to categories.

### Dashboard
* File: src/app/modules/dashboard/components/home/home.component.ts
* Displays:
  * Bar and doughnut charts for product statistics.

## License
This project is licensed under the MIT License. See the LICENSE file for details.

## Contact Information
For questions or feedback, contact me [IngAamira](https://ingaamira.github.io/)
