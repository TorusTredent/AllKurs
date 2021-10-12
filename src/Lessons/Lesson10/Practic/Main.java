package Lessons.Lesson10.Practic;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;


public class Main {
    private static final int RADIX = 10;

    public static void main(String[] args) {
//        try (BufferedWriter bfw1 = new BufferedWriter(new FileWriter("file2.txt"));
//             BufferedReader bfr = new BufferedReader(new FileReader("file1.txt"))) {
//            String str = bfr.readLine();
//            str = str.replace("a", "L");
//            bfw1.write(str);
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("file22.txt"));
             BufferedReader bufferedReader = new BufferedReader(new FileReader("file11.txt"))) {

            String str = bufferedReader.readLine();
            str = str.replaceAll("\\s","");
            char[] str1 = str.toCharArray();
            ArrayList<Character> charArrayList = new ArrayList<>();
            ArrayList<Integer> intArrayList = new ArrayList<>();
            int counterOfUniqSymbols;


            for (int i = 0; i < str.length(); i++) {
                counterOfUniqSymbols = 1;
                for (int j = i + 1; j < str.length(); j++) {
                    if(str1[i] == '?'){
                        break;
                    }
                    if(str1[i] == str1[j]){
                        counterOfUniqSymbols++;
                        str1[j] = '?';
                    }
                }
                if(str1[i] != '?') {
                    charArrayList.add(str1[i]);
                    intArrayList.add(counterOfUniqSymbols);
                }
            }

            int temp = intArrayList.get(0);
            int countFinal = 0;

            for (int i = 1; i < intArrayList.size(); i++) {
                if(temp < intArrayList.get(i)){
                    temp = intArrayList.get(i);
                    countFinal = i;
                }
            }

            System.out.println();
            char[][] strFinal = new char[1][2];
            strFinal[0][0] = charArrayList.get(countFinal);
            strFinal[0][1] = Character.forDigit(intArrayList.get(countFinal), RADIX);

            bufferedWriter.write(Arrays.deepToString(strFinal));

            } catch(FileNotFoundException e){
                e.printStackTrace();
            } catch(IOException e){
                e.printStackTrace();
            }
        }
    }
