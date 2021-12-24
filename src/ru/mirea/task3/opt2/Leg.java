package ru.mirea.task3.opt2;

public class Leg extends Human{
    public int length;
    public String color;
    public Leg(int age, String name, char gender, int length, String color) {
        super(age, name, gender);
        this.length = length;
        this.color = color;
    }
    public void Summary(){
        System.out.println("Leg has " + length + " of length and the color is " + color);
    }
}
