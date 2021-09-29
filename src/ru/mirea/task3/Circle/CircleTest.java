package ru.mirea.task3.Circle;

public class CircleTest {
    public static void main(String[] args){
        Circle firstCircle= new Circle("first", 5, 6, -1 );
        System.out.println(firstCircle.getRadius());
        firstCircle.setRadius(10);
        System.out.println(firstCircle);
    }
}
