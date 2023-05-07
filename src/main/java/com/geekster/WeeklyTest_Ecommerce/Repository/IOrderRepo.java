package com.geekster.WeeklyTest_Ecommerce.Repository;

import com.geekster.WeeklyTest_Ecommerce.model.Orders;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IOrderRepo extends CrudRepository<Orders,Integer> {
    public List<Orders> findByOrderId(Integer orderId);
}
