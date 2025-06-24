package com.joy_a_bloom.controller;

import com.joy_a_bloom.model.Product;
import com.joy_a_bloom.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.concurrent.ExecutionException;

@RestController
@RequestMapping("/admin/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping("/add-products")
    public String addMultipleProducts(@RequestBody List<Product> products) throws ExecutionException, InterruptedException {
        return productService.addMultipleProducts(products);
    }
}


