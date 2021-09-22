package ru.mirea.task2.opt4;

import java.util.ArrayList;

public class TestDog {
    private static ArrayList<Dog> list = new ArrayList<Dog>();

    public static void addDog(Dog newDog){
        list.add(newDog);
    }
    public static void main(String[] args){
        Dog d1 = new Dog("Mike", 2);
        addDog(d1);
        Dog d2 = new Dog("Helen", 7);
        addDog(d2);
        Dog d3 = new Dog("Bob");
        addDog(d3);
        d3.setAge(1);
        System.out.println(d1);
        d1.intoHumanAge();
        d2.intoHumanAge();
        d3.intoHumanAge();
    }
}