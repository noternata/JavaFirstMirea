package ru.mirea.task3.opt1;

public class Circle {
    private String name;
    private String color;
    private int R;
    public Circle(String n, String c, int r){
        name = n;
        color=c;
        R = r;
    }
    public Circle(){}
    public void setName(String n){
        this.name = n;
    }
    public String getName(){
        return name;
    }
    public void changeName(String n){
        this.name = n;
    }
    public void setColor(String c){
        this.color = c;
    }
    public String getColor(){
        return color;
    }
    public void changeColor(String c){
        this.color = c;
    }
    public void setR(int r){
        this.R = r;
    }
    public int getR(){
        return R;
    }
    public void changeR(int r){
        this.R = r;
    }
    public float getLength(){
        float length = (float) (this.R*6.28);
        return length;
    }
    public String toString(){
        return "Circle: "+name+", color: "+color+", R = "+R;
    }
}
