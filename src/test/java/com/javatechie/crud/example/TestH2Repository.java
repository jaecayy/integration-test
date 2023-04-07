package com.javatechie.crud.example;

import com.integration.crud.example.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TestH2Repository extends JpaRepository<Product,Integer> {
}
