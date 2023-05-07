package com.geekster.WeeklyTest_Ecommerce.Repository;

import com.geekster.WeeklyTest_Ecommerce.model.Order;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IOrderRepo extends CrudRepository<Order,Integer> {
    public List<Order> findByOrderId(Integer orderId);
}
