
package com.ECommerce.Ecom.service;

import com.ECommerce.Ecom.repos.ProductRepo;
import com.ECommerce.Ecom.model.Product;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    @Autowired
    private ProductRepo productRepository;

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public Product createProduct(Product product) {

        return productRepository.save(product);
    }

    public List<Product> addAllProducts(List<Product> products) {
        return productRepository.saveAll(products);
    }

    public Product updateProduct(Product product) {
        return productRepository.save(product);
    }

    public void deleteProduct(String id) {
        productRepository.deleteById(id);
    }
}
