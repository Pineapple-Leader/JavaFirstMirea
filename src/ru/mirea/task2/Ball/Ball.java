package ru.mirea.task2.Ball;

public class Ball {
    private String sport;
    private float weight;
    private float diameter;

    public Ball(String sport, float weight, float diameter) {
        this.sport = sport;
        this.weight = weight;
        this.diameter= diameter;
    }
    public void setWeight(float weight) {
        this.weight = weight;
    }
    public void setDiameter(float diameter) {
        this.diameter = diameter;
    }
@Override
    public String toString()
    {
        return this.sport + " ball weights " + this.weight + "g. and it's diameter is " + this.diameter+" sm";
    }
    public  void print() {
        System.out.println("This ball is for " +  this.sport + ", weight in grams is " + this.weight +" and it's diameter is: "+this.diameter+" sm");
    }
}