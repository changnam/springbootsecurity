package com.honsoft.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.honsoft.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
