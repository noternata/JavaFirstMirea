package ru.mirea.task6.opt1;

public class Car implements Nameable{
    private String name;
    public Car(String n){
        this.name = n;
    }
    public String getName(){
        return name;
    }
}
