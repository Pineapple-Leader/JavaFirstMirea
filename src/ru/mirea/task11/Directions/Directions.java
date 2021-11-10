package ru.mirea.task11.Directions;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.*;
import static javax.swing.JOptionPane.showMessageDialog;
public class Directions extends JFrame{
    private JLabel label1 = new JLabel("Запад");
    private JLabel label2 = new JLabel("Восток");
    private JLabel label3 = new JLabel("Север", SwingConstants.CENTER);
    private JLabel label4 = new JLabel("Юг", SwingConstants.CENTER);
    private JLabel label5 = new JLabel("Центр", SwingConstants.CENTER);
    public void RoadMap()
    {
        JFrame frame = new JFrame("Road Map");

        label1.setFont(new Font("Times New Roman", Font.PLAIN, 30));
        label1.setBorder(BorderFactory.createLineBorder(Color.YELLOW, 5));

        label2.setFont(new Font("Times New Roman", Font.PLAIN, 30));
        label2.setBorder(BorderFactory.createLineBorder(Color.BLUE, 5));

        label3.setFont(new Font("Times New Roman", Font.PLAIN, 30));
        label3.setBorder(BorderFactory.createLineBorder(Color.RED, 5));

        label4.setFont(new Font("Times New Roman", Font.PLAIN, 30));
        label4.setBorder(BorderFactory.createLineBorder(Color.CYAN, 5));

        label5.setFont(new Font("Times New Roman", Font.PLAIN, 30));
        label5.setBorder(BorderFactory.createLineBorder(Color.WHITE, 5));

        MouseListener west = new MouseEvent1();
        MouseListener east = new MouseEvent2();
        MouseListener north = new MouseEvent3();
        MouseListener south = new MouseEvent4();
        MouseListener center = new MouseEvent5();

        label1.addMouseListener(west);
        label2.addMouseListener(east);
        label3.addMouseListener(north);
        label4.addMouseListener(south);
        label5.addMouseListener(center);

        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setSize(400,400);

        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        panel.add(label1, BorderLayout.WEST);
        panel.add(label2, BorderLayout.EAST);
        panel.add(label3, BorderLayout.NORTH);
        panel.add(label4, BorderLayout.SOUTH);
        panel.add(label5, BorderLayout.CENTER);

        frame.getContentPane().add(panel);
        frame.setVisible(true);

    }

    public class MouseEvent1 implements MouseListener {
        public void mouseEntered(MouseEvent e) {
            showMessageDialog(null, "Welcome to the Western city");
        }
        public void mouseClicked(MouseEvent e) {}
        public void mousePressed(MouseEvent e) {}
        public void mouseReleased(MouseEvent e) {}
        public void mouseExited(MouseEvent e) {}
    }
    public class MouseEvent2 implements MouseListener {
        public void mouseEntered(MouseEvent e) {
            showMessageDialog(null, "Welcome to the Eastern city");
        }
        public void mouseClicked(MouseEvent e) {}
        public void mousePressed(MouseEvent e) {}
        public void mouseReleased(MouseEvent e) {}
        public void mouseExited(MouseEvent e) {}
    }
    public class MouseEvent3 implements MouseListener {
        public void mouseEntered(MouseEvent e) {
            showMessageDialog(null, "Welcome to the Northern city");
        }
        public void mouseClicked(MouseEvent e) {}
        public void mousePressed(MouseEvent e) {}
        public void mouseReleased(MouseEvent e) {}
        public void mouseExited(MouseEvent e) {}
    }
    public class MouseEvent4 implements MouseListener {
        public void mouseEntered(MouseEvent e) {
            showMessageDialog(null, "Welcome to the Southern city");
        }
        public void mouseClicked(MouseEvent e) {}
        public void mousePressed(MouseEvent e) {}
        public void mouseReleased(MouseEvent e) {}
        public void mouseExited(MouseEvent e) {}
    }
    public class MouseEvent5 implements MouseListener {
        public void mouseEntered(MouseEvent e) {
            showMessageDialog(null, "Welcome to the Central city");
            System.exit(0);
        }
        public void mouseClicked(MouseEvent e) {}
        public void mousePressed(MouseEvent e) {}
        public void mouseReleased(MouseEvent e) {}
        public void mouseExited(MouseEvent e) {}
    }

    public static void main(String[] args)
    {
        Directions window = new Directions();
        window.RoadMap();
    }
}