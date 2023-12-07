package com.capstone1.repository;

import org.springframework.data.jpa.repository.*;
import org.springframework.transaction.annotation.Transactional;

import com.capstone1.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

    Product findByName(String name);

    @Modifying
    @Transactional
    @Query(value = "ALTER TABLE products AUTO_INCREMENT = 1001", nativeQuery = true)
    void alterAutoIncrementValue();
}
