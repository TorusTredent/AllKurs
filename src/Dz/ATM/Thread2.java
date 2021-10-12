package Dz.ATM;

public class Thread2 extends Thread{
    private Purse value;
    private int money;

    public Thread2(Purse value, int money) {
        this.value = value;
        this.money = money;
    }

    @Override
    public void run() {
        AtmService.takeOffAllMoney(value);
        System.out.println("Поток 2 закрыт");
    }
}
