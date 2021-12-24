package ru.mirea.task19;
import java.util.Scanner;

public class DocDayExcept {
    static String Week(int num) throws Exception {
        String[] week = new String[] {"", "Понедельник","Вторник","Среда","Четверг","Пятница","Суббота","Воскресенье"};
        if ((num < 1)||(num > 7)) throw new Exception("невозможно оформить запись на данный день\n");
        return ("запись оформлена на "+week[num]);
    }

    public static void main(String[] args) {
        try {
            System.out.println("на какой день оформить запись?");
            Scanner in = new Scanner(System.in);
            int d = in.nextInt();
            Week(d);
            System.out.println(Week(d));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
