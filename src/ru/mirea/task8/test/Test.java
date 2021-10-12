package ru.mirea.task8.test;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
//import java.awt.*;

class NullLayout extends JFrame
{
    JTextField jta = new JTextField(10);
    Font fnt = new Font("Times new roman",Font.BOLD,20);
    JLabel lbl = new JLabel("");

    JButton but1 = new JButton("One");
    JButton but2 = new JButton("two");
    JButton but3 = new JButton("three");
    JButton circle = new JButton("Circle");
    public NullLayout()
    {
        super("Example");
        //setLayout(new BorderLayout());
        add(jta);
        jta.setForeground(Color.PINK);
        jta.setFont(fnt);
        //setLayout(null);
        circle.setBounds(150,100,30,30);
        //setLayout(new FlowLayout());

        setLayout(new BorderLayout());
        add(lbl,BorderLayout.SOUTH);
        addMouseListener(new MouseListener()
        {
            public void mouseExited(MouseEvent a){}
            public void mouseClicked(MouseEvent a)
            {lbl.setText("X="+a.getX()+" Y="+a.getY());}
            public void mouseEntered(MouseEvent a) {}
            public void mouseReleased(MouseEvent a) {}
            public void mousePressed(MouseEvent a) {}
        });

        but1.setBounds(150,300,100,20); // added at 150,300 width = 100, height=20
        but2.setSize(80,400); // added at 0,0 width = 80, height=400
        but3.setLocation(300,100);
        but3.setSize(200,75);
// those two steps can be combined in one setBounds method call
        //add(circle);

        //add(but1);
        //add(but2);
        //add(but3);
        setSize(500,500);
    }
    public static void main(String[]args)
    {
        new NullLayout().setVisible(true);
    }
}