package Dz.Cosmodrome;

import java.util.Random;
import java.util.Scanner;

public class StarShip implements IStart{

    private boolean checked;

    public StarShip(boolean checked) {
        this.checked = checked;
    }

    public void launch(){
        System.out.println("Звонок в диспетчерскую ...");
        System.out.println("*На другой стороне телефона оказываются террористы. Они предлагают задание, после которого будет решена судьба коробля*");
        if(!verification(checked)){
            System.out.println("*ВЗРЫВ* *ошметки коробля раскидывает по взлетной площаке*");
            System.out.println("Корабль был взорван, экипаж мертв, ВЫ ВИНОВАТЫ ВО ВСЕМ ЭТОМ ...");
        }else {
            System.out.println("Вы угадали... Но это не конец...");
            engineStart();
            start();
        }
    }


    @Override
    public boolean verification(boolean checked) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int randomNumber = random.nextInt(3);
        System.out.println("Выберите число из предложенных, иначе корабль будет взорван: 1)0; 2)1; 3)2; 4)3");
        int selectedNumber = scanner.nextInt();
        scanner.close();
        if(selectedNumber == randomNumber){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public void engineStart() {
        System.out.println("Запуск двигателя начнется через: ");
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
            System.out.println("...");
        }
    }

    @Override
    public void start() {
        System.out.println("Двигатель запущен...");
    }
}
