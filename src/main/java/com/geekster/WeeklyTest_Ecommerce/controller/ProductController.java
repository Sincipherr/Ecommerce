package com.geekster.WeeklyTest_Ecommerce.controller;

import com.geekster.WeeklyTest_Ecommerce.model.Product;
import com.geekster.WeeklyTest_Ecommerce.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    ProductService ps;

    @PostMapping(value = "/createProducts")
    public void addProducts(@RequestBody Product product){
        ps.addProducts(product);
    }

    @GetMapping(value = "/getAllProducts")
    public Iterable<Product> getAll(){
        return ps.getAll();
    }

    @GetMapping(value = "/getProductByCategory/{category}")
    public List<Product> getByCategory(@PathVariable String category){
        return ps.getByCategory(category);
    }

    @DeleteMapping(value = "/deleteById/{productId}")
    public void deleteProduct(@PathVariable Integer productId){
        ps.deleteProduct(productId);
    }
}
