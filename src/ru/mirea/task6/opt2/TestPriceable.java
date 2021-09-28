package ru.mirea.task6.opt2;

import ru.mirea.task6.opt1.Car;

public class TestPriceable {
    public static void main(String[] args){
        Car2 c1 = new Car2("BMW x6",7);
        Car2 c2 = new Car2("Audi rs3",3);
        Car2 c3 = new Car2("Porsche Cayenne",6);
        c1.getName();
        System.out.print(c1.getPrice());
        System.out.print(" million rub \n");
        c2.getName();
        System.out.print(c2.getPrice());
        System.out.print(" million rub \n");
        c3.getName();
        System.out.print(c3.getPrice());
        System.out.print(" million rub \n");
    }
}
