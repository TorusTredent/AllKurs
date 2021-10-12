package Dz.Dz4;

import java.util.Scanner;

public class CrosNulls {
    public static void main(String[] args) {
        int[][] arr = new int[3][3];
        int count = 1;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(count + " ");
                arr[i][j] = count;
                count++;
            }
            System.out.println();
        }
        int a;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Выберите число на его место будет поставлен X");
            while (!scanner.hasNextInt()) {
                System.out.println("Что-то не так с этим числом (‡▼益▼) , попробуй ввести другое ...");
                scanner.next();
            }
            a = scanner.nextInt();
            if (a < 0) {
                System.out.println("Введите положительное число. ");
            }
        } while (a <= 0 || a > 10);
        for (int i = 0; i < 2; i++) {
            switch (a) {
//            case 1:
//                array
//        }
            }
        }
    }
}
