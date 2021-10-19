package ru.mirea.task11.opt1;

import ru.mirea.task9.opt1.Match;

import javax.swing.*;
import javax.swing.plaf.ColorUIResource;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuessNum extends JFrame {
    public int attempts = 3;
    static int rand = (int) (Math.random() * 20);
    public GuessNum() {
        //UIManager.put("InternalFrame.activeTitleBackground", new ColorUIResource(Color.black ));
        JFrame frame = new JFrame("Угадай случайную цифру");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = frame.getContentPane();
        Font font0 = new Font("SansSerif", Font.BOLD, 18);
        Font font1 = new Font("SansSerif", Font.PLAIN, 17);
        Font font2 = new Font("SansSerif", Font.BOLD, 12);
        c.setBackground(new Color(137, 150, 255));
        frame.setSize(600, 450);
        JButton but1 = new JButton("Угадать цифру");
        but1.setBounds(200,230,200,40);
        but1.setFont(font1);
        but1.setBackground(new Color(216, 250, 210)); 
        frame.add(but1);
        JButton but2 = new JButton("Попробовать заново");
        but2.setBounds(200,280,200,40);
        but2.setFont(font1);
        but2.setBackground(new Color(248, 147, 147));
        frame.add(but2);
        JLabel labelAttempts = new JLabel("Попыток осталось: 3");
        labelAttempts.setBounds(235,330,250,40);
        labelAttempts.setFont(font2);
        frame.add(labelAttempts);
        JLabel inputLabel = new JLabel("Введите ваше число:");
        inputLabel.setBounds(200,90,250,40);
        inputLabel.setFont(font0);
        frame.add(inputLabel);
        JTextField inputOfNumber = new JTextField();
        inputOfNumber.setBounds(275,140,50,30);
        inputOfNumber.setFont(font1);
        inputOfNumber.setBackground(new Color(216, 250, 210));
        frame.add(inputOfNumber);
        JLabel infoLabel = new JLabel("");
        infoLabel.setBounds(170,190,300,20);
        infoLabel.setFont(font1);
        frame.add(infoLabel);
        frame.setLayout(null);
        frame.setVisible(true);

        but1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try{
                    int x = Integer.parseInt(inputOfNumber.getText().trim());
                    inputOfNumber.setText("");
                    if (x > rand){
                        attempts--;
                        infoLabel.setText("Ваше число: " + x + " слишком большое");
                        labelAttempts.setText("Попыток осталось: " + attempts);
                    }
                    if (x < rand){
                        attempts--;
                        infoLabel.setText("Ваше число: " + x + " слишком маленькое");
                        labelAttempts.setText("Попыток осталось: " + attempts);
                    }
                    if (x == rand){
                        JOptionPane.showMessageDialog(null,"Вы выиграли!!!","Поздравляем!",JOptionPane.INFORMATION_MESSAGE);
                    }
                    if (attempts == 0){
                        JOptionPane.showMessageDialog(null, "Попытки закончились, число было: " + rand, "Игра завершена!", JOptionPane.INFORMATION_MESSAGE);
                    }

                }
                catch (Exception b){
                    JOptionPane.showMessageDialog(null, "Ошибка!","ALERT",JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        but2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                attempts = 3;
                rand = (int) (Math.random() * 20);
                inputOfNumber.setText("");
                labelAttempts.setText("Попыток осталось: 3");
                infoLabel.setText("");
            }
        });
    }
    public static void main(String[] args){
        GuessNum frame = new GuessNum();
        System.out.print(rand);
    }
}
