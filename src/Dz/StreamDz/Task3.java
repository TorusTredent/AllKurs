package Dz.StreamDz;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Task3 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Adam");
        list.add("Aadam");
        list.add("Aaaqw");
        list.add("Bare");
        list.add("barea");
        list.add("jojo");
        list.add("baart");
        list.add("jago");
        list.add("huch");

        System.out.print("Вам списко имен: ");
        for(String list0 : list){
            System.out.print(list0 + " ");
        }
        System.out.println();

        System.out.print("Отсортированный лексикографически список: ");
        List<String> result = list.stream()
                .sorted(String.CASE_INSENSITIVE_ORDER)
                .collect(Collectors.toList());
        result.forEach(x -> System.out.print(x + " "));
    }
}
