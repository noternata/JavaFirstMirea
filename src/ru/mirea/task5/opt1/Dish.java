package ru.mirea.task5.opt1;

public abstract class Dish {
    private String name;
    private String type;
    public String getName(){return name;}
    public void setName(String name){
        this.name = name;
    }
    public String getType(){return type;}
    public Dish(String name, String type){
        this.name=name;
        this.type=type;
    }
    public Dish(){}
}
class Knife extends Dish{
    private int knifeLength;
    public Knife(String name, String type,int knifeLength){
        super(name,type);
        this.knifeLength = knifeLength;
    }
    public void DisplayInfo(){
        System.out.println(super.getName() +" , for: "+super.getType()+ " have " + knifeLength + "cm");
    }
}
class Fork extends Dish{
    private int forkLength;
    public Fork(String name,String type, int forkLength){
        super(name,type);
        this.forkLength = forkLength;
    }
    public void DisplayInfo(){
        System.out.println(super.getName() +" , for: "+super.getType()+ " have " + forkLength + "cm");
    }
}
class Plate extends Dish{
    private int plateRadius;
    public Plate(String name,String type, int plateRadius){
        super(name,type);
        this.plateRadius = plateRadius;
    }
    public void DisplayInfo(){
        System.out.println(super.getName() +" , for: "+super.getType()+ " have " + plateRadius + "cm");
    }
}