package ru.mirea.task2.Book;
public class Main {
    public static void main(String[] args) {
        Book book1 = new Book(200, "Sherlock Holmes and the hound of the Baskervilles");
        Book book2 = new Book(100, "471");
        Book book3 = new Book(500, "Booklet");
        book3.setPage(4);
        book1.print();
        book2.print();
        book3.print();
        System.out.println(book1);
    }
}