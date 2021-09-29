package ru.mirea.task5.Dish;

public class Spoon extends  Dish {
    String size;

    public Spoon(String material, int price, String size) {
        super(material, price);
        this.size = size;
    }
    @Override
    public String toString() {
        return "Spoon made of " + material + ", it's size is " +size + ", it's costs " + price + '$';
    }
}
