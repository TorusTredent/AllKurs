package Dz.Cosmodrome;

import java.util.Random;

public class Apollon13 implements IStart{

    private boolean checked;

    public Apollon13(boolean checked) {
        this.checked = checked;
    }

    public void launch(){
        if(!verification(checked)){
            System.out.println("Шифр введен неверно, запуск отменяется...");
        }else {
            engineStart();
            start();
        }
    }

    @Override
    public boolean verification(boolean checked) {
        System.out.println("Вводится секретный шифр");
        Random random = new Random();
        int cipher = random.nextInt(5);
        for (int i = 0; i < 5; i++) {
            System.out.println("***********");
        }
        int coin = random.nextInt(2);
        if(coin == 1){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public void engineStart() {
        System.out.println("Все системы в норме");
        System.out.println("Производится запуск всех систем");
    }

    @Override
    public void start() {
        System.out.println("Двигатель запущен. Работа двигателя на полную мощность");
        System.out.println("...........");
        System.out.println("Коробаль выходит на орбиту...");
    }
}
