package ru.mirea.task5.opt3;

public abstract class Furniture extends FurnitureShop{
    private String name;
    private int price;
    private String color;

    public Furniture(String name, int price, String color) {
        this.name=name;
        this.price=price;
        this.color=color;
    }

    public String getName(){return name;}
    public void setName(String name){
        this.name = name;
    }
    public int getPrice(){return price;}
    public void setPrice(int price){this.price = price;}
    public String getColor(){return color;}
    public void setColor(String color){
        this.color = color;
    }
}
class Chair extends Furniture{
    private int height;

    public Chair(String name, int price, String color, int height) {
        super(name, price, color);
        this.height = height;
    }
    public void DisplayInfo(){
        System.out.println(super.getName()+ " ,height: " + this.height + " cm"+" ,color: "+super.getColor()+
                " ,by price: "+super.getPrice()+" $$");
    }
}
class Sofa extends Furniture{
    private String width;

    public Sofa(String name, int price, String color, String width) {
        super(name, price, color);
        this.width = width;
    }

    public void DisplayInfo(){
        System.out.println(super.getName()+ " ,for: " + this.width +" ,color: "+super.getColor()+
                " ,by price: "+super.getPrice()+" $$");
    }
}