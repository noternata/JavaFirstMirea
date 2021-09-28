package ru.mirea.task5.opt2;

public class TestDog_3 {
    public static void main(String[] args){
        Beagle B1 = new Beagle("Бигль","Майк",40,25,"имеет характерные рыжие" +
                " и коричневые пятна в окрасе");
        Poodle P1 = new Poodle("Пудель","Лори",55,30,"однотонный окрас, " +
                "белого или рыжего цвета,характерна кучерявая шерсть");
        B1.displayInfo();
        System.out.println("\n");
        P1.displayInfo();

    }
}
