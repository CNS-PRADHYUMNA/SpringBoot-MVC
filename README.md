# 🛍️ E-Commerce Product Manager

A sleek, full-stack web application for managing e-commerce products, built using **Spring Boot** for the backend and **HTML/CSS/JS** for the frontend. It allows you to perform CRUD operations (Create, Read, Update, Delete) on products with an intuitive, animated UI.

---

## 🚀 Features

- ✅ Add new products
- 📝 Inline editing with update animations
- ❌ Delete products with confirmation prompts
- 📋 View all products in a dynamic table
- ⚠️ Input validation for all fields
- 🔔 Toast notifications and UI feedback
- 💅 Clean, modern UI with subtle animations

---

## 🧱 Tech Stack

### 🎨 Frontend
- HTML5 + CSS3
- JavaScript (Vanilla)
- Animations using CSS Keyframes
- Responsive design with user-friendly interaction

### ⚙️ Backend
- Java 11+ (works with JDK 21 as well)
- Spring Boot
- Spring Web
- Spring Data JPA
- H2 Database (in-memory)
- Lombok

---

## 📁 Project Structure

```
ecom-website/
│
├── backend/
│   ├── controller/
│   │   └── ProductController.java
│   ├── model/
│   │   └── Product.java
│   ├── service/
│   │   └── ProductService.java
│   ├── repository/
│   │   └── ProductRepository.java
│   └── resources/
│       ├── application.properties
│       └── data.sql (optional: for sample data)
│
├── frontend/
│   └── index.html
```

---

## 🧪 Sample `Product` JSON Format

```json
{
  "id": "P001",
  "name": "Bluetooth Headphones",
  "price": 100.0,
  "description": "Over-ear Bluetooth headphones with noise cancellation",
  "category": "Audio"
}
```

---

## 💾 Sample `data.sql`

```sql
INSERT INTO product (id, name, price, description, category) VALUES
('P001', 'Bluetooth Headphones', 100.0, 'Over-ear Bluetooth headphones with noise cancellation', 'Audio'),
('P002', 'Smartphone', 300.0, 'Latest Android smartphone with AMOLED display', 'Electronics'),
('P003', 'Laptop', 800.0, '15.6 inch laptop with 16GB RAM', 'Computers');
```

---

## 🛠️ How to Run

### Backend (Spring Boot)

1. Make sure you have Maven and Java installed.
2. Navigate to the project directory.
3. Run:

```bash
mvn spring-boot:run
```

By default, the backend will run on: `http://localhost:8080/api`

---

### Frontend (HTML/JS)

1. Open `index.html` in your browser.
2. Make sure your backend is running.
3. You can now:
   - Add products
   - Edit them inline
   - Delete products
   - See toast messages on every action

---

## 📬 API Endpoints

| Method | Endpoint              | Description           |
|--------|-----------------------|-----------------------|
| GET    | `/api/products`       | Get all products      |
| POST   | `/api/product`        | Add a product         |
| POST   | `/api/products`       | Add multiple products |
| PUT    | `/api/product/{id}`   | Update a product      |
| DELETE | `/api/product/{id}`   | Delete a product      |

---


