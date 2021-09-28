package ru.mirea.task2.Book;
public class Book {
    private int pageAmount;
    private String name;
    public Book(int pageAmount, String name) {
        this.pageAmount = pageAmount;
        this.name = name;
    }
    public void setPage(int pageAmount) {
        this.pageAmount = pageAmount;
    }
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return "That book has  " + this.pageAmount +" pages, it's name is " + '"' + this.name + '"';
    }
    public void print(){
        System.out.println("Name of this book is " + '"' + name + '"'+ " and there are " + pageAmount + " pages");
    }
}