package ru.mirea.task11.opt2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MouseIn extends JFrame {
    public MouseIn() {
        JFrame frame = new JFrame("Mouse In");
        frame.setSize(600, 450);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setVisible(true);
        JLabel center = new JLabel("center", SwingConstants.CENTER);
        JLabel east = new JLabel("east", SwingConstants.CENTER);
        JLabel west = new JLabel("west", SwingConstants.CENTER);
        JLabel north = new JLabel("north", SwingConstants.CENTER);
        JLabel south = new JLabel("south", SwingConstants.CENTER);
        frame.add(center, BorderLayout.CENTER);
        frame.add(east, BorderLayout.EAST);
        frame.add(west, BorderLayout.WEST);
        frame.add(north, BorderLayout.NORTH);
        frame.add(south, BorderLayout.SOUTH);

        center.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                //frame.setTitle("You are in EAST");
                JOptionPane.showMessageDialog(null,"You are in CENTER","Mouse",JOptionPane.INFORMATION_MESSAGE);
            }
        });
        east.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                //frame.setTitle("You are in EAST");
                JOptionPane.showMessageDialog(null,"You are in EAST","Mouse",JOptionPane.INFORMATION_MESSAGE);
            }
        });
        west.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                //frame.setTitle("You are in WEST");
                JOptionPane.showMessageDialog(null,"You are in WEST","Mouse",JOptionPane.INFORMATION_MESSAGE);
            }
        });
        north.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                //frame.setTitle("You are in NORTH");
                JOptionPane.showMessageDialog(null,"You are in NORTH","Mouse",JOptionPane.INFORMATION_MESSAGE);
            }
        });
        south.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                //frame.setTitle("You are in SOUTH");
                JOptionPane.showMessageDialog(null,"You are in SOUTH","Mouse",JOptionPane.INFORMATION_MESSAGE);
            }
        });

    }
}