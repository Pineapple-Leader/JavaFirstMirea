package ru.mirea.task13;
import java.lang.*;
import java.util.*;

public class LinkedListTest {
    public static void output(LinkedList<String> list)
    {
        for(int i = 0; i < list.size(); i++)
        {
            System.out.println(list.get(i));
        }
        System.out.println("\n");
    }
    public static void main(String[] args)
    {
        LinkedList<String> mylist = new LinkedList<>();

        //1 - добавление элементов в двусвязный список
        mylist.add("Linked ");
        mylist.add("List ");
        mylist.add("Test ");
        mylist.add("octopus ");
        mylist.add("three ");
        output(mylist);

        //2 - удаление элемента из списка
        mylist.remove(4);
        output(mylist);

        //3 - возврат индекса искомого элемента
        System.out.println("Индекс слова octopus: " + mylist.indexOf("octopus "));
        System.out.println("\n");

        //4 - содержится ли элемент в списке
        System.out.println(mylist.contains("three "));
        System.out.println("\n");

        //5 - вставка с заменой
        mylist.set(3, "frog");
        output(mylist);

        //6 - очистка двусвязного списка
        mylist.clear();
        System.out.println("Размер списка: " + mylist.size());        //7 - размер списка
    }

}