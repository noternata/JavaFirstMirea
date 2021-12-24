package ru.mirea.task20;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

class Timing {
    private String name;
    private String surname;
    private int id;
    private static int cnt = 0;

    public Timing(String name, String surname) {
        this.name = name;
        this.surname = surname;
        id = ++cnt;
    }
}
public class Time {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        ArrayList<Timing> users = new ArrayList<Timing>();
        ArrayList<Calendar> dates = new ArrayList<Calendar>();


        System.out.println("Registration");

        System.out.println("Введите имя и фамилию: ");
        String name = in.next();
        String surname = in.next();
        Timing user = new Timing(name, surname);
        Calendar date = new GregorianCalendar();
        users.add(user);
        dates.add(date);


        System.out.println();
        for (int i = 0; i < users.size(); i++){
            //System.out.println(users.get(i));
            System.out.println("Date of registration: "+dateFormat.format(dates.get(i).getTime()));
        }
    }

}
