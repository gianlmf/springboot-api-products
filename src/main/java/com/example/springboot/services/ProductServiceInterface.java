package com.example.springboot.services;

import com.example.springboot.models.ProductModel;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface ProductServiceInterface {
    ProductModel save(ProductModel productModel);
    boolean existsByModelUid(String modelUid);
    void delete(ProductModel productModel);
    List<ProductModel> findAll();
    Optional<ProductModel> findById(UUID id);
}
