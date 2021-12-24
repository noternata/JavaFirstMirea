package ru.mirea.task3.opt2;

public class TestHuman {
    public static void main(String[] args){
        Human c1 = new Human(21,"Petr", 'M');
        Hand c2 = new Hand (21,"Petr",'M',32,"Black");
        Hand c3 = new Hand (21,"Petr",'M',32,"Black");
        Leg c4 = new Leg (21,"Petr",'M',56,"White");
        Leg c5 = new Leg (21,"Petr",'M',56,"White");
        c2.Summary();
        //c3.Summary();
        c4.Summary();
        //c5.Summary();
        c1.Summary();
    }


}
