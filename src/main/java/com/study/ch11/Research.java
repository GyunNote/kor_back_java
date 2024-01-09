package com.study.ch11;

public class Research {

    static int count = 0;
    int num;
    Store price;

    public Research(Store price) {
        count++;
        this.num = 15000;
        this.num += count;
        this.price = price;
    }

    public void test() {
        price.setName("도형");
        price.showStoreInfo();
    }
    @Override
    public String toString() {
        return "Research{" +
                "num=" + num +
                ", price=" + price +
                '}';
    }
}
