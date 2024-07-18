package org.example.product_data.repositories;

import org.example.product_data.model.Product;
import org.springframework.stereotype.Repository;

import javax.persistence.Entity;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Repository(value = "productRepo")
public class ProductRepo implements IProductRepo{
    private static List<Product> products = new ArrayList<>();

    @Override
    public List<Product> findAll() {
        List<Product> products = BaseRepo.entityManager.createQuery("select p from Product p",Product.class).getResultList();
        return products;
    }

    @Override
    public void save(Product product) {
        EntityTransaction transaction = BaseRepo.entityManager.getTransaction();
        transaction.begin();
        BaseRepo.entityManager.persist(product);
        transaction.commit();
    }

    @Override
    public Product findById(int id) {
        return BaseRepo.entityManager.find(Product.class,id);
    }

    @Override
    public void update(int id, Product product) {
        EntityTransaction transaction = BaseRepo.entityManager.getTransaction();
        transaction.begin();
        BaseRepo.entityManager.merge(product);
        transaction.commit();
    }

    @Override
    public List<Product> searchProduct(String nameProduct) {
        TypedQuery<Product> query = BaseRepo.entityManager.createQuery("select p from Product p where p.nameProduct = :nameProduct",Product.class);
        query.setParameter("nameProduct",nameProduct);
        List<Product> products = query.getResultList();
        return products;

    }

    @Override
    public void remove(int id) {
        EntityTransaction transaction = BaseRepo.entityManager.getTransaction();
        transaction.begin();
        Product product = BaseRepo.entityManager.find(Product.class,id);
        if (product != null){
            BaseRepo.entityManager.remove(product);
        }
        transaction.commit();
    }
}
