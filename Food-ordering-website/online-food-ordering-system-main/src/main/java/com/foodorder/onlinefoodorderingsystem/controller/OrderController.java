package com.foodorder.onlinefoodorderingsystem.controller;

import com.foodorder.onlinefoodorderingsystem.model.Order;
import com.foodorder.onlinefoodorderingsystem.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/order")
@CrossOrigin(origins = "*")
public class OrderController {

    @Autowired
    private OrderRepository orderRepo;

    @PostMapping
    public ResponseEntity<String> placeOrder(@RequestBody Order order) {
        orderRepo.save(order);
        return ResponseEntity.ok("Order placed successfully");
    }
}
