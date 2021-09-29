package ru.mirea.task4.Ball;

public class TestBall {
    public  static void  main (String[] args){
        Ball first = new Ball();
        Ball second = new Ball(5,9);
        System.out.println(first);
        first.setXY(50,-2);
        System.out.println(first.getX());
        System.out.println(first);
        second.move(3,4);
        System.out.println(second);
    }
}
