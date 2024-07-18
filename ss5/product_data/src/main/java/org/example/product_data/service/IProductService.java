package org.example.product_data.service;

import org.example.product_data.model.Product;
import org.springframework.stereotype.Service;

import java.util.List;

public interface IProductService {
    List<Product> findAll();
    void save(Product product);
    Product findById(int id);
    void update(int id,Product product);
    List<Product> searchProduct(String nameProduct);
    void remove(int id);
}
