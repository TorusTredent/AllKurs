package test;

import java.io.*;

public class Zad1 {
    public static void main(String[] args) {

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("E:\\Kurs\\src\\zadan1.txt"));
             BufferedReader bufferedReader = new BufferedReader(new FileReader("E:\\Kurs\\src\\zadan1-2.txt"))) {

            String srt = bufferedReader.readLine();
            srt.split(" ");
            int length = srt.length();
            char[] str1 = srt.toCharArray();
            int counter = 0;
            String strFinal[][] = new String[srt.length()][counter];

            for (int i = 0; i < length; i++) {
                counter = 1;
                for (int j = i + 1; j < length; j++) {
                    if (str1[i] == ' ') {
                        break;
                    }
                    if (str1[i] == str1[j]) {
                        counter++;
                        str1[j] = ' ';
                    }
                }
                if (str1[i] != ' ') {
                    System.out.println(str1[i] + ": " + counter);
                }
            }



        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
