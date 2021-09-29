package ru.mirea.task7.opt56;

public class MovableTest {
    public static void main(String[] args) {
        //Test point
        MovablePoint p1 = new MovablePoint(1,1,5,3);
        System.out.println("Initial position of point: "+p1);
        p1.moveUp();
        p1.moveRight();
        System.out.println("Ending position of point:: "+p1);
        //Test circle
        MovableCircle c1= new MovableCircle(5,5,3,3,2);
        System.out.println("Initial position of circle: "+c1);
        c1.moveLeft();
        c1.moveUp();
        System.out.println("Ending position of circle: "+c1);
        //Test rectangle
        MovableRectangle r1= new MovableRectangle(1,7,10,2,2,2);
        System.out.println("Initial position of rectangle: "+r1);
        r1.moveDown();
        r1.moveRight();
        System.out.println("Ending position of rectangle: "+c1);
    }
}
