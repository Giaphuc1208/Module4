package org.example.product_data.service;

import org.example.product_data.model.Product;
import org.example.product_data.repositories.IProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ProductService implements IProductService{
    @Autowired
    private IProductRepo productRepo;
    @Override
    public List<Product> findAll() {
        return productRepo.findAll();
    }

    @Override
    public void save(Product product) {
        productRepo.save(product);
    }

    @Override
    public Product findById(int id) {
        return productRepo.findById(id);
    }

    @Override
    public void update(int id, Product product) {
        productRepo.update(id,product);
    }

    @Override
    public List<Product> searchProduct(String nameProduct) {
        return productRepo.searchProduct(nameProduct);
    }

    @Override
    public void remove(int id) {
        productRepo.remove(id);
    }
}
