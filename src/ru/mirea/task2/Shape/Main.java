package ru.mirea.task2.Shape;

public class Main {
    public static void main(String[] args) {
        Shape triangle = new Shape("triangle", 3, 6);
        Shape rectangle = new Shape("rectangle", 4, 12);
        Shape octagon = new Shape("octagon", 8, 100);
        System.out.println(triangle);
        System.out.println(rectangle);
        System.out.println(octagon);
    }
}