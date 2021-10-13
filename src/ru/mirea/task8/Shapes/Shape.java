package ru.mirea.task8.Shapes;
import java.awt.*;
import javax.swing.*;
public class Shape extends JPanel
{
    protected void paintComponent(Graphics s) {
        for (int i = 0; i < 20; i++){
            double n = (int) (Math.random() * 3) ;
            if (n==0) Circle.paintShape(s);
            if (n==1) Rectangle.paintShape(s);
            if (n==2) Square.paintShape(s);
        }
        paintShape(s);
    }

    protected static void paintShape(Graphics s) {
    }
}
class Circle extends Shape
{
    public static void paintShape(Graphics s) {
        int r = (int) (Math.random() * 255);
        int g = (int) (Math.random() * 255);
        int b = (int) (Math.random() * 255);
        s.setColor(new Color(r,g,b));
        int a=(int) (Math.random()*100);
        int y= (int) (Math.random()*500)+200;
        int x= (int) (Math.random()*1000)+200;
        s.drawOval(x, y, a, a);
        s.fillOval(x, y, a, a);
    }
}
class Square extends Shape
{
    public static void paintShape(Graphics s) {
        int r = (int) (Math.random() * 255);
        int g = (int) (Math.random() * 255);
        int b = (int) (Math.random() * 255);
        s.setColor(new Color(r,g,b));
        int a=(int) (Math.random()*90)+10;
        int x= (int) (Math.random()*500)+200;
        int y= (int) (Math.random()*500)+200;
        s.drawRect(x, y, a, a);
    }
}
class Rectangle extends Shape
{
    public static void paintShape(Graphics s) {
        int r = (int) (Math.random() * 255);
        int g = (int) (Math.random() * 255);
        int b = (int) (Math.random() * 255);
        s.setColor(new Color(r,g,b));
        int a=(int) (Math.random()*40)+10;
        int x= (int) (Math.random()*500)+200;
        int y= (int) (Math.random()*500)+200;
        s.drawRect(x, y, a, 2*a);
        s.fillRect(x, y, a, 2*a);
    }
}