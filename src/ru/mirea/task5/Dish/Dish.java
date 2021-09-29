package ru.mirea.task5.Dish;

public class Dish {
    String material;
    int price;
    public Dish(String material, int price) {
        this.material = material;
        this.price = price;
    }

    public String getMaterial() {
        return material;
    }
    public void setMaterial(String material) {
        this.material = material;
    }

    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
}
