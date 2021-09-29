package ru.mirea.task3.Human;

public class Hand {
    private String amountOfFingers, size;

    public Hand(String fin, String size){
        this.amountOfFingers = fin;
        this.size = size;
    }

    public String getAmountOfFingers(){
        return amountOfFingers;
    }

    public void setAmountOfFingers(String fin){
        this.amountOfFingers = fin;
    }

    public String getSize(){
        return size;
    }

    public void setSize(String size){
        this.size = size;
    }
    @Override
    public  String toString(){
        return(amountOfFingers+" "+size);
    }
}
