package ru.mirea.task9.opt1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Match {
    int goalAC = 0;
    int goalRM = 0;
    public Match() {
        JFrame frame = new JFrame("Football");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = frame.getContentPane();
        c.setBackground(new Color(173,223,173));
        frame.setSize(600, 350);
        JLabel labelResult = new JLabel("Result: " + goalAC + " x " + goalRM);
        labelResult.setBounds(250,30,100,10);
        JLabel labelLast = new JLabel("Last Scorer: N/A");
        labelLast.setBounds(250,50,200,10);
        JLabel labelWinner = new JLabel("Winner: N/A");
        labelWinner.setBounds(250,70,200,10);
        JButton buttonAC = new JButton("AC Milan");
        JButton buttonRM = new JButton("Real Madrid");
        JButton buttonRST = new JButton("RESET");
        buttonRM.setBounds(310,250,150,30);
        buttonAC.setBounds(140,250,150,30);
        buttonRST.setBounds(250,200,100,30);
        buttonAC.setBackground(new Color(186, 185, 241));
        buttonRM.setBackground(new Color(241, 185, 200));
        buttonRST.setBackground(new Color(133, 132, 132));
        frame.setLayout(null);
        frame.add(buttonAC);
        frame.add(buttonRM);
        frame.add(buttonRST);
        frame.add(labelResult);
        frame.add(labelLast);
        frame.add(labelWinner);
        frame.setVisible(true);

        buttonAC.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                goalAC++;
                labelResult.setText("Result: " + goalAC + " x " + goalRM);
                labelLast.setText("Last Scorer: AC Milan");
                if (goalAC > goalRM) {
                    labelWinner.setText("Winner: AC Milan");
                } else {
                    if (goalRM > goalAC) {
                        labelWinner.setText("Winner: Real Madrid");
                    } else {
                        labelWinner.setText("Winner: Draw");
                    }
                }
            }
        });

        buttonRM.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                goalRM++;
                labelResult.setText("Result: " + goalAC + " x " + goalRM);
                labelLast.setText("Last Scorer: Real Madrid");
                if (goalAC > goalRM) {
                    labelWinner.setText("Winner: AC Milan");
                }
                else {
                    if(goalRM > goalAC) {
                        labelWinner.setText("Winner: Real Madrid");
                    }
                    else {
                        labelWinner.setText("Winner: Draw");
                    }
                }
            }
        });

        buttonRST.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                goalAC = 0;
                goalRM = 0;
                labelResult.setText("Result: " + goalAC + " x " + goalRM);
                labelLast.setText("Last Scorer: N/A");
                labelWinner.setText("Winner: N/A");
            }
        });
    }
    public static void main(String[] args){
        Match frame = new Match();
    }
}