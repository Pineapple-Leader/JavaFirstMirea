package ru.mirea.task2.Shape;

public class Shape {
    private String name;
    private int angles;
    private int area;

    public Shape(String name, int angles, int area) {
        this.name = name;
        this.angles = angles;
        this.area = area;
    }
    @Override
    public String toString() {
        return "This is a " + name + ", it has " + angles + " angles and the area of this figure is " + area;
    }
}
