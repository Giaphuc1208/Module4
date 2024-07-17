package org.example.product_data.service;

import org.example.product_data.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Service
public class ProductService implements IProductService{
    private static Map<Integer, Product> productMap;

    static {
        productMap = new HashMap<>();
        productMap.put(1, new Product(1, "Milo", "100 calo", "protein", "12/8/2024"));
        productMap.put(2, new Product(2, "TH true milk", "80 calo", "protein", "17/8/2024"));
        productMap.put(3, new Product(3, "Vinamilk", "120 calo", "protein", "20/7/2024"));
        productMap.put(4, new Product(4, "Grow About", "70 calo", "protein", "2/9/2024"));
        productMap.put(5, new Product(5, "Alpha", "150 calo", "protein", "12/4/2025"));
    }

    @Override
    public List<Product> findAll() {
        return new ArrayList<>(productMap.values());
    }

    @Override
    public void save(Product product) {
        productMap.put(product.getIdProduct(), product);
    }

    @Override
    public Product findById(int id) {
        return productMap.get(id);
    }

    @Override
    public void update(int id, Product product) {
        productMap.put(id, product);
    }

    @Override
    public List<Product> searchProduct(String nameProduct) {
        List<Product> productList = new ArrayList<>();
        for (Product product : productMap.values()) {
            if (product.getNameProduct().contains(nameProduct)) {
                productList.add(product);
            }
        }
        return productList;
    }

    @Override
    public void remove(int id) {
        productMap.remove(id);
    }
}
