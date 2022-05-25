package com.company.services;

import com.company.models.Product;

import java.util.List;

public interface IProductService {
    List<Product> findAll();

    void add(Product newProduct);

    void update(Product newProduct);

    Product findById(int id);

    boolean exist(int id);

    boolean existByName(String name);

    boolean existsById(int id);

    void deleteById(int id);
//    Product findExpenSiveProduct(){
//
//    }

    List<Product> findAllOrderByPriceASC();
    List<Product> findAllOrderByPriceDESC();
}
