# Delivery microservice

---
## Database

```mqsql

CREATE DATABASE Delivery;

CREATE TABLE delivery_table (
    user_id INT(10) NOT NULL,
    user_name VARCHAR(100) ,
    product_id INT(10) ,
    product_name VARCHAR(100) ,
    product_type VARCHAR(100) ,
    price FLOAT NOT NULL,
    quantity FLOAT NOT NULL,
    address VARCHAR(100) ,
    datetime DATE NOT NULL,
    status VARCHAR(50),
    PRIMARY KEY (user_id, product_id) 
);

```