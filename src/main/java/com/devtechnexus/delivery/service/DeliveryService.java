package com.devtechnexus.delivery.service;

import com.devtechnexus.delivery.model.Delivery;
import com.devtechnexus.delivery.repository.DeliveryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DeliveryService {

    @Autowired
    private DeliveryRepository repository;

    public List<Delivery> getAll() {
        return repository.findAll();
    }

    public Delivery getDeliveryByID(int id) {
        Optional<Delivery> delivery = repository.findById(id);
        return delivery.orElse(null);
    }

    public Delivery createDelivery(Delivery delivery) {
        return repository.save(delivery);
    }

    public Delivery updateDelivery(Delivery delivery) {
        return repository.save(delivery);
    }

    public void deleteDelivery(int id) {
        repository.deleteById(id);
    }
}

