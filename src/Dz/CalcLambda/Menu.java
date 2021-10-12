package Dz.CalcLambda;

import java.util.Arrays;
import java.util.Scanner;

public class Menu {
    Scanner scan = new Scanner(System.in);
    Double[] arr = new Double[5];
    private int count = 0;
    private boolean temp = false;

    public void messageHello() {
        System.out.println("Хелоу итс калькулятор");
        menu();
    }

    private void menu() {
        System.out.println("1 - сложение");
        System.out.println("2 - вычитание");
        System.out.println("3 - умножение");
        System.out.println("4 - деление");
        System.out.println("5 - выход");
        calculator();
    }

    private void calculator() {

        CheckInt checkInt = () -> {
            while (!scan.hasNextInt()) {
                System.out.println("Вы ввели значение не того типа");
                scan.next();
            }
            return scan.nextInt();
        };
        CheckDouble checkDouble = () -> {
            while (!scan.hasNextDouble()) {
                System.out.println("Вы ввели значение не того типа");
                scan.next();
            }
            return scan.nextDouble();
        };

        Operation sum = (x, y) -> {
            System.out.println(x + " + " + y + " = " + (x + y));
            return x + y;
        };
        Operation minus = (x, y) -> {
            System.out.println(x + " - " + y + " = " + (x - y));
            return x - y;
        };
        Operation multiply = (x, y) -> {
            System.out.println(x + " * " + y + " = " + (x * y));
            return x * y;
        };
        Operation diff = (x, y) -> {
            System.out.println(x + " / " + y + " = " + (x / y));
            return x / y;
        };

        SaveRecord saveRecord = (record) -> {
            arr[count] = record;
            if (count == 4) {
                count = 0;
            } else count++;
        };
        ReturnRecord returnRecord = () -> {
            if (count == 0) {
                return arr[4];
            }
            return arr[count - 1];
        };
        ReturnX returnX = () -> {
            System.out.println("Хотите использовать значение из памяти? 1 - да, 2 - нет");
            int value = checkInt.check();
            if (value != 1 && value != 2) {
                System.out.println("Такой пункт отсутсвует ");
                menu();
            }
            if (value == 2) {
                System.out.println("Введите 2 значения");
                return checkDouble.check();
            } else {
                if (temp) {
                    System.out.println("Введите 2-е значение");
                    return returnRecord.usingRecord();
                } else {
                    System.out.println("В памяти еще нет значения");
                    menu();
                }
            }
            return 0;
        };


        int i = checkInt.check();

        switch (i) {
            case 1: {
                double x = returnX.returnX();
                double y = checkDouble.check();
                saveRecord.save(sum.operation(x, y));
                temp = true;
                menu();
                break;
            }
            case 2: {
                double x = returnX.returnX();
                double y = checkDouble.check();
                saveRecord.save(minus.operation(x, y));
                temp = true;
                menu();
                break;
            }
            case 3: {
                double x = returnX.returnX();
                double y = checkDouble.check();
                saveRecord.save(multiply.operation(x, y));
                temp = true;
                menu();
                break;
            }
            case 4: {
                double x = returnX.returnX();
                double y = checkDouble.check();
                saveRecord.save(diff.operation(x, y));
                temp = true;
                menu();
                break;
            }
            case 5: {
                System.out.println("Завершение программы");
                break;
            }
            default: {
                System.out.println("Такой пункт отсутсвует, выберите из предложенных");
                menu();
            }
        }
    }
}
