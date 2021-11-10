package ru.mirea.task11.Word;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.lang.*;
import java.awt.*;
import javax.swing.*;

public class Word extends JFrame
{
    private JPanel panel = new JPanel(new BorderLayout());
    private JTextArea area = new JTextArea();
    private JFrame frame = new JFrame("Word Beta (pre-Beta)");
    private JMenuBar menu = new JMenuBar();

    public void createWindow()
    {
        panel.add(area);
        menu.add(FontMenu());
        menu.add(ColorMenu());
        frame.setJMenuBar(menu);
        frame.add(panel);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setVisible(true);
    }
    public JMenu FontMenu()
    {
        JMenu font = new JMenu("Font");
        JMenuItem type1  = new JMenuItem("Calibri");
        JMenuItem type2  = new JMenuItem("Times New Roman");
        JMenuItem type3 = new JMenuItem("Arial");

        font.add(type1);
        font.addSeparator();
        font.add(type2);
        font.addSeparator();
        font.add(type3);

        ActionListener actionFontOne = new FontOne();
        ActionListener actionFontTwo = new FontTwo();
        ActionListener actionFontThree = new FontThree();
        type1.addActionListener(actionFontOne);
        type2.addActionListener(actionFontTwo);
        type3.addActionListener(actionFontThree);
        return font;
    }

    public JMenu ColorMenu()
    {
        JMenu color = new JMenu("Color");
        JMenuItem black = new JMenuItem("Black");
        JMenuItem red = new JMenuItem("Red");
        JMenuItem green = new JMenuItem("Green");

        color.add(black);
        color.addSeparator();
        color.add(red);
        color.addSeparator();
        color.add(green);

        ActionListener actionListenerOne = new BlackColor();
        ActionListener actionListenerTwo = new RedColor();
        ActionListener actionListenerThree = new GreenColor();

        black.addActionListener(actionListenerOne);
        red.addActionListener(actionListenerTwo);
        green.addActionListener(actionListenerThree);

        return color;
    }
    public class BlackColor implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            area.setForeground(Color.black);
        }
    }
    public class RedColor implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            area.setForeground(Color.red);
        }
    }
    public class GreenColor implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            area.setForeground(Color.green);
        }
    }
    public class FontOne implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            area.setFont(new Font("Calibri", Font.BOLD, 14));
        }
    }
    public class FontTwo implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            area.setFont(new Font("TimesNewRoman", Font.ITALIC, 18));
        }
    }
    public class FontThree implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            area.setFont(new Font("Arial", Font.PLAIN, 12));
        }
    }
    public static void main (String[] args)
    {
        Word word = new Word();
        word.createWindow();
    }
}