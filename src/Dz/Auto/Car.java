package Dz.Auto;

public class Car extends LandTransport{
    private final String body_type;
    private final int number_passengers;

    public Car(int power, int max_speed, double weight, String car_model, int number_of_wheels, double fuel, String body_type, int number_passengers) {
        super(power, max_speed, weight, car_model, number_of_wheels, fuel);
        this.body_type = body_type;
        this.number_passengers = number_passengers;
    }

    public void textOutputCar(){
        System.out.println("Power of transport: " + power + " hp;");
        System.out.println("Maximum speed: " + max_speed + " km/h;");
        System.out.println("Mass of transport: " + weight + " kg;");
        System.out.println("Model of car: " + car_model);
        System.out.println("Number of wheels: " + number_of_wheels);
        System.out.println("Fuel consumption: " + fuel + " l;");
        System.out.println("Body type: " + body_type);
        System.out.println("Number of passengers: " + number_passengers);
        System.out.println("Calculated power: " + powerCalculation(power) + " kV;");
    }

    public void specialMethodeCar(double time){
        System.out.print("За время " + time + " ч, автомобиль " + car_model + " двигаясь с максимальной скоростью " + max_speed + " км/ч проедет ");
        distanceCalculation(max_speed, time);
        System.out.print(" км и израсходует ");
        System.out.printf("%.2f",fuelCalculation(fuel, max_speed, time));
        System.out.println(" литров топлива. ");
    }


    private void distanceCalculation(int max_speed, double time){
        double distance = max_speed * time;
        System.out.printf("%.2f",distance);
    }

    private double fuelCalculation(double fuel, int max_speed, double time){
        double distance = max_speed * time;
        return (fuel * distance)/100;
    }


    private double powerCalculation(int power){
        return (double) power * 0.75;
    }

}
