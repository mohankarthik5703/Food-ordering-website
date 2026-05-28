package com.foodorder.onlinefoodorderingsystem.controller;

import com.foodorder.onlinefoodorderingsystem.model.MenuItem;
import com.foodorder.onlinefoodorderingsystem.repository.MenuItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/menu")
@CrossOrigin(origins = "*")
public class MenuController {

    @Autowired
    private MenuItemRepository repo;

    @PostMapping
    public MenuItem addItem(@RequestBody MenuItem item) {
        return repo.save(item);
    }

    @GetMapping
    public List<MenuItem> getAll() {
        return repo.findAll();
    }
}
