# Delivery microservice

---
## Database

```mysql

CREATE DATABASE delivery;

CREATE TABLE delivery (
    id INT AUTO_INCREMENT PRIMARY KEY,
  user_id INT NOT NULL,
  product_id INT NOT NULL,
  quantity FLOAT NOT NULL,
  address VARCHAR(255) ,
  datetime DATE NOT NULL,
  status VARCHAR(10)
                      );
```