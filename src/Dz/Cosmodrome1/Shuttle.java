package Dz.Cosmodrome1;

import java.util.Random;

public class Shuttle implements IStart{

    @Override
    public boolean preLaunchCheck() {
        Random random = new Random();
        return random.nextInt(10) > 3;
    }

    @Override
    public void startEngine() {
        System.out.println("Запуск двигателей");
    }

    @Override
    public void start() {
        System.out.println("Поехали!");
    }
}
