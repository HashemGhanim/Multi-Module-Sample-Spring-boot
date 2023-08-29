package com.products.productsrepository.repository;

import com.products.productsmodel.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ProductRepo extends JpaRepository<Product , Integer> {
}
