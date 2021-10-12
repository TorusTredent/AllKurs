package Lessons.Lesson7.ConsoleCalculator;

import java.util.Scanner;

public class OperationMenu {
    private int count;

    public OperationMenu(int count) {
        this.count = count;
    }

    public int showOperationMenu(){
        System.out.println("Выберите одну из оперций:");
        System.out.println("1) Сложение (+)");
        System.out.println("2) Вычитание (-)");
        System.out.println("3) Деление (/)");
        System.out.println("4) Умножение (*)");
        Scanner scanner = new Scanner(System.in);
        do{
            count = scanner.nextInt();
        }while(count >= 5 || count <= 0);
        return count;
    }
}
