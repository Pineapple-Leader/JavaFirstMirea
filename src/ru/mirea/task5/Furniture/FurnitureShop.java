package ru.mirea.task5.Furniture;

public class FurnitureShop {
    public static void main(String[] args){
        Chair oakChair = new Chair("Oak wood", 10, 13280);
        Sofa uncomfortableSofa = new Sofa("Compressed wood", 30, 4500);
        oakChair.setPrice(28000);
        oakChair.setPrice(13280);
        System.out.println("Sale!!! Beautiful oak wood chair is 50% off today!!!");
        System.out.println(oakChair);
        System.out.println(uncomfortableSofa);
    }
}