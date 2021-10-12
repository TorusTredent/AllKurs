package Lessons.Lesson2;

public class Lesson2 {
    public static void main(String[] args) {

//        int a = 1;
//        int count1 = 0;
//        while (a < 257) {
//            count1 += a;
//            a *= 2;
//        }
//        System.out.println(count1);
//
//
//
//                if (a != 256) {
//                System.out.print(a + " + ");
//                count1 += a;
//            } else {
//                System.out.println(a);
//                count1 += a;
//            }
//            a *= 2;
//        }
//        System.out.println(count1);
//
//
//        int b = 1;
//        int count2 = 0;
//        do {
//            if (b != 256) {
//                System.out.print(b + " + ");
//                count2 += b;
//            } else {
//                System.out.println(b);
//                count2 += b;
//            }
//            b *= 2;
//        } while (b < 257);
//        System.out.println(count2);
//
//
//        int c = 1;
//        int count3 = 0;
//        for (int i = 1; i < 257; i++) {
//            if (c != 256) {
//                System.out.print(c + " + ");
//                count3 += c;
//            } else {
//                System.out.println(c);
//                count3 += c;
//                break;
//            }
//            c *= 2;
//        }
//        System.out.println(count3);
//
//        int a = 2;
//        int b = 6;
//        int c = 0;
//        for (int i = 0; i < b; i++) {
//            c+=a;
//        }
//        System.out.println(c);
        int a = 1;
        int b = 1;
        int c = 1;
        int d = 1;
        int v = 1;
        boolean g = true;

        while (true){
            if (b < 11) {
                if (a < 8) {
                    a++;
                    b++;
                    c *= a;
                    d *= b;
                } else {
                    b++;
                    d *= b;
                }
            } else {
                v = c / d * 15;
                System.out.println(v);
                g = false;
            }
        }

    }
}
