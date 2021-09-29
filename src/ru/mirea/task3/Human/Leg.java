package ru.mirea.task3.Human;

public class Leg {
    private String length, mass;

    public Leg(String len, String mass){
        length = len;
        this.mass = mass;
    }

    public String getLegLength(){
        return length;
    }

    public void setLegLength(String len){
        length = len;
    }

    public String getMass(){
        return mass;
    }

    public void setMass(String mass){
        this.mass = mass;
    }
    @Override
    public  String toString(){
        return(mass+" "+length);
    }
}
