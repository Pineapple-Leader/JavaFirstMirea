package ru.mirea.task11.GuessTheNumber;

import javax.swing.*;
public class Guess extends JFrame {

    private JPanel panel = new JPanel();
    private int n = 5;
    JLabel label1 = new JLabel("Попробуй угадай,n число от 0 до 20");
    private int count = 0;
    private boolean flag = false;

    public Guess(){
        super("Угадайка");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(600, 600);
        setVisible(true);
        this.start();
    }

    private void start(){

        JTextField smallField;
        smallField = new JTextField(20);
        panel.add(smallField);

        JButton button_set = new JButton("Ввести число");
        button_set.addActionListener(e -> {
            count ++;
            if (count < 4){
                if(flag){
                    JOptionPane.showMessageDialog(Guess.this, "Вы уже выиграли!");
                    flag = true;
                }
                else{
                    if(Integer.parseInt(smallField.getText()) == n) {
                        JOptionPane.showMessageDialog(Guess.this, "Угадал!");
                        flag=true;
                        System.exit(0);
                    }
                else if(Integer.parseInt(smallField.getText()) < n){
                        JOptionPane.showMessageDialog(Guess.this,"Нет, Ваше число меньше загаданного числа");
                    }
                    else if(Integer.parseInt(smallField.getText()) > n){
                        JOptionPane.showMessageDialog(Guess.this,"Нет, Ваше число больше загаданного числа");
                    }
                }
            }
            if(count == 3&&(Integer.parseInt(smallField.getText())!=n)){
                JOptionPane.showMessageDialog(Guess.this,"Проиграл!");
                System.exit(0);
            }
        });
        panel.add(button_set);
        panel.add(label1);
        add(panel);
    }
    public static void main(String[] args) {
        new Guess();
    }
}