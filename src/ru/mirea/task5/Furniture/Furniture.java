package ru.mirea.task5.Furniture;

public abstract class Furniture {
    private  String material;
    private int weight;
    private int price;

    public Furniture(String material, int weight, int price){
        this.material = material;
        this.weight = weight;
        this.price = price;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return this.weight;
    }

    public String getMaterial() {
        return this.material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getPrice() {
        return this.price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Furniture {" + "material='" + this.material  + ", weight=" + this.weight + ", price=" + this.price + '}';
    }
}
