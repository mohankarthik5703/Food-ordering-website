package com.foodorder.onlinefoodorderingsystem.repository;

import com.foodorder.onlinefoodorderingsystem.model.MenuItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MenuItemRepository extends JpaRepository<MenuItem, Long> {}
