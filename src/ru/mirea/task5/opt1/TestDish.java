package ru.mirea.task5.opt1;

public class TestDish {
    public static void main(String[] args){
        Knife d1 = new Knife("Knife #1","for meat",19);
        Plate d2 = new Plate("Plate #1","for main meal",12);
        Fork d3 = new Fork("fork #3","for deserts",5);
        d1.DisplayInfo();
        d2.DisplayInfo();
        d3.DisplayInfo();
    }
}
