import java.util.Scanner;

public class Dz1 {
    public static void main(String[] args) {
        //1) В переменную записываем число. Надо вывести на экран сколько в этом
        //числе цифр и положительное оно или отрицательное. Например, "это
        //однозначное положительное число". Достаточно будет определить, является ли
        // число однозначным, "двухзначным или трехзначным и более.

        System.out.println("1 zadacha: ");
        Scanner scan = new Scanner(System.in);
        System.out.println("Zadayte celoye chislo");
        int a = scan.nextInt();

        if (a > 0) {
            if (a < 10) {
                System.out.println("Eto chislo polozhit odnoznach ^_^");
            } else if (a < 100) {
                System.out.println("Eto chislo polozhit dvuhznach ^_^");
            } else if (a < 1000) {
                System.out.println("Eto chislo polozhit trehznach ^_^ ");
            } else System.out.println("Chislo polozhit chetyreh ili bolee razradn ^_^");
        } else if (a > -10) {
            System.out.println("Chislo otricat odnoznachn ヽ(>∀<☆)ノ");
            }
        if (a > -100 && a < -9) {
            System.out.println("Chislo otricat dvuznachn ヽ(>∀<☆)ノ");
            }
        if (a > -1000 && a < -99) {
            System.out.println("Chislo otricat trehznachn ヽ(>∀<☆)ノ");
        }
        if (a < -1000){System.out.println("Chislo otricat chetyreh ili bolee razradn ヽ(>∀<☆)ノ");}
        System.out.println("______________________________________________________________");

//        2) Треугольник существует только тогда, когда сумма любых двух его сторон
//        больше третьей. Определить существует ли такой треугольник. Дано: a, b, c –
//        стороны предполагаемого треугольника. Требуется сравнить длину каждого
//        отрезка-стороны с суммой двух других. Если хотя бы в одном случае отрезок
//        окажется больше суммы двух других, то треугольника с такими сторонами не
//        существует.

        System.out.println("2 zadacha: ");
        a = 2;
        int b = 4;
        int c = 3;
        System.out.println("Storony treug = "+ a + " " + b + " " + c);

        if (a > 0 && b > 0 && c > 0) {
            if (a + b > c && a + c > b  && b + c > a){
                System.out.println("Takoy treug sushestv");
            }else System.out.println("Takoy treug ne sushestv");
        } else System.out.println("Chel kakaya-to storona otricat lul");
        System.out.println("______________________________________________________________");

//        3) Дано целое число. Если оно является положительным, то прибавить к нему 1.
//        Если отрицательным, то вычесть из него 2. Если нулевым, то заменить его на
//        10. Вывести полученное число.

        System.out.println("3 zadacha: ");
        int d = 0;
        System.out.println("Chislo ravno = " + d);
        if (d > 0) {
            int f = d + 1;
            System.out.println("Chislo " + d + " polozhyt poetomu + 1 = " + f);
            d = f;
        }
        if (d < 0) {
            int f = d - 2;
            System.out.println("Chislo " + d + " otricat poetomu -2  = " + f);
            d = f;
        }
        if (d == 0) {
            int f = 10;
            System.out.println("Chislo " + d + " poetomu prisvoim 10 = " + f);
            d = f;
        }
        System.out.println("______________________________________________________________");

//        4) Даны 3 целых числа. Найти количество положительных чисел в исходном
//        наборе.

        System.out.println("4 zadacha: ");
        a = 4;
        b = 3;
        c = -2;
        int count = 0;
        System.out.println("Dany takiye chisla = " + a + " " + b + " " + c);
        if (a > 0) { count +=1;}
        if (b > 0) { count +=1;}
        if (c > 0) { count +=1;}
        System.out.println("Kolichestvo polozhit = " + count);
        System.out.println("______________________________________________________________");

//        5) Даны 3 целых числа. Найти количество положительных и отрицательных
//        чисел в исходном наборе.

        System.out.println("5 zadacha: ");
        a = 0;
        b = 0;
        c = 0;
        count = 0;
        int secCount = 0;
        System.out.println("Dany takiye chisla = " + a + " " + b + " " + c);
        if (a > 0) { count +=1;} else if (a < 0) { secCount += 1;}
        if (b > 0) { count +=1;} else if (b < 0) { secCount += 1;}
        if (c > 0) { count +=1;} else if (c < 0) { secCount += 1;}
        System.out.println("Kolichestvo polozhit = " + count);
        System.out.println("Kolichestvo otricat = " + secCount);
        System.out.println("______________________________________________________________");


//        6) Даны 2 числа. Вывести большее из них.

        System.out.println("6 zadacha: ");
        a = 10;
        b = -14;
        System.out.println("Dany 2 chisla a and b: " + a + " " + b);
        if (a == b){
            System.out.println("Chislo a = chislu b: " + a + "=" + b);
        }else if (a > b){
            System.out.println("Chislo a bolshe = " + a);
        } else System.out.println("Chislo b bolshe = " + b);
        System.out.println("______________________________________________________________");

//        7) (Дополнительно) В переменную записываете количество программистов. В
//        зависимости от количества программистов необходимо вывести правильно
//        окончание. Например:
//          • 2 программиста
//          • 1 программист
//          • 10 программистов
//          • и т.д.

        System.out.println("7 zadacha: ");
        Scanner scan2 = new Scanner(System.in);
        System.out.println("Zadayte chislo programistov");
        int v = scan2.nextInt();
        a = v % 10;
        b = v % 100;
        if(v < 0){
            System.out.println("Vy vveli ne polozhitelnoye chislo :(");
        } else if(a == 1 && b != 11){
            System.out.println(v + " programmist");
        }else if(a > 1 && a < 5 && b < 10 || b > 20){
            System.out.println(v + " programmista");
        }else System.out.println(v + " programistov");
        System.out.println("______________________________________________________________");
    }
}

