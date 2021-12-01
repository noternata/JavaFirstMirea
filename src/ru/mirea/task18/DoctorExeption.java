package ru.mirea.task18;
import java.util.Scanner;

class Check {
    public static void checkGPA(int n) throws  DException {
        if (n<1 || n > 5) {
            throw new DException("Данного врача " + n + " нет в списке доступных для вас врачей " );
        }
        System.out.println("Запись к врачу под номером : " + n + " будет создана");
    }
}
class DException extends Exception{
    public DException(String message) {
        super(message);
    }
}
public class DoctorExeption {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bыберите врача, которого хотите посетить:" + "\n" + "1. Кардиолог"+ "\n" +"2. Офтальмолог"+ "\n" +
                "3. Терапевт"+ "\n" +"4. Рентген"+ "\n" +"5. ЛОР");
        int n = sc.nextInt();
        System.out.println("Check your GPA: ");

        try {
            Check.checkGPA(n);

        } catch (DException e) {
            System.out.println("Вы неверно указали номер врача");
            System.out.println(e.getMessage());

        }
    }
}
