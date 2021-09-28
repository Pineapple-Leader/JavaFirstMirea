package ru.mirea.task3.Book;
public class Book{
    private int year;
    private String name;
    private String author;

    public Book(int year, String name, String author) {
        this.year = year;
        this.name = name;
        this.author = author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public void print(){
        System.out.println("Name of this book is " +'"' + name+ '"' + " and writer is " + author + ", year of writing is "+  year);
    }
    public String toString() {
        return '"' + name+ '"' + " was written by " + author + " in "+  year+" year";
    }
}