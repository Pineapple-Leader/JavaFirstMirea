package ru.mirea.task10.Fourteen;
import java.util.Scanner;
/*
Цифры числа слева направо.
Дано натуральное число N.
Выведите все его цифры по одной, в обычном порядке, разделяя их пробелами или новыми строками.
При решении этой задачи нельзя использовать строки, списки, массивы, циклы.
Разрешена только рекурсия и целочисленная арифметика
*/
public class opt14 {
    public static String answer(int n){

        if(n < 10)
            return Integer.toString(n);
        else
            return answer(n/10) + " " + n % 10;}

    public static void main(String[] args){
        System.out.println("Введите Ваше число N  : "); /*Число должно быть натуральным*/
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(answer(n));}
}