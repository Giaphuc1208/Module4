package org.example.product_data.repositories;

import org.example.product_data.model.Product;

import java.util.List;

public interface IProductRepo {
    List<Product> findAll();
    void save(Product product);
    Product findById(int id);
    void update(int id,Product product);
    List<Product> searchProduct(String nameProduct);
    void remove(int id);
}
