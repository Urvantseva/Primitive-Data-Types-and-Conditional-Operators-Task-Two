public class Main {
    public static void main(String[] args) {
        System.out.println("Здравствуйте!");

        int customerAccount = 100; // изначальная сумма на счету
        int refill = 1100; // пополнение счёта
        int bonus;

        if (refill > 1000) {
            bonus = refill / 100;
        }
        else {
            bonus = 0;
        }
        int balance = customerAccount + refill +  bonus;
        System.out.println("Ваш баланс: "  + balance + " руб. Ваш бонус: "+ bonus + "руб.");

        }
    }


