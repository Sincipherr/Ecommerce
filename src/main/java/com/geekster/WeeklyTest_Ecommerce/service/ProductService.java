package com.geekster.WeeklyTest_Ecommerce.service;

import com.geekster.WeeklyTest_Ecommerce.Repository.IProductRepo;
import com.geekster.WeeklyTest_Ecommerce.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    IProductRepo pr;

    public void addProducts(Product product) {
        pr.save(product);
    }

    public Iterable<Product> getAll() {
       return pr.findAll();
    }

    public List<Product> getByCategory(String category) {
       return pr.findByCategory(category);
    }

    public void deleteProduct(Integer productId) {
        pr.deleteById(productId);
    }
}
