package com.devtechnexus.delivery.model;

import java.sql.Timestamp;

@Data
@Entity
@Table(name="delivery_table")

public class Delivery {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "user_id")
    private int userId;

    @Column(name = "user_name")
    private int userName;

    @Column(name = "product_id")
    private int productId;

    @Column(name = "price")
    private float price;

    @Column(name = "quantity")
    private float quantity;

    @Column(name = "address")
    private String address;

    @Column(name = "datetime")
    @Temporal(TemporalType.TIMESTAMP)
    private Timestamp datetime;

    @Column(name = "status")
    private String status;


}
