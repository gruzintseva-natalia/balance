public class Main {
    public static void main(String[] args) {
        int balance = 100;
        int payment = 10;
        int bonusCost = 100;
        int bonus = payment / bonusCost;
        int newBalance = balance + payment;
        int minPaymentBonus = 1000;
        boolean isAvailableBonus = payment >= minPaymentBonus;

        if (isAvailableBonus) {
            System.out.println("Вам начислен бонус " + bonus + " рублей") ;
            newBalance += bonus;
        } else {
            System.out.println("Для получения бонуса добавьте еще чуть-чуть");
        }
        System.out.println("Баланс: " + newBalance + " рублей") ;

    }
}
