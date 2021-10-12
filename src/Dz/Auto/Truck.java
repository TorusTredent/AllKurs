package Dz.Auto;

public class Truck extends LandTransport{
    private final double carrying;

    public Truck(int power, int max_speed, double weight, String car_model, int number_of_wheels, double fuel, double carrying) {
        super(power, max_speed, weight, car_model, number_of_wheels, fuel);
        this.carrying = carrying;
    }

    public void textOutputTruck(){
        System.out.println("Power of transport: " + power + " hp;");
        System.out.println("Maximum speed: " + max_speed + " km/h;");
        System.out.println("Mass of transport: " + weight + " kg;");
        System.out.println("Model of car: " + car_model);
        System.out.println("Number of wheels: " + number_of_wheels);
        System.out.println("Fuel consumption: " + fuel + " l;");
        System.out.println("Lifting capacity: " + carrying);
        System.out.println("Calculated power: " + powerCalculation(power) + " kV;");
    }

    public void checkingWeight(double weight){
        if(weight < 0){
            System.out.println("Количество груза введено не верно");
        }else {
            if (carrying >= weight) {
                System.out.println("Грузовик загружен");
            } else {
                System.out.println("Вам нужен грузовик побольше");
            }
        }
    }

    private double powerCalculation(int power){
        return (double) power * 0.75;
    }
}
