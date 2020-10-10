package edu.wctc.wholesale.service;

import edu.wctc.wholesale.entity.Product;
import edu.wctc.wholesale.repo.ProductRepository;
import org.apache.velocity.exception.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;

public class ProductServiceimpl implements ProductService{
    @Autowired
    private ProductRepository productRepository;

    @Override
    // New for v2
    public Product getProduct(int productId) throws ResourceNotFoundException {
        return productRepository.findById(productId).orElseThrow(
                () -> new ResourceNotFoundException("Product", "id", productId));
    }
}
