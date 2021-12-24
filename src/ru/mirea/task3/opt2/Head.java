package ru.mirea.task3.opt2;

public class Head extends Human{
    public int radius;
    public Head(int age, String name, char gender, int radius) {
        super(age, name, gender);
        this.radius = radius;
    }
    public void Summary(){
        System.out.println("Head has " + radius + " of radius");
    }
}
