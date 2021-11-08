package ru.mirea.task10.Seventeen;
import java.util.Scanner;

public class opt17 {
    public static int recursion(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n > 0){
            return Math.max(n,recursion());
        }
        else return 0;
    }
    public static void main(String[] args){
        System.out.println("Введите последовательность натуральных чисел:");
        System.out.println(recursion());
    }
}