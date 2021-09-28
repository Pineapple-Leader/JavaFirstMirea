package ru.mirea.task2.Dog;

public class Dog {
    private String name;
    private float age;
    public Dog(String name, float age) {
        this.name = name;
        this.age = age;
    }
    public void toHumanAge() {
        float humanAge = age * 7f;
        System.out.println(name + "'s age in human age is: " + humanAge);
    }
    @Override
    public String toString() {
        return "Dog name is " + name + ", it's age is " + age;
    }
}