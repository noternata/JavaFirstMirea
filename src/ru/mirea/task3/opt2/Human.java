package ru.mirea.task3.opt2;

public class Human {
    int age;
    String name;
    char gender;
    public Human(int age, String name, char gender){
        this.age = age;
        this.name = name;
        this.gender = gender;
    }
    public void Summary(){
        System.out.println("Human has name " + name + " and age " + age + ",Gender is " + gender);
    }
}
