package ru.mirea.task3.Human;

public class Head {
    private String hairColour, eyeColour;
    public Head(String hair, String eyes){
        this.hairColour = hair;
        this.eyeColour = eyes;
    }

    public String getHairColour(){
        return hairColour;
    }

    public void setHairColour(String hair){
        this.hairColour = hair;
    }
    public String getEyeColour(){
        return eyeColour;
    }
    @Override
    public  String toString(){
        return(hairColour + " "+eyeColour);
    }
}
