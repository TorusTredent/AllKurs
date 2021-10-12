package Dz.ATM;


public class AtmService extends Thread {
    public static synchronized void takeOffAllMoney(Purse purse) {
        int value = purse.getValue();
        if(value == 0){
            System.out.println("На счету нет денег");
        } else {
            for (int i = 0; i < value; i++) {
                if (value < 100) {
                    System.out.println(value + " - " + value);
                    value = 0;
                    System.out.println(value);
                    break;
                }
                value -= 100;
                System.out.println(value + " - " + 100);
                if (value == 0) {
                    break;
                }
            }
            purse.setValue(value);
        }
    }

    public static synchronized void takeOffMoney(Purse purse, int money) {
        int value = purse.getValue();
        if (value < money) {
            System.out.println("На счету недостаточно средств (");
        } else {
            value -= money;
            purse.setValue(value);
            System.out.println("На счету: " + purse.getValue());
        }
    }

    public static synchronized void addMoney(Purse purse, int money) {
        int value = purse.getValue();
        purse.setValue(value + money);
        System.out.println("Деньги добавлены на счет");
        System.out.println("На счету: " + purse.getValue());
    }
}
