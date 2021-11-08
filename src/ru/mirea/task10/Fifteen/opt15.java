package ru.mirea.task10.Fifteen;
import java.util.Scanner;
public class opt15 {
    public static int answer(int n){

        if(n < 10)
            return n;
        else{
            System.out.print(n % 10 + " ");
            return answer(n / 10);}
    }
    public static void main(String[] args){
        System.out.println("Введите Ваше число N: "); /*N- натуральное*/
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(answer(n));
    }
}