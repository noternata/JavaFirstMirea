package ru.mirea.task2.opt1;

public class Shape {
    private String type;
    private String plane;
    private int V;

    public Shape(String t,String p ) {
        this.type = t;
        plane=p;
        V=0;
    }
    public Shape(String t,String p, int v) {
        this.type = t;
        plane=p;
        V=v;
    }
    public String toString(){
        return this.type +", Plane: "+ this.plane+", V="+ this.V +" m^3";
    }
}
