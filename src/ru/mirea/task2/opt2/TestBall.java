package ru.mirea.task2.opt2;

public class TestBall {
    public static void main(String[] args) {
        Ball b1 = new Ball();
        Ball b2 = new Ball("Basketball","Brown",20);
        b1.setType("Football");
        b1.setColor("White and black");
        b1.setR(17);
        System.out.println(b1);
        System.out.println(b2);
    }
}
