package ru.mirea.task5.Dog;

public class Poodle extends Dog{
    public Poodle(String name, int age, String color ) {
        super(name, age, color);

    }
    public Poodle(String name, int age) {
        super(name, age);
    }
    public  Poodle(String name) {
        super(name);
    }
    @Override
    public String toString(){
        return ("Poodle name is " + name + ", it's age is " + age+ " dog color:"+color );
    }
}
