package ru.mirea.task10.Sixteen;
import java.util.Scanner;

public class opt16 {
    public static void max(int max, int k){/*max- максимальное число, k- количествотаких чисел в последовательности*/
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n>max) {
            max(n,1);
        }
        if (n==max) {
            max(max, ++k);
        }
        if (n<max&&n!=0) {
            max(max, k);
        }
        if (n==0) {
            System.out.println("Максимальное число: "+max+", количество повторений: "+k);
        }
    }

    public static void main(String[] args){
        System.out.println("Введите последовательность чисел(одно число на одну строку): ");
        max(0,0);
    }
}