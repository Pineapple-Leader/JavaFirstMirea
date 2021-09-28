package ru.mirea.task3.Book;
public class Main{
    public static void main(String[] args) {
        Book Holmes = new Book(1901, "Sherlock Holmes and the hound of the Baskervilles", "L.N. Tolstoy");
        Holmes.print();
        Holmes.setAuthor("Arthur Conan Doyle");
        System.out.println(Holmes);
    }
}
