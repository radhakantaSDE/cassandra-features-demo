package com.learn.app.service;

import com.learn.app.model.entity.ProductEntity;
import com.learn.app.repository.ProductRepository;
import com.learn.app.util.UUIDUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService{

    @Autowired
    private ProductRepository productRepository;

    @Override
    public String saveProduct(ProductEntity product) {

        product.setId(UUIDUtil.getUUID());
        ProductEntity newProdEntity = productRepository.save(product);
        return newProdEntity.getId() != null ? "Saved Successfully !": "Failed to save product";
    }
}
