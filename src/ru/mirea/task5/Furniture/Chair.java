package ru.mirea.task5.Furniture;
public class Chair extends Furniture{
    public Chair(String material, int weight, int price){
        super(material, weight, price);
    }

    @Override
    public String toString() {
        return "Chair { " + " material :'" + this.getMaterial()+'\'' + ", weight : " + this.getWeight() + ", price : " + this.getPrice() + " }";
    }
}