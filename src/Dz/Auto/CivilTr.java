package Dz.Auto;

public class CivilTr extends AirTransport{
    private final int number_passengers;
    private final boolean business_class;

    public CivilTr(int power, int max_speed, double weight, String car_model, int wingspan, int min_strip_length, int number_passengers, boolean business_class) {
        super(power, max_speed, weight, car_model, wingspan, min_strip_length);
        this.number_passengers = number_passengers;
        this.business_class = business_class;
    }

    public void textOutputCivilTr(){
        System.out.println("Power of transport: " + power + " hp;");
        System.out.println("Maximum speed: " + max_speed + " km/h;");
        System.out.println("Mass of transport: " + weight + " kg;");
        System.out.println("Model of car: " + car_model);
        System.out.println("Wingspan: " + wingspan);
        System.out.println("Minimum runway length for take-off: " + min_strip_length);
        System.out.println("Number of passengers: " + number_passengers);
        System.out.println("Business class: " + business_class);
        System.out.println("Calculated power: " + powerCalculation(power) + " kV;");
    }

    public void checkingCapacity(int passengers){
        if(passengers < 0){
            System.out.println("Число пассажиров введено не верно");
        }else {
            if (number_passengers >= passengers) {
                System.out.println("Гражданский воздушный транспорт заполнен");
            } else {
                System.out.println("Вам нужен гражданский воздушный транспорт побольше");
            }
        }
    }

    private double powerCalculation(int power){
        return (double) power * 0.75;
    }
}
