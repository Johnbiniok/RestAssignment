package edu.wctc.wholesale.service;

import edu.wctc.wholesale.entity.Customer;
import org.apache.velocity.exception.ResourceNotFoundException;

public interface CustomerService {
    /*Customer getCustomer(String email);*/

    Customer getCustomer(int customerId) throws ResourceNotFoundException;
}
