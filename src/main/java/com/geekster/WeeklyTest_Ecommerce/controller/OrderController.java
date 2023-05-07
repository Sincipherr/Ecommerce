package com.geekster.WeeklyTest_Ecommerce.controller;

import com.geekster.WeeklyTest_Ecommerce.model.Orders;
import com.geekster.WeeklyTest_Ecommerce.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class OrderController {
    @Autowired
    OrderService orderService;

    @PostMapping(value = "/createOrders")
    public void addOrders(@RequestBody Orders order){
        orderService.addOrders(order);
    }

    @GetMapping(value = "/getOrderById/{orderId}")
    public List<Orders> getOrderById(@PathVariable Integer orderId){
        return orderService.getOrderById(orderId);
    }
}
