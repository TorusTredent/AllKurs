package Dz.Auto;

public class LandTransport extends Transport{
    int number_of_wheels;
    double fuel;

    public LandTransport(int power, int max_speed, double weight, String car_model, int number_of_wheels, double fuel) {
        super(power, max_speed, weight, car_model);
        this.number_of_wheels = number_of_wheels;
        this.fuel = fuel;
    }

}
