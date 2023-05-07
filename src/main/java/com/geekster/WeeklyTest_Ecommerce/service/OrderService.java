package com.geekster.WeeklyTest_Ecommerce.service;

import com.geekster.WeeklyTest_Ecommerce.Repository.IOrderRepo;
import com.geekster.WeeklyTest_Ecommerce.model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {
    @Autowired
    IOrderRepo or;

    public void addOrders(Order order) {
        or.save(order);
    }

    public List<Order> getOrderById(Integer orderId) {
        return  or.findByOrderId(orderId);
    }
}
