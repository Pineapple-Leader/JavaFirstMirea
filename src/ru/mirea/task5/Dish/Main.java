package ru.mirea.task5.Dish;

public class Main {
    public static void main(String[] args) {
        Fork fork = new Fork("titanium", 3, "perfect");
        Spoon teaspoon = new Spoon("aluminum", 5, "small");
        System.out.println(teaspoon);
        System.out.println(fork);
    }
}