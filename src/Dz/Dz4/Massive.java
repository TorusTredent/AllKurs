package Dz.Dz4;

import java.util.Random;
import java.util.Scanner;

public class Massive {
    public static void main(String[] args) {
//        Создаём квадратную матрицу, размер вводим с клавиатуры. Заполняем
//        случайными числами в диапазоне от 0 до 50. И выводим на консоль(в виде
//        матрицы).
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива n: ");
        int n = scanner.nextInt();
        int[][] array1 = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                array1[i][j] = random.nextInt(50);
            }
        }
        System.out.println("Исходная матрица:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(array1[i][j] + " ");
            }
            System.out.println();
        }
//        1) Посчитать сумму четных элементов стоящих на главной диагонали.
        int sum_frst = 0;
        for (int i = 0; i < n; i++) {
            if (array1[i][i] % 2 == 0) {
                sum_frst += array1[i][i];
            }
        }
        System.out.println("1) Сумма четных элементов на главной диагонали матрицы: " + sum_frst);

//        2)Вывести нечетные элементы находящиеся под главной
//        диагональю(включительно).
        System.out.print("2) Вывести нечетные элементы находящиеся под главной диагональю (включительно): ");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                if (array1[i][j] % 2 == 1) {
                    System.out.print(array1[i][j] + " ");
                }
            }
        }
        System.out.println();

//        3)Проверить произведение элементов какой диагонали больше.
        int mult_frst = 1;
        int mult_sec = 1;
        for (int i = 0; i < n; i++) {
            mult_frst *= array1[i][i];
        }
        int a = 0;
        for (int i = n - 1; i >= 0; i--) {
            mult_sec *= array1[i][a];
            a++;
        }
        if (mult_frst > mult_sec) {
            System.out.println("3) Сравнение произведения элементов 1 и 2 диагонали: " + mult_frst + " > " + mult_sec);
        } else {
            if (mult_frst < mult_sec) {
                System.out.println("3) Сравнение произведения элементов 1 и 2 диагонали: " + mult_frst + " < " + mult_sec);
            } else {
                System.out.println("3) Сравнение произведения элементов 1 и 2 диагонали: " + mult_frst + " = " + mult_sec);
            }
        }


//        4)Посчитать сумму четных элементов стоящих над побочной диагональю (не
//        включительно)
        System.out.print("4) Сумма четных элементов стоящих над побочной диагональю(не вкл): ");
        int sum_nad = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-1-i; j++) {
                if (array1[i][j] % 2 == 0){
                    sum_nad += array1[i][j];
                }
            }
        }
        System.out.print(sum_nad);
        System.out.println();

//        5)Транспонировать матрицу(1 столбец станет 1-й строкой, 2-й столбец - 2-й
//        строкой и т. д.)
        System.out.println("5) Исходная матрица: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(array1[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Транспонированная матрица:");
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                int temp = array1[i][j];
                array1[i][j] = array1[j][i];
                array1[j][i] = temp;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(array1[i][j] + " ");
            }
            System.out.println();
        }
    }
}
