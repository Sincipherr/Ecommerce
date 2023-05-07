package com.geekster.WeeklyTest_Ecommerce.service;

import com.geekster.WeeklyTest_Ecommerce.Repository.IOrderRepo;
import com.geekster.WeeklyTest_Ecommerce.model.Orders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {
    @Autowired
    IOrderRepo orderDao;

    public void addOrders(Orders order) {
        orderDao.save(order);
    }

    public List<Orders> getOrderById(Integer orderId) {
        return orderDao.findByOrderId(orderId);
    }
}
