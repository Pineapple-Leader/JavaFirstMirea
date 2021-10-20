package ru.mirea.task9;
        import javax.swing.*;
        import java.awt.*;
        import java.awt.event.*;

public class LastScore extends JFrame{
    JFrame frame = new JFrame("MatchApp");
    private JPanel window = new JPanel();

    private int goalMilan = 0;
    private int goalMadrid = 0;
    private BoxLayout boxLayout = new BoxLayout(window, BoxLayout.Y_AXIS);

    JLabel label1 = new JLabel("Result: 0 X 0");
    JLabel label2 = new JLabel("Last Scorer:");
    JLabel label3 = new JLabel("Winner: DRAW");

    public LastScore(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setSize(500, 500);
        setVisible(true);
        this.start();

    }
    private void start(){
        window.setLayout(boxLayout);

        JButton button_Milan = new JButton("Milan");
        button_Milan.setFont(new Font("TimesNewRoman", Font.PLAIN, 30));
        button_Milan.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                goalMilan+=1;
                label1.setText("Result:" + goalMilan +"X" + goalMadrid);
                label2.setText("Last Scorer: Milan");
                if (goalMadrid < goalMilan){
                    label3.setText("Winner: Milan");
                }
                else
                if (goalMadrid > goalMilan){
                    label3.setText("Winner: Madrid");
                }
                else
                {
                    label3.setText("Winner: Draw");
                }
                window.add(label1);
                window.add(label2);
                window.add(label3);
            }
        });

        JButton button_Madrid = new JButton("Madrid");
        button_Madrid.setFont(new Font("TimesNewRoman", Font.PLAIN, 30));
        button_Madrid.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                goalMadrid+=1;
                label1.setText("Result:" + goalMilan +"X" +goalMadrid);
                label2.setText("Last Scorer:" + "Madrid");
                if (goalMadrid < goalMilan){
                    label3.setText("Winner: Milan");
                }
                else
                if (goalMadrid > goalMilan){
                    label3.setText("Winner: Madrid");
                }

                else
                {
                    label3.setText("Winner: Draw");
                }
                window.add(label1);
                window.add(label2);
                window.add(label3);

            }
        });
        window.add(button_Milan);
        window.add(button_Madrid);
        label1.setFont(new Font("TimesNewRoman", Font.PLAIN, 30));
        label2.setFont(new Font("TimesNewRoman", Font.PLAIN, 30));
        label3.setFont(new Font("TimesNewRoman", Font.PLAIN, 30));
        window.add(label1);
        window.add(label2);
        window.add(label3);
        add(window);

    }
    public static void main (String[] args)
    {
        new LastScore().setVisible(true);
    }
}