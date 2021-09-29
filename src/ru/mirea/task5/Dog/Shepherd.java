package ru.mirea.task5.Dog;

public class Shepherd extends  Dog{
    public Shepherd(String name, int age, String color ) {
        super(name, age, color);

    }
    public Shepherd(String name, int age) {
        super(name, age);
    }
    public  Shepherd(String name) {
        super(name);
    }
    @Override
    public String toString(){
        return ("Shepherd name is " + name + ", it's age is " + age+ " dog color:"+color );
    }
}
