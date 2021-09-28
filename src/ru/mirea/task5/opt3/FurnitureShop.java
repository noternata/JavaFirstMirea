package ru.mirea.task5.opt3;

public class FurnitureShop {
    public static void main(String[] args)  {
        Sofa s1 = new Sofa( "Sofa for lounge",1000,"red","3 person");
        Chair c1 = new Chair("Kitchen chest",100,"brown",65);
        s1.DisplayInfo();
        c1.DisplayInfo();
    }
}
