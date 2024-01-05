package com.study.ch07.register01;

import com.study.ch07.register.ProductDB;

public class Product02Repository {

    void saveProduct(Product02 product02){
        ProductDB productDB = new ProductDB();
        productDB.insertProduct02(product02);
    }
}
