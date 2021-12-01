package ru.mirea.task15;
import java.lang.*;
import java.io.*;
public class fileRead {
    public static void main(String[] args) {

        try (FileInputStream FINObj = new FileInputStream("D://testFile//text.txt"))     //класс считывания из файла
        {
            int i;
            while ((i = FINObj.read()) != -1) {     //если в потоке нет данных для считывания
                System.out.print((char) i);
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println('\n');
        System.out.println("The file has been read");
    }
}