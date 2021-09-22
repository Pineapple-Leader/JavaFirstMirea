package ru.mirea.task1.opt2;

public class second {
    public static void main(String[] args) {
        int i=1;
        while (i<=10) {
            String str = String.format("%.2f",1.0/i);
            System.out.println("аргумент №" + i + " = " + str);
            i++;
        }
    }
}