package ru.mirea.task3.Circle;

 class Circle {
    private  String circleName;
    private int radius, x, y;
    public  Circle(String circleName, int radius, int x, int y) {
        this.circleName=circleName;
        this.radius=radius;
        this.x=x;
        this.y=y;
    }
    @Override
    public  String toString(){
        return ("Name: "+circleName+", radius= "+radius+". Coordinates of its center: x="+x+", y="+y);
    }
    public int getRadius(){
        return radius;
    }
    public  void setRadius(int radius){
        this.radius=radius;
    }
     public int getX(){
         return x;
     }
     public  void setX(int x){
         this.x=x;
     }
     public int getY(){
         return y;
     }
     public  void setY(int y){
         this.y=y;
     }
}
