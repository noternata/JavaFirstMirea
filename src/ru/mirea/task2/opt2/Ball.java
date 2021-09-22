package ru.mirea.task2.opt2;

public class Ball {
    private String type;
    private String color;
    private int R;
    public Ball(){}
    public Ball(String t,String c,int r){
        this.type=t;
        this.color = c;
        this.R= r;
    }
    public void setType(String type){
        this.type = type;
    }
    public void setColor(String color){
        this.color = color;
    }
    public void setR(int R){
        this.R = R;
    }
    public String toString(){
        return "Type of ball: " +this.type+", color: "+ this.color+", radius: "+this.R;
    }
}
