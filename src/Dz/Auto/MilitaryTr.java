package Dz.Auto;

public class MilitaryTr extends AirTransport{
    private final boolean ejection_system;
    private final int number_missiles;

    public MilitaryTr(int power, int max_speed, double weight, String car_model, int wingspan, int min_strip_length, boolean ejection_system, int number_missiles) {
        super(power, max_speed, weight, car_model, wingspan, min_strip_length);
        this.ejection_system = ejection_system;
        this.number_missiles = number_missiles;
    }
    public void textOutputMilitaryTr(){
        System.out.println("Power of transport: " + power + " hp;");
        System.out.println("Maximum speed: " + max_speed + " km/h;");
        System.out.println("Mass of transport: " + weight + " kg;");
        System.out.println("Model of car: " + car_model);
        System.out.println("Wingspan: " + wingspan);
        System.out.println("Minimum runway length for take-off: " + min_strip_length);
        System.out.println("The presence of a bailout system: " + ejection_system);
        System.out.println("Number of missiles on board: " + number_missiles);
        System.out.println("Calculated power: " + powerCalculation(power) + " kV;");
    }

    public void shot(){
        if(number_missiles != 0){
            System.out.println("Ракета пошла... ");
        }else{
            System.out.println("Боеприпасы отсутсвуют");
        }
    }

    public void ejection(){
        if(ejection_system){
            System.out.println("Катапультирование прошло успешно");
        } else{
            System.out.println("У вас нет такой системы");
        }
    }

    private double powerCalculation(int power){
        return (double) power * 0.75;
    }
}
