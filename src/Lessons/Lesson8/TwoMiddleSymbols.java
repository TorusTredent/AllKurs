package Lessons.Lesson8;

import java.util.Scanner;

public class TwoMiddleSymbols {
    private String str;

    public TwoMiddleSymbols(String str) {
        this.str = str;
    }

    public void printMiddleSymbols(){
        System.out.println("Введите слово с четных количеством символов(пробелы по бокам не считаются ха-ха, но если что можно поправить): ");
        while(!check()){
            System.out.println("Вы ввели слово с неправильным количеством элементов!");
        }
        System.out.println(str.substring(str.length() / 2 - 1,str.length() / 2 + 1));
    }

    private boolean check(){
        Scanner scanner = new Scanner(System.in);
        str = scanner.nextLine();
        str = str.trim();
        return str.length() % 2 == 0;
    }
}
