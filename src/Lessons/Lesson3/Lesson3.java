package Lessons.Lesson3;

import java.util.Scanner;
import java.util.Random;

public class Lesson3 {
    public static void main(String[] args) {

//        Random random = new Random();
//        int[] arr = new int [5];
//        for (int i = 0; i < 5; i++) {
//            arr[i] = random.nextInt(100);
//        }
//        for (int i = 0; i < 5; i++) {
//            System.out.print(arr[i] + " ");
//        }
//        System.out.println("");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int n = scanner.nextInt();
        int[] array = new int [n];
        System.out.println("Ввведите значения массива: ");
//        int c = 0;
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
//            c += array[i];
        }
        System.out.print("Ваш массив: ");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println(" ");
//        System.out.println("Сумма элементов равна: " + c);
//
//        int d = 0;
//        int g = 0;
//        for (int i = 0; i < n; i++) {
//            if (array[i] % 2 == 0){
//                d += array[i];
//            } else g -= array[i];
//        }
//        System.out.println("Сумма четных: " + d);
//        System.out.println("Разность нечетных: " + g);
//
//        double f = 0;
//        f = (double)c / n;
//        System.out.println("Среднее арифмитическое массива: " + f);

//        int a = array [0];
//        int b = array [0];
//        int count1 = 0;
//        int count2 = 0;
//        for (int i = 0; i < n; i++) {
//            if (a <= array[i]){
//                a = array [i];
//                count1 = i;
//            }
//            if (b > array [i]){
//                b = array [i];
//                count2 = i;
//            }
//        }
//        System.out.println("Максимальное значение в массиве: " + a + " (индекс: " + count1 + ") ");
//        System.out.println("Минимальное значение в массиве: " + b + " (индекс: " + count2 + ") ");
//        int count3 = Math.abs(count1-count2) - 1;
//        if (n == 1){
//            System.out.println("Количество элементов между минимальным и макссимальным значениями в массиве: 0");
//        } else System.out.println("Количество элементов между минимальным и макссимальным значениями в массиве: " + count3);


//        if (count1 < count2){
//            count3 = count1;
//            count1 = count2;
//            count2 = count3;
//        }
//
//        System.out.print("Элементы между максимальным и минальным элементом: ");
//        for (int i = count2 + 1; i < count1; i++) {
//            System.out.print(array[i] + " ");
//        }
//
        int count = 0;
        for (int i = 0; i < n; i++) {
            for(int j = i+1; j < n; j++){
                if (array[i] > array[j]){
                    count = array[i];
                    array [i] = array[j];
                    array [j] = count;
                }
            }
        }
        System.out.print("Отсортированный массив: ");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }

    }
}
