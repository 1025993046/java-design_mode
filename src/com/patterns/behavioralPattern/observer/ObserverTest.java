package com.patterns.behavioralPattern.observer;

public class ObserverTest {
    public static void main(String[] args) {
        Stock stock = new Stock(1000.0);
        stock.addObserver(new Stocker("张三", stock));
        stock.addObserver(new Stocker("李四", stock));

        stock.setPrice(980.0);
        stock.setPrice(900.0);
        stock.setPrice(954.0);
    }
}
