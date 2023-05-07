package com.geekster.WeeklyTest_Ecommerce.service;

import com.geekster.WeeklyTest_Ecommerce.Repository.IProductRepo;
import com.geekster.WeeklyTest_Ecommerce.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    IProductRepo productDao;

    public void addProducts(Product product) {
        productDao.save(product);
    }

    public Iterable<Product> getAll() {
        return productDao.findAll();
    }

    public List<Product> getByCategory(String category) {
        return productDao.findByCategory(category);
    }

    public void deleteProduct(Integer productId) {
        productDao.deleteById(productId);
    }
}
