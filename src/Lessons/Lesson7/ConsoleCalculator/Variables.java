package Lessons.Lesson7.ConsoleCalculator;

import java.util.Scanner;

public class Variables {
    private double x, y;

    public Variables(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void inputAndCheckVariables(int choice){
        Scanner scanner = new Scanner(System.in);
        if(choice == 0) {
            System.out.println("Введите 2 числа: ");
            while (!scanner.hasNextDouble()) {
                System.out.println("Что-то не так с этим числом (‡▼益▼) , попробуй ввести другое ...");
                scanner.next();
            }
            setX(scanner.nextDouble());
            while (!scanner.hasNextDouble()) {
                System.out.println("Что-то не так с этим числом (‡▼益▼) , попробуй ввести другое ...");
                scanner.next();
            }
            setY(scanner.nextDouble());
        } else {
            System.out.println("Введите второе число: ");
            while (!scanner.hasNextDouble()) {
                System.out.println("Что-то не так с этим числом (‡▼益▼) , попробуй ввести другое ...");
                scanner.next();
            }
            setY(scanner.nextDouble());
        }
    }



    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
}
