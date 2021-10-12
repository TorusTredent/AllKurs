package Lessons.Lesson13;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.stream.Collectors;

public class Work {
    public static void main(String[] args) {
        Random random = new Random();
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            list.add(i, random.nextInt(200));
        }

        for (Integer list1 : list){
            System.out.print(list1 + " ");
        }

        System.out.println();

        System.out.print("Значения < 100: ");

        List<Integer> result = list.stream()
                .filter(x -> x < 100)
                .collect(Collectors.toList());
        result.forEach(x -> System.out.print(x + " "));

        System.out.println();


        List<Integer> list1 = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            list1.add(i, random.nextInt(1000));
        }

        for (Integer list0 : list1){
            System.out.print(list0 + " ");
        }
        System.out.println();

        List<Integer> result1 = list1.stream()
                .filter(x -> x > 500)
                .collect(Collectors.toList());
        System.out.print("Значения > 500: ");
        for (Integer result0 : result1){
            System.out.print(result0 + " ");
        }
        System.out.println();

        Optional<Integer> sum = result1.stream()
                .reduce(Integer::sum);
        System.out.print("Ср. арифмитическое: ");

        sum.ifPresent(integer -> System.out.println(Double.valueOf(integer / result1.size())));



        List<Integer> list2 = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            list2.add(i, random.nextInt(100));
        }

        for (Integer list0 : list2){
            System.out.print(list0 + " ");
        }
        System.out.println();

        List<Integer> result2 = list2.stream()
                .sorted(new ComparatorList())
                .collect(Collectors.toList());
        System.out.print("Значения отсортированные по убыванию: ");
        for(Integer result0 : result2){
            System.out.print(result0 + " ");
        }
        System.out.println();

        List<Integer> list3 = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            list3.add(i, random.nextInt(100));
        }

        for (Integer list0 : list3){
            System.out.print(list0 + " ");
        }
        System.out.println();

        List<Integer> result3 = list3.stream()
                .distinct()
                .collect(Collectors.toList());
        Optional<Integer> optionalMin = result3.stream().min(Integer::compare);
        Optional<Integer> optionalMax = result3.stream().max(Integer::compare);
        optionalMin.ifPresent(System.out::println);
        optionalMax.ifPresent(System.out::println);
    }
}
