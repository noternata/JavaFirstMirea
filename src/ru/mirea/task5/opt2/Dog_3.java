package ru.mirea.task5.opt2;

public abstract class Dog_3 {
    private String name;
    private int height;
    private int weight;

    public String getName(){return name;}
    public int getHeight(){return height;}
    public int getWeight(){return weight;}

    public Dog_3(String name, int height, int weight){
        this.name=name;
        this.height=height;
        this.weight=weight;
    }
    //public abstract void displayInfo();
}
class Beagle extends Dog_3 {
    private String breed;
    private String spots; //пятна в окрасе
    public Beagle(String breed,String name, int height, int weight,String spots){
        super(name,height,weight);
        this.breed=breed;
        this.spots=spots;
    }
    public void displayInfo(){
        System.out.println("Порода:"+breed+"\nИмя: "+super.getName() +"\nРост: "+super.getHeight()
                +" см" + "\nВес: "+super.getWeight() +" кг"+"\nДля породы характерно: "+spots);
    }
}
class Poodle extends Dog_3 {
    private String breed;
    private String curls;
    public Poodle(String breed,String name, int height, int weight,String curls){
        super(name,height,weight);
        this.breed=breed;
        this.curls=curls;
    }
    public void displayInfo(){
        System.out.println("Порода:"+breed+"\nИмя: "+super.getName() +"\nРост: "+super.getHeight()
                +" см" + "\nВес: "+super.getWeight() +" кг"+"\nДля породы характерно: "+curls);
    }
}
