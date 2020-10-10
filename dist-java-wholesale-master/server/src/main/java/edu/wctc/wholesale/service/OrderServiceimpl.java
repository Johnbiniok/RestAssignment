package edu.wctc.wholesale.service;

import edu.wctc.wholesale.entity.Order;
import edu.wctc.wholesale.repo.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrderServiceimpl implements OrderService {
    @Autowired
    private OrderRepository orderRepository;

    @Override
    public List<Order> getAllOrders() {
        List<Order> list = new ArrayList<>();
        orderRepository.findAll().forEach(list::add);
        return list;
    }

    /*@Override
    public Order getOrder(int id) throws ResourceNotFoundException {
        return orderRepository.findById(id).orElseThrow(
                () -> new ResourceNotFoundException("Order", "id", id));
    }*/

    @Override
    public void save(Order order) {
        orderRepository.save(order);
    }
}
