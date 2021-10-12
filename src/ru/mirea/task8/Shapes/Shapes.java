package ru.mirea.task8.Shapes;
import java.awt.*;
import javax.swing.*;
public class Shapes {
    public static void main(String[] args){
        JFrame window = new JFrame("20 Shapes");
        window.setSize(800,500);
        window.setBackground(Color.WHITE);
        window.setVisible(true);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Shape gui= new Shape();
        gui.setBackground(Color.WHITE);
        window.add(gui);
    }
}