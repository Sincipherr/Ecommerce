package com.geekster.WeeklyTest_Ecommerce.controller;

import com.geekster.WeeklyTest_Ecommerce.model.Order;
import com.geekster.WeeklyTest_Ecommerce.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class OrderController {
    @Autowired
    OrderService os;

    @PostMapping(value = "/createOrders")
    public void addOrders(@RequestBody Order order){
        os.addOrders(order);
    }

    @GetMapping(value = "/getOrderById/{orderId}")
    public List<Order> getOrderById(@PathVariable Integer orderId){
        return os.getOrderById(orderId);
    }

}
