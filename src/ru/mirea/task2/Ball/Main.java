package ru.mirea.task2.Ball;
public class Main {

    public static void main(String[] args) {
        Ball footballBall = new Ball("Football", 430.0f, 70.0f);
        Ball basketballBall = new Ball("basketball", 600f, 600f);
        Ball tennisBall = new Ball("tennis", 2.7f, 6.7f);
        basketballBall.setWeight(3);
        footballBall.print();
        basketballBall.print();
        tennisBall.print();
        System.out.println(footballBall);
    }
}