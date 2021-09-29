package ru.mirea.task5.Dog;

public abstract class Dog {
    String name;
    int age;
    String color;
    public Dog(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color=color;
    }
    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
        this.color="brown";
    }
    public Dog(String name) {
        this.name = name;
        this.age=0;
        this.color="brown";
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
