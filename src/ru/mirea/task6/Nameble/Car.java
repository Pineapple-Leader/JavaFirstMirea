package ru.mirea.task6.Nameble;

public class Car implements Nameable {
    String model;
    int price;
    String manufacturer;
    Car(String model, String manufacturer, int price) {
        this.model=model;
        this.manufacturer=manufacturer;
        this.price=price;
    }
    @Override
    public  void  getName() {
        System.out.println(manufacturer+" "+model+" costs "+price);
    }
}
