package ru.mirea.task4.Author;
public class Author {
    String name;
    String email;
    char gender;

    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public char getGender() {
        return gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
        System.out.println("New e-mail address is set");
    }
    @Override
    public String toString() {
        return "Author:" + " name= '" + name + '\'' + ", email= '" + email + '\'' + ", gender:" + gender + '}';
    }
}