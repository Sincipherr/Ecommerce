package com.geekster.WeeklyTest_Ecommerce.Repository;

import com.geekster.WeeklyTest_Ecommerce.model.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IProductRepo extends CrudRepository<Product,Integer> {
    public List<Product> findByCategory(String category);
}
