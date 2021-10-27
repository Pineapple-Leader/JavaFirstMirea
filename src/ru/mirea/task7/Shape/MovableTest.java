package ru.mirea.task7.Shape;
import java.lang.*;
public class MovableTest {
    public static void main(String[] args)
    {
        MovableCircle circle = new MovableCircle(3, 3, 5, -3, 20);
        System.out.println(circle);
        circle.moveUp();
        circle.moveRight();
        System.out.println(circle);
        System.out.println('\n');

        MovableRectangle rectangle1 = new MovableRectangle(0, 0, 5,5,3,2);
        System.out.println(rectangle1);
        rectangle1.moveLeft();
        rectangle1.moveUp();
        System.out.println(rectangle1);
    }
}