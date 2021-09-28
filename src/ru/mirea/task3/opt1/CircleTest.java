package ru.mirea.task3.opt1;

public class CircleTest { public static void main(String[] args){
    Circle c1 = new Circle("Circle 1","white", 10);
    Circle c2 = new Circle();
    c1.setR(15);
    System.out.println("Color of "+c1.getName() +": "+c1.getColor());
    c2.setName("Circle 2");
    c2.setColor("green");
    System.out.println(c1);
    System.out.println("Length of "+c1.getName() +": "+c1.getLength());
}
}
