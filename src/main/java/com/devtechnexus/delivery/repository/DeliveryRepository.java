package com.devtechnexus.delivery.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devtechnexus.delivery.model.Delivery;

@Repository
public interface DeliveryRepository extends JpaRepository<Delivery,Integer>
{

}
