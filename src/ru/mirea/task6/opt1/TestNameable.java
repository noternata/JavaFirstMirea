package ru.mirea.task6.opt1;

public class TestNameable {
    public static void main(String[] args){
        Car c1 = new Car("BMW x6");
        Car c2 = new Car("Audi rs3");
        Car c3 = new Car("Porsche Cayenne");
        System.out.println(c1.getName());
        System.out.println(c2.getName());
        System.out.println(c3.getName());
    }
}
