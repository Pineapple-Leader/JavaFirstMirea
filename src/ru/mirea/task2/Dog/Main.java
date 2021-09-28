package ru.mirea.task2.Dog;
public class Main {
    public static void main(String[] args) {
        Dog bulldog = new Dog("Mike", 0.25f);
        System.out.println(bulldog);
        bulldog.toHumanAge();
        Dog shepherd = new Dog("Rex", 5f);
        System.out.println(shepherd);
        shepherd.toHumanAge();
    }
}