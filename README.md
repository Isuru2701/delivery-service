# Delivery microservice

---
## Database

```mysql

CREATE DATABASE Delivery;

CREATE TABLE delivery_table (
    user_id INT NOT NULL,
    product_id INT NOT NULL,
    price FLOAT NOT NULL,
    quantity FLOAT NOT NULL,
    address VARCHAR(100) ,
    datetime DATE NOT NULL,
    status VARCHAR(50),
    PRIMARY KEY (user_id, product_id) 
);

```