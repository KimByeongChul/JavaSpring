package com.di_bean.dao.impl;

import com.di_bean.dao.ProductDao;
import com.di_bean.domain.Product;

import java.util.HashMap;
import java.util.Map;

public class ProductDaoImpl implements ProductDao {
    // 데이터베이스를 대신 하여 MAP 클래스를 활
    Map<String, Product> productMap = new HashMap<String, Product>();


    // productMap에 제품 이름과 제품정보를 등록;
    @Override
    public void addProduct(Product product) {
        productMap.put(product.getName(), product);
    }

    // 이름을 기준으로 검색하여 제품을 가져옴.
    @Override
    public Product findByName(String name) {
        return productMap.get(name);
    }
}
