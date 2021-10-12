package Lessons.Lesson12;

public class Main {
    public static void main(String[] args) {
//        LocalDate localDate = LocalDate.now();
//        System.out.println(localDate);
//        System.out.println(localDate.getDayOfWeek());
//        LocalDateTime localDateTime = LocalDateTime.now();
//        System.out.println(localDateTime);
//        Printable printable = System.out::println;
//        Printable printable1 = s -> System.out.println(s);
//        printable.print("Hello world");
//        printable1.print("Hello");
//

//        Operatable operatable = (x,y) -> {
//            if (x > y) {
//                System.out.println(x + " > " + y);
//            } else if (x < y) {
//                System.out.println(x + " < " + y);
//            } else {
//                System.out.println("equals");
//            }
//        };
//        operatable.action(10,12);

        Operatable1 operatable1 = System.out::println;
        operatable1.print("hello");


    }
}
