package ru.mirea.task24;

import java.util.List;

class Address{

    public static boolean isValid(String address) {
        return address.matches("^((25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$");
    }

}
public class Task24 {
    public static void main(String[] args) {
        List.of(
                        "127.0.0.1",
                        "255.255.255.0",
                        "1300.6.7.8",
                        "bbb.bbb.aaa.bcd"
                ).stream().map(Address::isValid)
                .forEach(System.out::println);
    }
}
