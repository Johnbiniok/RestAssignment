package edu.wctc.wholesale.service;

import edu.wctc.wholesale.entity.Customer;
import edu.wctc.wholesale.repo.CustomerRepository;
import edu.wctc.wholesale.service.CustomerService;
import org.apache.velocity.exception.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerRepository customerRepository;

    /*@Override
    public Customer getCustomer(String name) {
        return memberRepository.findById(name);
    }*/

    @Override
    // New for v2
    public Customer getCustomer(int customerId) throws ResourceNotFoundException {
        return customerRepository.findById(customerId).orElseThrow(
                () -> new ResourceNotFoundException("Customer", "id", customerId));
    }


    /*@Override
    public Customer getCustomer(String email) {
        return null;
    }

    @Override
    public Customer getCustomer(int customerId) throws ResourceNotFoundException {
        return null;
    }*/
}

