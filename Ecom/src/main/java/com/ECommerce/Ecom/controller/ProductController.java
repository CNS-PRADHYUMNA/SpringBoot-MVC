package com.ECommerce.Ecom.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ECommerce.Ecom.model.Product;
import com.ECommerce.Ecom.service.ProductService;;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class ProductController {
    @Autowired
    private ProductService service;

    @GetMapping("/products")
    public List<Product> getProducts() {
        // This method should return a list of products.
        // For now, it returns an empty list.
        return service.getAllProducts();
    }

    @PostMapping("/product")
    public Product createProduct(@RequestBody Product product) {
        if (product.getId() == null || product.getId().isEmpty()) {
            return null; // ID is required for product creation
        }
        return service.createProduct(product);
    }

    @PostMapping("/products")
    public List<Product> createProducts(@RequestBody List<Product> products) {
        return service.addAllProducts(products);
    }

    @PutMapping("/product/{id}")
    public Product updateProduct(@PathVariable String id, @RequestBody Product product) {
        // This method should update an existing product.
        // For now, it returns the product as is.
        product.setId(id);
        return service.updateProduct(product);
    }

    @DeleteMapping("/product/{id}")
    public void deleteProduct(@PathVariable String id) {
        service.deleteProduct(id);
    }
}
