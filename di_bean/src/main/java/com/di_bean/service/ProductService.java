package com.di_bean.service;

import com.di_bean.domain.Product;

public interface ProductService {
    void addProduct(Product product);
    Product findByName(String name);
}
