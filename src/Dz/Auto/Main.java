package Dz.Auto;

public class Main {
    public static void main(String[] args) {
        Car car = new Car(100,120,1900,"Nissan", 4, 11,"Universal", 5);
        car.textOutputCar();
        car.specialMethodeCar(3);
        System.out.println("============================================");
        Truck truck = new Truck(150,100,3100,"Mercedes", 4, 14, 150);
        truck.textOutputTruck();
        truck.checkingWeight(140);
        System.out.println("============================================");
        CivilTr civilTr = new CivilTr(1000,700,7000,"Boeing", 13, 400, 200, true);
        civilTr.textOutputCivilTr();
        civilTr.checkingCapacity(210);
        System.out.println("============================================");
        MilitaryTr militaryTr = new MilitaryTr(1500,900,8000,"Aerobus", 15, 600, false, 6);
        militaryTr.textOutputMilitaryTr();
        militaryTr.ejection();
        militaryTr.shot();
    }
}
