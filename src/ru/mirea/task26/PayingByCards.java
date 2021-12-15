package ru.mirea.task26;
import java.util.Scanner;

interface PayStrategy {
    void pay();
}
class Pay {

    PayStrategy payStrategy;

    public void pay() {
        payStrategy.pay();
    }
}
class OnlineWalletPayS implements PayStrategy {
    @Override
    public void pay() {
        System.out.println("Введите номер электронного кошелька");
        Scanner in = new Scanner(System.in);
        in.next();

        System.out.println("На ваш номер телефона выслан код. Введите его для оплаты.");
        int kod = 100000 + (int) (Math.random() * 999999);
        System.out.println(kod);

        int kod1 = in.nextInt();

        while (kod1 != kod) {
            System.out.println("Неверный код. Попробуйте ещё раз: ");
            kod1 = in.nextInt();
        }
    }
}
class OnlineWallet extends Pay {

    public OnlineWallet() {
        this.payStrategy = new OnlineWalletPayS();
    }
}
class CreditCardPayS implements PayStrategy {
    @Override
    public void pay() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите номер карты: ");
        in.next();
        System.out.println("Введите CVC код с обратной стороны карты: ");
        in.next();
    }
}
class CreditCard extends Pay {

    public CreditCard () {
        this.payStrategy = new CreditCardPayS();
    }
}

public class PayingByCards {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String order;
        System.out.print("Введите номер заказа: ");
        order = sc.next();

        System.out.println("Выберите способ оплаты: \n" +
                "1.Кредитная карта\n" +
                "2.Электронный кошелёк");

        int temp;
        temp = sc.nextInt();

        switch (temp) {
            case 1 -> {
                CreditCard creditCard = new CreditCard();
                creditCard.pay();
            }
            case 2 -> {
                OnlineWallet onlineWallet = new OnlineWallet();
                onlineWallet.pay();
            }
            default -> System.out.print("Ошибка ввода");
        }

        System.out.println("Заказ \""+order+"\" успешно оплачен. Спасибо за покупку!");
    }
}
