package Lessons.Lesson4;

import java.util.Random;
import java.util.Scanner;

public class Lesson4 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Задача 1: ");
        int n = 5;
        int m = 5;
        System.out.println("Размер массива n и m: " + n + " " + m);
        int[][] array1 = new int [n][m];
        int count_sum_elem = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                array1[i][j] = random.nextInt(10);
                count_sum_elem += array1[i][j];
                System.out.print(array1[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Сумма элементов в матрице: " + count_sum_elem);
        System.out.println("\n");
        System.out.println("Задача 2: ");
        n = 4;
        m = 4;
        System.out.println("Размер массива n и m: " + n + " " + m);
        int[][] array2 = new int [n][m];
        count_sum_elem = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                array2[i][j] = random.nextInt(10);
                if (i == j){
                    count_sum_elem += array2[i][j];
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(array2[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Сумма элементов на главной диагонали: " + count_sum_elem);
        System.out.println("\n");
        System.out.println("Задача 3: ");
        int[][] array3 = new int[n][m];
        count_sum_elem = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                array3[i][j] = random.nextInt(10);
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(array3[i][j] + " ");
            }
            System.out.println();
        }
        int a = m-1;
        for (int i = 0; i < n; i++) {
            count_sum_elem += array3[i][a];
            a -= 1;
        }
        System.out.println(count_sum_elem);
        System.out.println("\n");
        System.out.println("Задание 4: ");
        int[][] array4 = new int[4][4];
        for (int i = 0; i < 4; i++){
            for (int j = 0; j < 4; j++) {
                array4[i][j] = random.nextInt(100);
                System.out.print(array4[i][j] + " ");
            }
            System.out.println();
        }
        int temp1 = array4[0][0];
        int temp2 = array4[0][0];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if(temp1 < array4[i][j]){
                    temp1 = array4[i][j];
                }
                if (temp2 > array4[i][j]) {
                    temp2 = array4[i][j];

                }
            }
        }
        System.out.println(temp1+" "+ temp2  );
    }
}
