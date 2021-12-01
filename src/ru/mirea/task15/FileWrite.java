package ru.mirea.task15;
import java.lang.*;
import java.io.*;
import java.util.Scanner;
public class FileWrite {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        File file = new File("D://testFile//text.txt");
        String text = scan.nextLine(); // строка для записи
        try(FileOutputStream FOSObj = new FileOutputStream(file)) //класс записи в файл
        {
            // перевод строки в байты
            byte[] buf = text.getBytes();
            FOSObj.write(buf);
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
        System.out.println("The file has been written");
    }
}