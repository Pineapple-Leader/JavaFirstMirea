package ru.mirea.task4.Author;

public class TestAuthor {
    public static void main(String[] args) {
        Author artur = new Author("Artur", "artyr@mirea.ru", 'm');
        System.out.println(artur);
        System.out.println(artur.getEmail());
        artur.setEmail("konan-doyle1859@yandex.ru");
        System.out.println(artur.getEmail());
    }
}
