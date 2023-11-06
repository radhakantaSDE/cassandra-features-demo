package com.learn.app.controller;

import com.learn.app.model.entity.ProductEntity;
import com.learn.app.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping("product")
    public ResponseEntity<String> saveOrder(@RequestBody ProductEntity product) {

        try {
            return ResponseEntity.ok(productService.saveProduct(product));
        }catch (Exception ex) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }
}
