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

    @Column(name = "product_name")
    private int productName;

    @Column(name = "product_type")
    private int productType;


    @Column(name = "price")
    private float price;

    @Column(name = "quantity")
    private float quantity;

    @Column(name = "address")
    private float address;

    @Column(name = "datetime")
    @Temporal(TemporalType.TIMESTAMP)
    private Timestamp datetime;

    @Column(name = "status")
    private String status;


}
