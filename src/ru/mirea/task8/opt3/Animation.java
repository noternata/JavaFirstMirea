package ru.mirea.task8.opt3;

import javax.swing.*;

public class Animation extends JFrame{
    public static void main(String[] args) throws InterruptedException {
        JFrame frame = new JFrame("Animation");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(510,350);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        JLabel picture = new JLabel("", JLabel.CENTER);
        frame.add(picture);
        while(true) {
            picture.setIcon(new ImageIcon("C:\\Users\\noternata\\Учеба\\3_семестр\\Программирование на java\\Animation\\im0.jpg"));
            Thread.sleep(100);
            picture.setIcon(new ImageIcon("C:\\Users\\noternata\\Учеба\\3_семестр\\Программирование на java\\Animation\\im1.jpg"));
            Thread.sleep(100);
            picture.setIcon(new ImageIcon("C:\\Users\\noternata\\Учеба\\3_семестр\\Программирование на java\\Animation\\im2.jpg"));
            Thread.sleep(100);
            picture.setIcon(new ImageIcon("C:\\Users\\noternata\\Учеба\\3_семестр\\Программирование на java\\Animation\\im3.jpg"));
            Thread.sleep(10);
            picture.setIcon(new ImageIcon("C:\\Users\\noternata\\Учеба\\3_семестр\\Программирование на java\\Animation\\im4.jpg"));
            Thread.sleep(100);
            picture.setIcon(new ImageIcon("C:\\Users\\noternata\\Учеба\\3_семестр\\Программирование на java\\Animation\\im5.jpg"));
            Thread.sleep(100);
            picture.setIcon(new ImageIcon("C:\\Users\\noternata\\Учеба\\3_семестр\\Программирование на java\\Animation\\im6.jpg"));
            Thread.sleep(100);
            picture.setIcon(new ImageIcon("C:\\Users\\noternata\\Учеба\\3_семестр\\Программирование на java\\Animation\\im7.jpg"));
            Thread.sleep(100);
            picture.setIcon(new ImageIcon("C:\\Users\\noternata\\Учеба\\3_семестр\\Программирование на java\\Animation\\im8.jpg"));
            Thread.sleep(100);
            picture.setIcon(new ImageIcon("C:\\Users\\noternata\\Учеба\\3_семестр\\Программирование на java\\Animation\\im9.jpg"));
            Thread.sleep(100);
            picture.setIcon(new ImageIcon("C:\\Users\\noternata\\Учеба\\3_семестр\\Программирование на java\\Animation\\im10.jpg"));
            Thread.sleep(100);
        }
    }
}
