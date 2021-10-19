package ru.mirea.task11.opt3;

import ru.mirea.task11.opt1.GuessNum;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class Menues extends JFrame {
    public Menues() {
        JFrame frame = new JFrame("Настройка текста");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = frame.getContentPane();
        c.setBackground(new Color(137, 150, 255));
        frame.setSize(600, 450);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        JTextArea text = new  JTextArea();
        text.setBounds(200,150,200,150);
        Font font00 = new Font("SansSerif", Font.PLAIN, 30);
        text.setFont(font00);
        frame.add(text);
        JLabel labelT = new JLabel("Введите текст: ");
        labelT.setBounds(215,90,250,50);
        Font font0 = new Font("SansSerif", Font.BOLD, 22);
        labelT.setFont(font0);
        frame.add(labelT);

        JMenuBar bar = new JMenuBar();
        frame.setJMenuBar(bar);
        JMenu color = new JMenu("Color");
        bar.add(color);
        JMenu font = new JMenu("Font");
        bar.add(font);

        Font font1 = new Font("Times Roman", Font.BOLD,30);
        JRadioButtonMenuItem item1 = new JRadioButtonMenuItem("Times new Roman");
        font.add(item1);
        Font font2 = new Font("Calibri", Font.ITALIC,30);
        JRadioButtonMenuItem item2 = new JRadioButtonMenuItem("Calibri");
        font.add(item2);
        Font font3 = new Font("Courier new", Font.PLAIN,30);
        JRadioButtonMenuItem item3 = new JRadioButtonMenuItem("Courier new");
        font.add(item3);
        JRadioButtonMenuItem color1 = new JRadioButtonMenuItem("Red");
        color.add(color1);
        JRadioButtonMenuItem color2 = new JRadioButtonMenuItem("Blue");
        color.add(color2);
        JRadioButtonMenuItem color3 = new JRadioButtonMenuItem("Pink");
        color.add(color3);

        item1.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (item1.isSelected()==true) {
                    item2.setSelected(false);
                    item3.setSelected(false);
                }
                text.setFont(font1);
            }
        });
        item2.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (item2.isSelected()==true) {
                    item1.setSelected(false);
                    item3.setSelected(false);
                }
                text.setFont(font2);
            }
        });
        item3.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (item3.isSelected()==true) {
                    item1.setSelected(false);
                    item2.setSelected(false);
                }
                text.setFont(font3);
            }
        });
        color1.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (color1.isSelected()==true) {
                    color2.setSelected(false);
                    color3.setSelected(false);
                }
                text.setForeground(new Color(246, 14, 14));
            }
        });
        color2.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (color2.isSelected()==true) {
                    color1.setSelected(false);
                    color3.setSelected(false);
                }
                text.setForeground(new Color(137, 150, 255));
            }
        });
        color3.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (color3.isSelected()==true) {
                    color1.setSelected(false);
                    color2.setSelected(false);
                }
                text.setForeground(Color.pink);
            }
        });

    }
    public static void main(String[] args){
        Menues frame = new Menues();
    }
}
