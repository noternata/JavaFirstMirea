package ru.mirea.task6.opt2;

import ru.mirea.task6.opt1.Nameable;

public class Car2 implements Priceable {
    private String name;
    private int price;
    public Car2(String n,int p){
        this.name = n;
        this.price=p;
    }
    public void getName(){
        System.out.print("Car: "+ this.name+" by price: ");
    }
    public int getPrice(){return this.price;}
}
