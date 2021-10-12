package Dz.Auto;

public class AirTransport extends Transport {
    int wingspan;
    int min_strip_length;

    public AirTransport(int power, int max_speed, double weight, String car_model, int wingspan, int min_strip_length) {
        super(power, max_speed, weight, car_model);
        this.wingspan = wingspan;
        this.min_strip_length = min_strip_length;
    }

}
