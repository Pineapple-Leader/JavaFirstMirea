package ru.mirea.task4.Ball;

public class Ball {
    double x,y;
    public Ball(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public Ball() {
        this.x=0;
        this.y=0;
    }
    public double getX() {
        System.out.print("X= ");
        return x;
    }
    public void setX(double x) {
        this.x = x;
    }
    public double getY() {
        System.out.print("Y= ");
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
    public void setXY(double x, double y){
        this.x = x;
        this.y = y;
    }
    public void move(double x, double y){
        this.x += x;
        this.y += y;
    }
    @Override
    public String toString() {
        return "Ball coordinates: {x=" + x +", y=" + y +'}';
    }
}