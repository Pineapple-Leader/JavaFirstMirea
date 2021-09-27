package ru.mirea.task1.opt5;
import java.util.Scanner;

public class fifth {
    public static int factorial(int num)
    {
        int n=1;
        if (num<0)
        {
            System.out.print("Введите неотрицательное число");
            System.exit(1);
        }
        else
        {
            for(int i=1;i<num+1;i++)
            {
                n*=(i);
            }

        }
        return n;

    }
    public static void main(String[] args)
    {
        Scanner number = new Scanner(System.in) ;
        int num=number.nextInt();
        fifth objFact=new fifth();
        System.out.print(objFact.factorial(num));

    }
}