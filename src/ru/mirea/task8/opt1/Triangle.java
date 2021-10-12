package ru.mirea.task8.opt1;

import java.awt.*;
import java.util.Random;

public class Triangle extends Shape{
    double radius;
    public Triangle () {
        this.type = "Rectangle";
    }
    public void paintComponent(Graphics g) {
        Random rand = new Random();
        int [] x = {100,150,50};
        int [] y = {20,110,110};
        this.r = (int) (Math.random() * 255);
        this.g = (int) (Math.random() * 255);
        this.b = (int) (Math.random() * 255);
        g.setColor(new Color(this.r,this.g,this.b));
        g.fillPolygon(x, y, 3);
    }
}