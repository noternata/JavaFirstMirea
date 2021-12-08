package ru.mirea.task27;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class UsersPolicy {
    public static void main(String[] args) {
        HashMap<Integer, String> policyAndNames = new HashMap<>();
        policyAndNames.put(212133, "Лидия Аркадьевна Бубликова");
        policyAndNames.put(162348, "Иван Михайлович Серебряков");
        policyAndNames.put(8082771, "Дональд Джон Эриксон");
        System.out.println("Все пользователи системы и номера их полисов:\n"+policyAndNames+ "\n");

        String P1Name = policyAndNames.get(212133);
        System.out.println("Пациентом с номером полиса 212133 : "+P1Name + "\n");

        policyAndNames.remove(162348);
        System.out.println("Пациент с номером полиса 162348 перестал посещать больницу и бул удален из списка пользователей приложением.\nОставшиеся пользователи приложением:\n"+policyAndNames+ "\n");

        System.out.println("Проверка, пользовался ли пациент услугами больницы ранее :");
        System.out.println("При проверке по полису: "+policyAndNames.containsKey(11111));
        System.out.println("При проверке по ФИО: "+policyAndNames.containsValue("Дональд Джон Трамп")+"\n");

        Set<Integer> keys = policyAndNames.keySet();
        System.out.println("Полисы всех пациентов: " + keys);
        ArrayList<String> values = new ArrayList<>(policyAndNames.values());
        System.out.println("ФИО всех пациентов: " + values);
    }
}
