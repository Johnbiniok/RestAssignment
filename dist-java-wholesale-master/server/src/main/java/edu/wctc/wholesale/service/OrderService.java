package edu.wctc.wholesale.service;

import edu.wctc.wholesale.entity.Order;

import java.util.List;

public interface OrderService {
    List<Order> getAllOrders();

    //Order getOrder(int id);

    void save(Order order);
}
