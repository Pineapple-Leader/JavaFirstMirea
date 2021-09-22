package ru.mirea.task1.opt3;

public class third {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 10) {
            String str = String.format("%.2f", 1.0 / i);
            System.out.println("аргумент №" + i + " = " + str);
            i++;
        }
    }
}
