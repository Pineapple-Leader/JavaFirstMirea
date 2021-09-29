package ru.mirea.task5.Furniture;
public class Sofa extends Furniture{
    public Sofa(String material, int weight, int price){
        super(material, weight, price);
    }

    @Override
    public String toString() {
        return "Sofa { " + " material = '" + this.getMaterial()+ '\'' + ", weight:=" + this.getWeight() + ", price : " + this.getPrice() + " }";
    }
}