package ru.mirea.task5.Dish;

public class Fork extends Dish{
    String size;

    public Fork(String material, int price, String size) {
        super(material, price);
        this.size = size;
    }
    @Override
    public String toString() {
        return "Fork made of " + material + ", it's size is " +size + ", it's costs " + price + '$';
    }

}