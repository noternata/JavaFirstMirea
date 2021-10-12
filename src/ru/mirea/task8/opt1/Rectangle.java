package ru.mirea.task8.opt1;

import java.awt.*;

public class Rectangle extends Shape{
    double radius;
    public Rectangle () {
        this.type = "Rectangle";
    }
    public void paintComponent(Graphics g) {
        g.setColor(new Color(this.r,this.g,this.b));
        this.r = (int) (Math.random() * 255);
        this.g = (int) (Math.random() * 255);
        this.b = (int) (Math.random() * 255);
        g.fillRect(50,60,100,50);
    }
}