public class Main {
    public static void main(String[] args) {
        int balance = 200;
        int payment = 1150;
        int bonusCost = 100;
        int bonus = payment / bonusCost;
        int newBalance = balance + payment + bonus;
        int minPaymentBonus = 1000;

        if (payment >= minPaymentBonus) {
            System.out.println("Вам начислен бонус " + bonus + " рублей") ;
        } else {
            System.out.println("Для получения бонуса добавьте еще чуть-чуть");
        }
        System.out.println("Баланс: " + newBalance + " рублей") ;

    }
}
