package ru.mirea.task10.Thirteen;
import java.util.Scanner;

public class opt13 {
    public static void odd(){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        if(n > 0){
            System.out.println(n);
            int m = in.nextInt();
            if (m > 0)
                odd();
        }
    }

    public static void main(String[] args){
        System.out.println("Введите последовательность чисел(одно число на одну строку): ");
        odd();
    }
}