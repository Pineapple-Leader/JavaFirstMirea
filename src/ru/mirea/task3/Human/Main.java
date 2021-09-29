package ru.mirea.task3.Human;

public class Main {
    public static  void main( String [] args){
        Head humanHead = new Head ("Brown", "Blue");
        Hand humanHand = new Hand ("5", "medium");
        Leg humanLeg = new Leg ("normal", "adequate");
        System.out.println(humanHead);
        System.out.println(humanHand);
        System.out.println(humanLeg);

    }
}
