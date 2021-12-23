package ru.mirea.task8.Animation;



import javax.swing.JFrame;
import java.awt.*;
import javax.swing.*;
public class animation extends JFrame{

    private JLabel gifLabel;
    private Container controls;

    public animation(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
        this.setSize(800, 800);
        this.startWindow();
    }

    void startWindow(){
        controls = new Container();
        controls = getContentPane();
        controls.setLayout(new FlowLayout());
        gifLabel = new JLabel(new ImageIcon(Toolkit.getDefaultToolkit().createImage("C:\\Users\\1\\Desktop\\Cat.gif\\")));
        controls.add(gifLabel);

    }
    public static void main(String[] args)
    {
        SwingUtilities.invokeLater(new Runnable()
        {
            public void run()
            {
                animation gif = new animation();
                gif.setVisible(true);
            }
        });
    }
}