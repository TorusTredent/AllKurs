package Lessons.Lesson7.ConsoleCalculator;

import java.util.Arrays;
import java.util.Scanner;

public class Menu {
    public void showMenu(){
        System.out.println("Приветсвую вас в новом калькуляторе!");

        Scanner scanner = new Scanner(System.in);
        RecordSave recSave = new RecordSave(new double[]{0, 0, 0, 0, 0});

        double stop = 1;
        int countOfOperations = 0;

        while(stop == 1){
            int choice = 0;
            if(countOfOperations == 1) {
                System.out.println("Хотите использовать последнее сохраненное значение для операций над ним? 1-да, 0-нет");
                choice = scanner.nextInt();
            }

            Variables variables = new Variables(1, 2);
            variables.inputAndCheckVariables(choice);

            double x;

            if(choice == 1){
                x = recSave.returnLastRecord();
            } else {
                x = variables.getX();
            }
            double y = variables.getY();

            OperationMenu opMenu = new OperationMenu(1);
            MathOperations mOperation = new MathOperations(1, 1, 1);

            switch (opMenu.showOperationMenu()) {
                case 1 -> {
                    mOperation.sum(x, y);
                    System.out.println(mOperation.getRecord());
                }
                case 2 -> {
                    mOperation.subtract(x, y);
                    System.out.println(mOperation.getRecord());
                }
                case 3 -> {
                    mOperation.diff(x, y);
                    System.out.println(mOperation.getRecord());
                }
                case 4 -> {
                    mOperation.multiply(x, y);
                    System.out.println(mOperation.getRecord());
                }
            }

            double record = mOperation.getRecord();
            recSave.saveRecording(record);

            countOfOperations = 1;
            System.out.println(Arrays.toString(recSave.getArr()));
            System.out.println("Операция закончена, если хотите продолжить нажмите - 1, если нет - 0");
            stop = scanner.nextInt();
        }
        System.out.println("Вы закрыли калькулятор, приятного дня ^_^");
    }
}
