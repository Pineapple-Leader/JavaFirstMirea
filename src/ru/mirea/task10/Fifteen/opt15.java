package ru.mirea.task10.Fifteen;
import java.util.Scanner;
/*Цифры числа справа налево.
Дано натуральное число N.
Выведите все его цифры по одной, в обратном порядке, разделяя их пробелами или новыми строками.
При решении этой задачи нельзя использовать строки, списки, массивы (циклы, разумеется).
Разрешена только рекурсия и целочисленная арифметика.
*/
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