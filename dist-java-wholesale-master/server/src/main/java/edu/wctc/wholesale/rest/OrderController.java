package edu.wctc.wholesale.rest;

import edu.wctc.wholesale.dto.Torder;
import edu.wctc.wholesale.entity.Customer;
import edu.wctc.wholesale.entity.Order;
import edu.wctc.wholesale.service.CustomerService;
import edu.wctc.wholesale.service.OrderService;
import edu.wctc.wholesale.service.ProductService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/orders")
public class OrderController {
    @Autowired
    private OrderService orderService;

    @Autowired
    private ModelMapper modelMapper;

    /*@Autowired
    private CustomerService customerService;

    @Autowired
    private ProductService productService;*/

    private Torder convertToDto(Order o){
        Torder order = modelMapper.map(o, Torder.class);
        return order;
    }

    private Order convertToEntity(Torder o){
        Order order = modelMapper.map(o, Order.class);

        //Customer customer = customerService.getCustomer(order.getCustomer());
        return order;
    }


    @PostMapping("/")
    public Order listOrder(@RequestBody Torder order) {
        Order ord = convertToEntity(order);
        // If client sent an ID, ignore it
        // POST will always create a new event, never update
        ord.setId(0);
        orderService.save(ord);
        return ord;
    }

    @GetMapping("/")
    public List<Order> getAllEvents() {
        return orderService.getAllOrders();
    }


}
