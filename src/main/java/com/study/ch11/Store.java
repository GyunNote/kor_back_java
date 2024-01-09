package com.study.ch11;

public class Store {

    String name;

    public void setName(String name) {
        this.name = name;
    }
    void showStoreInfo(){
        System.out.println("가게명 : " + name);
    }

    @Override
    public String toString() {
        return "Store{" +
                "name='" + name + '\'' +
                '}';
    }


}
