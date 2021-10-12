package Dz.StreamDz;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Task2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Stefan");
        list.add("Anton");
        list.add("Zorro");
        list.add("Zefris");
        list.add("Kate");
        list.add("Josyf");
        list.add("Zelda");

        System.out.print("Имена: ");
        for (String list0 : list) {
            System.out.print(list0 + " ");
        }
        System.out.println();

        System.out.print("Имена начинающиеся на Z: ");
        List<String> nameStartWithZ = list.stream()
                .filter(x -> x.startsWith("Z"))
                .collect(Collectors.toList());
        nameStartWithZ.forEach(x -> System.out.print(x + " "));

    }
}
