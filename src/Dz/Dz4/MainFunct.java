package Dz.Dz4;

import java.util.Scanner;

public class MainFunct {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 2 числа a и b: ");
        double a = scanner.nextInt();
        double b = scanner.nextInt();
        Functions functions = new Functions(a, b);
        functions.function();
    }
}
