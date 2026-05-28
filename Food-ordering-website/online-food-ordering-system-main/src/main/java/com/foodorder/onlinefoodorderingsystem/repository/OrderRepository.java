package com.foodorder.onlinefoodorderingsystem.repository;

import com.foodorder.onlinefoodorderingsystem.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {}
