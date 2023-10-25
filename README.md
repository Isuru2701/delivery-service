# Delivery microservice

---
## Database

```mysql

CREATE DATABASE delivery;

CREATE TABLE delivery (
  user_id INT NOT NULL,
  product_id INT NOT NULL,
  quantity FLOAT NOT NULL,
  address VARCHAR(255) ,
  datetime DATE NOT NULL,
  status VARCHAR(10),
  PRIMARY KEY (user_id, product_id)
);
```