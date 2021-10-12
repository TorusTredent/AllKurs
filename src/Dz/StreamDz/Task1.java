package Dz.StreamDz;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        Random random = new Random();
        List<Integer> list = new ArrayList<>();

        for(int i = 0; i < 5; i++){
            list.add(random.nextInt(100));
        }

        System.out.print("Набор чисел: ");
        for(Integer list0 : list){
            System.out.print(list0 + " ");
        }
        System.out.println();

        System.out.print("Количество четных четных чисел в потоке: ");

        long count = list.stream()
                .filter(x -> x % 2 == 0)
                .count();
        System.out.println(count);
    }
}
