public class Dz2 {
    public static void main(String[] args) {

//        1)Начав тренировки, спортсмен в первый день пробежал 10 км. Каждый
//        день он увеличивал дневную норму на 10% нормы предыдущего дня. Какой
//        суммарный путь пробежит спортсмен за 7 дней?

        System.out.println("Задача 1: ");
        double a = 10;
        int b = 1;
        double c = 0;
        while (b < 8){
            c = a * 0.1;
            a += c;
            if (b == 7){
                System.out.println("Суммарный путь 1 методом = " + a);
            }
            b++;
        }

        a = 10;
        b = 1;
        c = 0;
        do {
          c = a * 0.1;
          a+=c;
          if (b == 7){
              System.out.println("Суммарный путь 2 методом = " + a);
          }
          b++;
        } while (b < 8);

        a = 10;
        c = 0;

        for (int i = 1; i < 8; i++) {
            c = a * 0.1;
            a += c;
            if (i == 7){
                System.out.println("Суммарный путь 3 методом = " + a);
            }
        }
        System.out.println("\n");

//        2)Одноклеточная амеба каждые 3 часа делится на 2 клетки. Определить,
//        сколько амеб будет через 3, 6, 9, 12,..., 24 часа.

        System.out.println("Задача 2: ");
        a = 1;
        b = 0;
        System.out.println("1 - метод: ");
        while (b < 24 ){
            a *= 2;
            b += 3;
            System.out.print("Через " + b + " амеб будет " + a + "; ");
        }

        System.out.println("");
        a = 1;
        b = 0;
        System.out.println("2 - метод: ");
        do {
            a *= 2;
            b += 3;
            System.out.print("Через " + b + " амеб будет " + a + "; ");
        }while (b < 24);

        System.out.println("");
        System.out.println("3 - метод: ");
        a = 1;
        for (int i = 3; i < 25; i+=3) {
            a *= 2;
            System.out.print("Через " + i + " амеб будет " + a + "; ");
        }
        System.out.println("\n" + "\n");
//        5)Напишите программу печати таблицы перевода расстояний из дюймов в
//        сантиметры для значений длин от 1 до 20 дюймов. 1 дюйм = 2,54 см

        System.out.println("Задача 3: ");
        a = 1;
        b = 1;
        c = 1;
        System.out.println("1 - метод: ");
        while(b<21){
            if (c == 1){
                a += 2.54;
                System.out.print(b + " = " + a + "     ");
                c++;
                b++;
                continue;
            }
            if (c == 2){
                a += 2.54;
                System.out.print(b + " = " + a + "     ");
                c++;
                b++;
                continue;
            }
            if (c == 3){
                a += 2.54;
                System.out.print(b + " = " + a + "     ");
                c++;
                b++;
                continue;
            }
            if (c == 4){
                a += 2.54;
                System.out.println(b + " = " + a + "     ");
                c = 1;
                b++;
            }
        }

        System.out.println("2 - метод: ");
        a = 1;
        b = 1;
        c = 1;
        do {
            if (c == 1){
                a += 2.54;
                System.out.print(b + " = " + a + "     ");
                c++;
                b++;
                continue;
            }
            if (c == 2){
                a += 2.54;
                System.out.print(b + " = " + a + "     ");
                c++;
                b++;
                continue;
            }
            if (c == 3){
                a += 2.54;
                System.out.print(b + " = " + a + "     ");
                c++;
                b++;
                continue;
            }
            if (c == 4){
                a += 2.54;
                System.out.println(b + " = " + a + "     ");
                c = 1;
                b++;
            }
        }while(b < 21);

        System.out.println("3 - метод: ");
        a = 1;
        c = 1;
        for (int i = 1; i < 21; i++) {
            if (c == 1){
                a += 2.54;
                System.out.print(i + " = " + a + "     ");
                c++;
                continue;
            }
            if (c == 2){
                a += 2.54;
                System.out.print(i + " = " + a + "     ");
                c++;
                continue;
            }
            if (c == 3){
                a += 2.54;
                System.out.print(i + " = " + a + "     ");
                c++;
                continue;
            }
            if (c == 4){
                a += 2.54;
                System.out.println(i + " = " + a + "     ");
                c = 1;
            }
        }
        System.out.println("\n");

//        7)Напишите программу, определяющую сумму всех нечетных чисел от 1
//        до 99

        System.out.println("Задача 4: ");
        System.out.println("1 - метод: ");
        a = 0;
        b = 1;
        while(b < 100){
            if(b % 2 == 1){
                a+=b;
                if(b == 99) {
                    System.out.println("Сумма чисел от 1 до 99 = " + a);
                }
                b++;
                continue;
            }
            b++;
        }

        System.out.println("2 - метод: ");
        a = 0;
        b = 1;
        do{
            if(b % 2 == 1){
                a+=b;
                if(b == 99) {
                    System.out.println("Сумма чисел от 1 до 99 = " + a);
                }
                b++;
                continue;
            }
            b++;
        } while (b < 100);

        System.out.println("3 - метод: ");
        a = 0;
        for (int i = 1; i < 100; i++) {
            if(i % 2 == 1){
                a+=i;
                if(i == 99) {
                    System.out.println("Сумма чисел от 1 до 99 = " + a);
                }
            }
        }
    }
}
