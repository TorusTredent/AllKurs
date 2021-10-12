package Dz.ATM;

public class Atm {
    public static void main(String[] args) {
        Purse purse = new Purse(1, 1129);

        Thread1 thread1 = new Thread1(purse, 1000);
        Thread2 thread2 = new Thread2(purse, 30);
        thread1.start();
        thread2.start();
    }
}
