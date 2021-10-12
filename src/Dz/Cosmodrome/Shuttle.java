package Dz.Cosmodrome;

import java.util.Random;

public class Shuttle implements IStart{

    private final boolean checked;

    public Shuttle(boolean checked) {
        this.checked = checked;
    }

    public void launch(){
        if(!verification(checked)) {
            System.out.println("Проверка провалена");
        }else {
            engineStart();
            start();
        }
    }

    @Override
    public boolean verification(boolean checked) {
        Random random = new Random();
        int checkVariable = random.nextInt(10);
        return checkVariable > 3;
    }

    @Override
    public void engineStart() {
        System.out.println("Двигатели Шатла запущены. Все системы в норме");
    }

    @Override
    public void start() {
        System.out.println("Двигатель Шатла запущен");
    }
}
