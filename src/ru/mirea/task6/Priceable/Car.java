package ru.mirea.task6.Priceable;

import ru.mirea.task6.Nameble.Nameable;

public class Car implements Priceable {
    String model;
    int price;
    String manufacturer;
    Car(String model, String manufacturer, int price) {
        this.model=model;
        this.manufacturer=manufacturer;
        this.price=price;
    }
    public  void  getPrice() {
        System.out.println(manufacturer+" "+model+" costs "+price);
    }
}
