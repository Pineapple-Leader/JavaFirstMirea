package ru.mirea.task5.Dog;

public class Main {
    public  static  void main (String [] args) {
        Shepherd Rex = new Shepherd("Rex", 15, "Brown");
        Poodle Snowflake = new Poodle("Snowflake", 5, "Pale");
        Poodle Mango = new Poodle("Mango");
        System.out.println(Rex);
        System.out.println(Mango);
        System.out.println(Snowflake);
        Snowflake.setAge(14);
        System.out.println(Snowflake);
    }
}
