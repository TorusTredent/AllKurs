package Dz.MyException;

import java.util.Random;

public class Car {
    private String brand;
    private int speed;
    private double cost;

    public Car(String brand, int speed, double cost) {
        this.brand = brand;
        this.speed = speed;
        this.cost = cost;
    }

    public void start() {
        Random random = new Random();
        int i = random.nextInt(20);
        try {
            if (i % 2 == 0) {
                throw new Exception();
            } else {
                System.out.println("Ваш автомобииль " + brand + " завелся");
            }
        } catch (Exception e) {
            System.out.println("Автомобиль не завелся :(");
        }
    }


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
}
