# Shopping Cart Maven Project

## Overview

The Shopping Cart Maven Project is a Java-based application that simulates a simple e-commerce shopping cart. It provides functionality for managing users, products, and shopping carts, including operations like adding items to a cart, removing items, applying promo codes, and checking out.

The application uses a Swing-based UI for interaction and leverages a MySQL database for persistent storage of products, users, and cart items.

---

## Features

- **Cart Management**: 
  - Add products to the cart.
  - Remove products from the cart.
  - View cart items with a visually engaging ASCII representation.

- **Product Management**:
  - Add new products to the inventory.
  - Retrieve all available products.

- **User Management**:
  - Add new users.
  - Retrieve user information by ID.

- **Promotions**:
  - Apply promo codes for discounts (`DISCOUNT10`, `DISCOUNT20`).

- **Checkout**:
  - Calculate total price with and without promo codes.

- **Swing UI**:
  - Interactive, user-friendly Swing-based console with dynamic input and visual feedback.

---

## Architecture

The project is structured into multiple packages for modular design:

1. **`com.shopping.api`**:
   - Contains `CartController` to manage cart-related actions.

2. **`com.shopping.models`**:
   - Includes `Cart`, `CartItem`, `Product`, and `User` classes representing the core data models.

3. **`com.shopping.repository`**:
   - Data access layer for interacting with the MySQL database.

4. **`com.shopping.service`**:
   - Business logic for cart operations and promo code management.

5. **`com.shopping.server`**:
   - Main entry point (`ShoppingCartServer`) and database connection management.

6. **`com.shopping.ui`**:
   - `SwingConsole` provides a Swing-based interactive UI for user interaction.

---

## Technologies Used

- **Java 20**: Core language used for development.
- **Maven**: Build automation tool.
- **Swing**: UI framework for interactive console-based interface.
- **MySQL**: Relational database for persistent storage.
- **JUnit**: For testing.

---

## Prerequisites

1. **Java 20** or later installed on your machine.
2. **Maven** installed and configured.
3. **MySQL** database running locally:
   - Database name: `shopping_cart`
   - Username: `root`
   - Password: `Reeshu@24`

---

## Setup and Installation

1. **Clone the Repository**:
   ```bash
   git clone git@github.com:your-username/ShoppingCartMavenProject.git
   cd ShoppingCartMavenProject
   ```

2. **Create the MySQL Database**:
   ```sql
   CREATE DATABASE shopping_cart;
   USE shopping_cart;

   CREATE TABLE users (
       id INT PRIMARY KEY,
       name VARCHAR(100)
   );

   CREATE TABLE products (
       id INT AUTO_INCREMENT PRIMARY KEY,
       name VARCHAR(100),
       price DOUBLE,
       category VARCHAR(50)
   );

   CREATE TABLE cart_items (
       user_id INT,
       product_id INT,
       quantity INT,
       PRIMARY KEY (user_id, product_id),
       FOREIGN KEY (user_id) REFERENCES users(id),
       FOREIGN KEY (product_id) REFERENCES products(id)
   );
   ```

3. **Build the Project**:
   Run Maven to build the project:
   ```bash
   mvn clean install
   ```

4. **Run the Application**:
   Execute the packaged JAR file:
   ```bash
   java -jar target/shopping-cart-1.0-SNAPSHOT-jar-with-dependencies.jar
   ```

---

## Usage

1. **Main Menu**:
   - Choose options to manage carts, products, or users.

2. **Cart Operations**:
   - Add, remove, view cart items, or proceed to checkout.

3. **Product Management**:
   - Add new products by specifying their name, price, and category.

4. **User Management**:
   - Add a new user by providing an ID and name.

---

## Promo Codes

- **DISCOUNT10**: 10% off.
- **DISCOUNT20**: 20% off.

---

## File Structure

```
src/main/java/com/shopping/
├── api/
│   └── CartController.java
├── models/
│   ├── Cart.java
│   ├── CartItem.java
│   ├── Product.java
│   └── User.java
├── repository/
│   ├── CartRepository.java
│   ├── ProductRepository.java
│   └── UserRepository.java
├── server/
│   ├── DatabaseConnection.java
│   └── ShoppingCartServer.java
├── service/
│   ├── PromoCodeService.java
│   └── ShoppingCartService.java
└── ui/
    └── SwingConsole.java
```

---

## Contributing

1. Fork the repository.
2. Create a new feature branch:
   ```bash
   git checkout -b feature-name
   ```
3. Commit your changes:
   ```bash
   git commit -m "Added feature-name"
   ```
4. Push to the branch:
   ```bash
   git push origin feature-name
   ```
5. Create a pull request.

---

## License

This project is licensed under the [MIT License](LICENSE).

---

## Acknowledgments

- ASCII Art for enhancing the visual experience.
- Java Swing for the UI.
- MySQL for database management.

Feel free to use, modify, and contribute! 🎉

