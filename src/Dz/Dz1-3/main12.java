package Dz;

import java.util.ArrayList;

public class main12 {
    private static final int RADIX = 10;

    public static void main(String[] args) {
        String str = "12341234444444";
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
        for (int i = 0; i < 2; i++) {
            System.out.print(strFinal[0][i] + " ");
        }

    }
}
