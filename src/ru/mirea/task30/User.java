package ru.mirea.task30;
import java.util.*;

public class User {
    private int id;
    private Position position;
    private String name;
    private int age;
    private Gender gender;
    private static Map<Integer, User> allUsers = new HashMap<>();
    private static int countId = 0;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return age == user.age &&
                Objects.equals(name, user.name) &&
                gender == user.gender;
    }
    @Override
    public int hashCode() {

        return Objects.hash(name, age, gender);
    }
    private boolean hasUser(){
        for (User user : allUsers.values()){
            if (user.equals(this) && user.hashCode() == this.hashCode()){
                return true;
            }
        }
        return false;
    }
    public User(Position position, String name, int age, Gender gender) {
        if (name != null && !name.isEmpty() && age > 0 && gender != null && position!=null){
            this.position = position;
            this.name = name;
            this.age = age;
            this.gender = gender;

            if (!hasUser()) {
                countId++;
                this.id = countId;
                allUsers.put(id, this);
            }
        }
    }
    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", position =" + position +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + gender +
                '}';
    }
    public static List<User> getAllUsers(){
        return new ArrayList<>(allUsers.values());
    }

    public static List<User> getAllUsers(Gender gender){
        List<User> listAllUsers = new ArrayList<>();
        for (User user : allUsers.values()){
            if (user.gender == gender){
                listAllUsers.add(user);
            }
        }
        return listAllUsers;
    }
    public static List<User> getAllUsers(Position position){
        List<User> listAllUsers1 = new ArrayList<>();
        for (User user : allUsers.values()){
            if (user.position == position){
                listAllUsers1.add(user);
            }
        }
        return listAllUsers1;
    }
    public static int getHowManyUsers(){
        return allUsers.size();
    }

    public static int getHowManyUsers(Gender gender){
        return getAllUsers(gender).size();
    }
    public static int getHowManyUsers(Position position){
        return getAllUsers(position).size();
    }
    public static int getAllAgeUsers(){
        int countAge = 0;
        for (User user : allUsers.values()){
            countAge += user.age;
        }
        return countAge;
    }

    public static int getAllAgeUsers(Gender gender){
        int countAge = 0;
        for (User user : getAllUsers(gender)){
            countAge += user.age;
        }
        return countAge;
    }
    public static int getAverageAgeOfAllUsers(){
        return getAllAgeUsers() / getHowManyUsers();
    }

    public static int getAverageAgeOfAllUsers(Gender gender){
        return getAllAgeUsers(gender) / getHowManyUsers(gender);
    }
    /*public static void main(String[] args) {
        new User("Евгений", 35, Sex.MALE);
        new User("Марина", 34, Sex.FEMALE);
        new User("Алина", 7, Sex.FEMALE);


        System.out.println("Все пользователи:");
        User.getAllUsers().forEach(System.out::println);
        System.out.println("Все пользователи: MALE");
        User.getAllUsers(Sex.MALE).forEach(System.out::println);
        System.out.println("Все пользователи: FEMALE");
        User.getAllUsers(Sex.FEMALE).forEach(System.out::println);
        System.out.println("================================================");
        System.out.println("       всех пользователей: " + User.getHowManyUsers());
        System.out.println("  всех пользователей MALE: " + User.getHowManyUsers(Sex.MALE));
        System.out.println("всех пользователей FEMALE: " + User.getHowManyUsers(Sex.FEMALE));
        System.out.println("================================================");
        System.out.println("       общий возраст всех пользователей: " + User.getAllAgeUsers());
        System.out.println("  общий возраст всех пользователей MALE: " + User.getAllAgeUsers(Sex.MALE));
        System.out.println("общий возраст всех пользователей FEMALE: " + User.getAllAgeUsers(Sex.FEMALE));
        System.out.println("================================================");
        System.out.println("       средний возраст всех пользователей: " + User.getAverageAgeOfAllUsers());
        System.out.println("  средний возраст всех пользователей MALE: " + User.getAverageAgeOfAllUsers(Sex.MALE));
        System.out.println("средний возраст всех пользователей FEMALE: " + User.getAverageAgeOfAllUsers(Sex.FEMALE));
        System.out.println("================================================");
    }/*/
}
