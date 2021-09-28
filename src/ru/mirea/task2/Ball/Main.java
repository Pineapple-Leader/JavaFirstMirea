package ru.mirea.task2.Ball;
public class Main {

    public static void main(String[] args) {
        Ball footballBall = new Ball("Football", 430.0f, 70.0f);
        Ball basketballBall = new Ball("basketball", 3f, 600f);
        Ball tennisBall = new Ball("tennis", 2.7f, 1f);
        basketballBall.setWeight(600f);
        tennisBall.setDiameter(6.7f);
        footballBall.print();
        basketballBall.print();
        tennisBall.print();
        System.out.println(footballBall);
    }
}