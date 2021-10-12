package Dz;

import java.util.Random;
import java.util.Scanner;

public class Dz3 {
    public static void main(String[] args) {

//        1)Создайте массив из всех чётных чисел от 2 до 20 и выведите элементы
//        массива на экран сначала в строку, отделяя один элемент от другого пробелом, а
//        затем в столбик (отделяя один элемент от другого началом новой строки). Перед
//        созданием массива подумайте, какого он будет размера.

        System.out.println("Задание 1: ");
        int[] arr1 = new int[10];
        arr1[0] = 2;
        for (int i = 1; i < 10; i++) {
            arr1[i] = arr1[i - 1] + 2;
        }
        System.out.print("Массив из четных чисел в промежутке от 2 до 20: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < 10; i++) {
            System.out.println(arr1[i]);
        }
        System.out.println();

//        2)Создайте массив из всех нечётных чисел от 1 до 99, выведите его на экран в
//        строку, а затем этот же массив выведите на экран тоже в строку, но в обратном
//        порядке (99 97 95 93 ... 7 5 3 1).

        System.out.println("Задание 2: ");
        int[] arr2 = new int[50];
        arr2[0] = 1;
        for (int i = 1; i < 50; i++) {
            arr2[i] = arr2[i - 1] + 2;
        }
        System.out.print("Массив из всех нечетных чисел от 1 до 99: ");
        for (int i = 0; i < 50; i++) {
            System.out.print(arr2[i] + " ");
        }
        System.out.println();
        int count;
        for (int i = 0; i < 50; i++) {
            for (int j = i + 1; j < 50; j++) {
                count = arr2[i];
                arr2[i] = arr2[j];
                arr2[j] = count;
            }
        }
        System.out.print("Массив отсортированный в обратном порядке: ");
        for (int i = 0; i < 50; i++) {
            System.out.print(arr2[i] + " ");
        }
        System.out.println("\n");

//        3)Создайте массив из 15 случайных целых чисел из отрезка [0; 99]. Выведите
//        массив на экран. Подсчитайте сколько в массиве чётных элементов и выведете
//        это количество на экран на отдельной строке.

        System.out.println("Задание 3: ");
        Random random = new Random();
        int[] arr3 = new int[15];
        int count1 = 0;
        System.out.print("Массив из 15 случайных чисел: ");
        for (int i = 0; i < 15; i++) {
            arr3[i] = random.nextInt(99);
            if (arr3[i] % 2 == 0) {
                count1++;
            }
            System.out.print(arr3[i] + " ");
        }
        System.out.println();
        System.out.println("Число четных элементов: " + count1);
        System.out.println("\n");

//        4)Создайте массив из 20 случайных целых чисел из отрезка [0;20]. Выведите
//        массив на экран в строку. Замените каждый элемент с нечётным индексом на
//        нуль. Снова выведете массив на экран на отдельной строке.

        System.out.println("Задание 4: ");
        int[] arr4 = new int[20];
        System.out.print("Исходный массив из 20 случайных чисел: ");
        for (int i = 0; i < 20; i++) {
            arr4[i] = random.nextInt(20);
            System.out.print(arr4[i] + " ");
        }
        System.out.println();
        System.out.print("Элементы с нечётным индексом заменены на нуль: ");
        for (int i = 0; i < 20; i++) {
            if (i % 2 == 0) {
                arr4[i] = 0;
            }
            System.out.print(arr4[i] + " ");
        }
        System.out.println("\n");

//       5)Создайте 2 массива из 5 случайных целых чисел из отрезка [0;15] каждый,
//       выведите массивы на экран в двух отдельных строках. Посчитайте среднее
//       арифметическое элементов каждого массива и сообщите, для какого из
//       массивов это значение оказалось больше (либо сообщите, что их средние
//       арифметические равны).

        System.out.println("Задание 5: ");
        int[] arr5_1 = new int[5];
        int[] arr5_2 = new int[5];
        double a = 0;
        double b = 0;
        System.out.print("Массив 1: ");
        for (int i = 0; i < 5; i++) {
            arr5_1[i] = random.nextInt(15);
            arr5_2[i] = random.nextInt(15);
            System.out.print(arr5_1[i] + " ");
            a += arr5_1[i];
            b += arr5_2[i];
        }
        System.out.println();
        System.out.print("Массив 2: ");
        for (int i = 0; i < 5; i++) {
            System.out.print(arr5_2[i] + " ");
        }
        System.out.println();
        a = a / 5;
        b = b / 5;
        System.out.println("Ср. арифм. 1 и 2: " + a + " " + b);
        if (a > b) {
            System.out.println("Среднее арифм 1 массива > ср. арифм. 2. ");
        } else {
            if (a < b) {
                System.out.println("Среднее арифм 1 массива < ср. арифм. 2. ");
            } else
                System.out.println("Среднее арифм 1 массива = ср. арифм 2. ");
        }
        System.out.println("\n");

//        6)Создайте массив из 4 случайных целых чисел из отрезка [0;10], выведите его
//        на экран в строку. Определить и вывести на экран сообщение о том, является ли
//        массив строго возрастающей последовательностью.

        System.out.println("Задание 6: ");
        int[] arr6 = new int[4];
        System.out.print("Массив: ");
        for (int i = 0; i < 4; i++) {
            arr6[i] = random.nextInt(10);
            System.out.print(arr6[i] + " ");
        }
        System.out.println();
        boolean tat = true;
        for (int i = 0; i < 4; i++) {
            if (i != 3) {
                if (arr6[i] > arr6[i + 1]) {
                    System.out.println("Последовательность не является строго возрастающей! ");
                    tat = false;
                    break;
                }
            }
        }
        if (tat){
            System.out.println("Последовательность является строго возрастающей! ");
        }
        System.out.println("\n");

//        7)Создайте массив из 12 случайных целых чисел из отрезка [0;15]. Определите
//        какой элемент является в этом массиве максимальным и сообщите индекс его
//        последнего вхождения в массив.

        System.out.println("Задание 7: ");
        int[] arr7 = new int[12];
        System.out.print("Массив: ");
        int arr_max = 0;
        int count_index_max = 0;
        for (int i = 0; i < 12; i++) {
            arr7[i] = random.nextInt(15);
            if (arr_max <= arr7[i]){
                arr_max = arr7[i];
                count_index_max = i+1;
            }
            System.out.print(arr7[i] + " ");
        }
        System.out.println();
        System.out.println("Максимальный элемент в массиве: " + arr_max + " (идекс " + count_index_max + ") ");
        System.out.println("\n");

//        8)Создайте два массива из 10 целых случайных чисел из отрезка [0;9] и третий
//        массив из 10 действительных чисел. Каждый элемент с i-ым индексом третьего
//        массива должен равняться отношению элемента из первого массива с i-ым
//        индексом к элементу из второго массива с i-ым индексом. Вывести все три
//        массива на экран (каждый на отдельной строке), затем вывести количество
//        целых элементов в третьем массиве.

        System.out.println("Задание 8: ");
        int[] arr8_1 = new int[10];
        int[] arr8_2 = new int[10];
        double[] arr8_3 = new double[10];
        int count_int = 0;
        for (int i = 0; i < 10; i++) {
            arr8_1[i] = random.nextInt(9);
            arr8_2[i] = random.nextInt(9);
        }

        for (int i = 0; i < 10; i++) {
            if(arr8_1[i] != 0 && arr8_2[i] != 0){
                arr8_3[i] = (double) arr8_1[i] / arr8_2[i];
                    if (arr8_3[i] == (int) arr8_3[i]) {
                    count_int++;
                }
            } else count_int++;
        }
        System.out.print("Массив 1: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(arr8_1[i] + " ");
        }
        System.out.println();
        System.out.print("Массив 2: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(arr8_2[i] + " ");
        }
        System.out.println();
        System.out.print("Массив 3: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(arr8_3[i] + " ");
        }
        System.out.println();
        System.out.println("Число целых в 3 массиве: " + count_int);
        System.out.println("\n");

//        9)Пользователь должен указать с клавиатуры положительное число, а
//        программа должна создать массив указанного размера из случайных целых
//        чисел из [0;15] и вывести его на экран в строку. После этого программа должна
//        определить и сообщить пользователю о том, сумма какой половины массива
//        больше: левой или правой, либо сообщить, что эти суммы модулей равны. Если
//        пользователь введёт неподходящее число, то выдать соответствующее
//        сообщение

        System.out.println("Задание 9: ");
        Scanner scanner = new Scanner(System.in);
        int n;
        do {
            System.out.println("Введите размер массива (положительное целое число): ");
            while (!scanner.hasNextInt()) {
                System.out.println("Что-то не так с этим числом (‡▼益▼) , попробуй ввести другое ...");
                scanner.next();
            }
            n = scanner.nextInt();
            if (n < 0){
                System.out.println("ВВЕДИТЕ ПОЛОЖИТЕЛЬНОЕ!!!!");
            }
        } while(n <= 0);
        int[] arr9 = new int[n];
        System.out.print("Массив: ");
        for (int i = 0; i < n; i++) {
            arr9[i] = random.nextInt(15);
            System.out.print(arr9[i] + " ");
        }
        int size_left = n / 2;
        int sum_left = 0;
        int sum_right = 0;
        for (int i = 0; i < n; i++) {
            if (i < size_left){
                sum_left += arr9[i];
            } else{
                sum_right += arr9[i];
            }
        }
        System.out.println();
        System.out.println("Сумма левой и правой части: " + sum_left + " " + sum_right);
        if (sum_left > sum_right){
            System.out.println("Сумма левой части массива > правой ");
        } else{
            if (sum_left < sum_right){
                System.out.println("Сумма левой части массива < правой ");
            } else System.out.println("Сумма левой и правой части = ");
        }
        System.out.println("\n");

//        10)Пользователь вводит с клавиатуры число большее 3, которое сохраняется в
////        переменную n. Если пользователь ввёл не подходящее число, то программа
////        должна выдать соответствующее сообщение. Создать массив из n случайных
////        целых чисел из отрезка [0;n] и вывести его на экран. Создать второй массив
////        только из чётных элементов первого массива, если они там есть, и вывести его
////        на экран.

        System.out.println("Задание 10: ");
        int number;
        do{
            System.out.println("Введите целое число больше 3: ");
            while(!scanner.hasNextInt()){
                System.out.println("Введите целое число");
                scanner.next();
            }
            number = scanner.nextInt();
            if (number < 3) {
                System.out.println("Введите число > 3 ");
            }
        }while (number < 3);
        int[] arr10_1 = new int[number];
        int count_even_elem = 0;
        System.out.print("Массив 1: ");
        for (int i = 0; i < number; i++) {
            arr10_1[i] = random.nextInt(n);
            System.out.print(arr10_1[i] + " ");
            if (arr10_1[i] % 2 == 0){
                count_even_elem += 1;
            }
        }
        System.out.println();
        if(count_even_elem > 0){
            System.out.print("Массив 2: ");
            int[] arr10_2 = new int[count_even_elem];
            for (int i = 0; i < number; i++) {
                if (arr10_1[i] % 2 == 0){
                    int j = 0;
                    arr10_2[j] = arr10_1[i];
                    System.out.print(arr10_2[j] + " ");
                }
            }
        } else System.out.println("Четных элементов в 1 массиве нет ");
    }
}

