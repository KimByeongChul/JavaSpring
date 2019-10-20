package com.di_bean.dao;

import com.di_bean.domain.Product;

public interface ProductDao {
    void addProduct(Product product); // 제품 추가하는 메소드

    Product findByName(String name); // 이름으로 제품을 찾아 리턴하는 메소드
}
