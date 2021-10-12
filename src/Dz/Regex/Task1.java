package Dz.Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task1 {
    public static void main(String[] args) {
        String text = "Cat cat hah cat lslkLAaf";
        Pattern pattern = Pattern.compile("\scat\s");
        Matcher matcher = pattern.matcher(text);
        int count = 0;
        while (matcher.find()) {
            count++;
        }
        System.out.println(count);

//        Проверить, существуют ли предложения, у которых первое слово начинается с маленькой буквы.
//                Использовать текст из задачи 1




        /////////////////////////////////////////////////////////////////////
//        Pattern pattern1 = Pattern.compile("abc");
//        System.out.println(pattern1.flags());// 0
//        pattern1 = Pattern.compile("abc", Pattern.CASE_INSENSITIVE);
//        System.out.println(pattern1.flags());// 2
//        /////////////////////////////////////////////////////////////////////
//        String text1 = "Егор Алла Анна Виктор Петя";
//        Pattern pattern2 = Pattern.compile("\\s");
//        String[] strings = pattern2.split(text,3);
//        for (String s : strings) {
//            System.out.println(s);
//        }
//        System.out.println("---------");
//        String[] strings1 = pattern2.split(text);
//        for (String s : strings1) {
//            System.out.println(s);
//        }
//        /////////////////////////////////////////////////////////////////////
//        String text2 = "Егор Алла Анна";
//        Pattern pattern3 = Pattern.compile("А.+?а");
//
//        Matcher matcher1 = pattern3.matcher(text);
//        while (matcher.find()) {
//            int start=matcher.start();
//            int end=matcher.end();
//            System.out.println("Найдено совпадение " + text.substring(start,end) + " с "+ start + " по " + (end-1) + " позицию");
//        }
//        System.out.println(matcher.replaceFirst("Ира"));
//        System.out.println(matcher.replaceAll("Ольга"));
//        System.out.println(text);
    }

}
