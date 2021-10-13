package ru.mirea.task8.Picture;
import java.awt.*;
import java.io.*;
import javax.imageio.*;
import javax.swing.*;
import java.util.Scanner;
public class Picture {
    public static void main(String[] args) {
                ImageFrame frame = new ImageFrame();
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);
    }
}
class ImageFrame extends JFrame
{
    public ImageFrame()
    {
        setTitle("Picture");
        setSize(700, 500);
        // Добавление компонента к фрейму.
        ImageComponent component = new ImageComponent();
        add(component);
    }
}
class ImageComponent extends JComponent
{
    public ImageComponent()
    {
        // Получаем изображения.
        try
        {
            Scanner in = new Scanner(System.in);
            String a = in.nextLine();
            in.close();
            image = ImageIO.read(new File(a));
            //C:\\Users\\IVC1-5\\Downloads\\1.jpg
        }
        catch(IOException e)
        {
            System.out.println("Try again!");
        }
    }
    public void paintComponent(Graphics g)
    {
        if(image == null) return;
        g.drawImage(image, 0, 0, null);
    }
    private Image image;
}