package com.di_bean.service.impl;

import com.di_bean.dao.ProductDao;
import com.di_bean.domain.Product;
import com.di_bean.service.ProductService;

public class ProductServiceImpl implements ProductService {
    // Spring 을 통해 AutoWide 하여 DAO를 호출. (이렇게 호출된 DAO는 싱글톤임)
    // Autowide를 하기 위해서는 getter와 setter 필요. -> 코틀린에서는 안해도 됨.
    ProductDao productDao;

    public ProductDao getProductDao() {
        return productDao;
    }

    public void setProductDao(ProductDao productDao) {
        this.productDao = productDao;
    }

    @Override
    public void addProduct(Product product) {
        productDao.addProduct(product);
    }

    @Override
    public Product findByName(String name) {
        return productDao.findByName(name);
    }
}
