package com.geekster.WeeklyTest_Ecommerce.controller;

import com.geekster.WeeklyTest_Ecommerce.model.Product;
import com.geekster.WeeklyTest_Ecommerce.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    ProductService productService;

    @PostMapping(value = "/createProducts")
    public void addProducts(@RequestBody Product product){
        productService.addProducts(product);
    }

    @GetMapping(value = "/getAllProducts")
    public Iterable<Product> getAll(){
        return productService.getAll();
    }

    @GetMapping(value = "/getProductByCategory?category={category}")
    public List<Product> getByCategory(@RequestParam String category){
        return productService.getByCategory(category);
    }

    @DeleteMapping(value = "/deleteById/{productId}")
    public void deleteProduct(@PathVariable Integer productId){
        productService.deleteProduct(productId);
    }
}
