package Dz.Dz4.Cros_Null;

import java.util.Scanner;

public class ChoiceCrosNull extends CreatCrosNull {

    public void choices(){
        setChoices();
    }

    private void setChoices(){
        int a;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Выберите число на его место будет поставлен X");
            while(!scanner.hasNextInt()){
                System.out.println("Что-то не так с этим числом (‡▼益▼) , попробуй ввести другое ...");
                scanner.next();
            }
            a = scanner.nextInt();
            if (a < 0){
                System.out.println("Введите положительное число. ");
            }
        }while(a <= 9);
        switch (a){
            case 1:
        }
    }
}
