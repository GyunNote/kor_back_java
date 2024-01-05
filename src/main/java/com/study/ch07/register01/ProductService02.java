package com.study.ch07.register01;

import com.study.ch07.register.Product;
import com.study.ch07.register.ProductRepository;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class ProductService02 {

    boolean isEmptyString(String str){
        if(str == null){
            return true;
        }
        return str.isBlank();
    }
    void registerProduct02Service(Product02 product02){
        Product02Repository product02Repository = new Product02Repository();

        product02Repository.saveProduct(product02);

        System.out.println("서비스까지 데이터 전달");
    }

}
