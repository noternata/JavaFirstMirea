package ru.mirea.task7.opt56;

public class MovablePoint implements Movable {
    private int x;
    private int y;
    private int xSpeed;
    private int ySpeed;
    public MovablePoint(int x,int y,int xSpeed,int ySpeed){
        this.x=x;
        this.y=y;
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }
    public String toString(){
        return "x= "+this.x+", y= "+this.y;
    }

    @Override
    public void moveUp() {
        this.y+=this.ySpeed;
    }

    @Override
    public void moveDown() {
        this.y-=this.ySpeed;
    }

    @Override
    public void moveLeft() {
        this.x-=this.xSpeed;
    }

    @Override
    public void moveRight() {
        this.x+=this.xSpeed;
    }
}
