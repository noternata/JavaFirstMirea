package ru.mirea.task17.myproj;


import java.util.Scanner;

// Пример, Перечисление сортов яблок
enum Doctors {
    Cardiolog(2500), Oftalmolog(1800), Terapevt(1100), Rentgen(2200), LOR(1500);

    // Переменная экземпляра price, служит для хранения цены
    private int price;

    // Конструктор Doctors(), ему передается цена за прием
    // (аргументы конструктору передаются в скобках после каждой перечисляемой константы)
    Doctors(int p) {
        price = p;
    }

    // Метод getPrice(), возвращающий значение цены
    int getPrice() {
        return price;
    }
}

public class DoctorsEnum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bыберите врача, которого хотите посетить:" + "\n" + "1. Кардиолог"+ "\n" +"2. Офтальмолог"+ "\n" +
                "3. Терапевт"+ "\n" +"4. Рентген"+ "\n" +"5. ЛОР");
        int n = sc.nextInt();
        Doctors doc; // объявляется переменная doc перечислимого типа Doctors
        switch (n){
            case 1:
                doc = Doctors.Cardiolog;
                break;
            case 2:
                doc = Doctors.Oftalmolog;
                break;
            case 3:
                doc = Doctors.Terapevt;
                break;
            case 4:
                doc = Doctors.Rentgen;
                break;
            case 5:
                doc = Doctors.LOR;
                break;
            default:
                doc = Doctors.Terapevt;
                break;
        }

        // вывести значение перечислимого типа
        System.out.println("Выбранный Вами врач: " + doc);
        System.out.println();

        //doc = Doctors.Cardiolog;

        // сравнить два значения перечислимого типа
        //if (doc == Doctors.Cardiolog) System.out.println("Переменная ар содержит Cardiolog.\n");

        // применить перечисление для управления оператором switch
        switch (doc) {
            case Cardiolog:
                System.out.println("Прием будет стоить: "+ doc.getPrice());
                break;
            case Oftalmolog:
                System.out.println("Прием будет стоить: "+ doc.getPrice());
                break;
            case Terapevt:
                System.out.println("Прием будет стоить: "+ doc.getPrice());
                break;
            case Rentgen:
                System.out.println("Прием будет стоить: "+ doc.getPrice());
                break;
            case LOR:
                System.out.println("Прием будет стоить: "+ doc.getPrice());
                break;
        }
    }
}
