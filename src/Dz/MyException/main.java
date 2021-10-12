package Dz.MyException;

public class main {
    public static void main(String[] args) {
        Car car1 = new Car("Bmw", 210, 1200);
        car1.start();
        Car car2 = new Car("Mercedes", 240, 2000);
        car2.start();
        Car car3 = new Car("Audi", 225, 1800);
        car3.start();
    }
}
