package Dz.Shop;

import java.util.Scanner;

public class Verification {
    Scanner scan = new Scanner(System.in);

    public int checkInt() {
        while (!scan.hasNextInt()) {
            System.out.println("Вы ввели значение не того типа");
            scan.next();
        }
        return scan.nextInt();
    }

    public String checkString() {
        while (!scan.hasNext()) {
            System.out.println("Вы ввели значение не того типа");
            scan.next();
        }
        return scan.nextLine();
    }

    public int checkIntInCase2() {
        boolean temp = false;
        int j;
        do {
            j = checkInt();
            if (j == 1 || j == 2) {
                temp = true;
            } else {
                System.out.println("Такой пункт в меню отсутствует");
            }
        } while (!temp);
        return j;
    }

    public int checkInCase3() {
        boolean temp = false;
        int j;
        do {
            j = checkInt();
            if (j == 1 || j == 2 || j == 3 || j == 4 || j == 5 || j == 6 || j == 7) {
                temp = true;
            } else {
                System.out.println("Такой пункт в меню отсутствует");
            }
        } while (!temp);
        return j;
    }

}
