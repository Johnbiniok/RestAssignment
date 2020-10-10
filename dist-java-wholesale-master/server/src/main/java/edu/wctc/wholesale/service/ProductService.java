package edu.wctc.wholesale.service;

import edu.wctc.wholesale.entity.Product;
import org.apache.velocity.exception.ResourceNotFoundException;

public interface ProductService {
    Product getProduct(int memberId) throws ResourceNotFoundException;
}
