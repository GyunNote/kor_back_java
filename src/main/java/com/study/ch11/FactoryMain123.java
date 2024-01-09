package com.study.ch11;

public class FactoryMain123 {
    public static void main(String[] args) {

        StoreName.name = "미슐";
        StoreName storeName;
        StoreName.showStoreInfo();

        Store store = new Store();
        store.setName("도락");
        store.showStoreInfo();

        Research research = new Research(store);
        System.out.println(research);

        research.test();

    }
}
