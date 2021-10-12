package Lessons.Lesson8;

public class OperationsBuilder {

    public static void arithmetical(int a, int b){
        StringBuilder str1 = new StringBuilder();
        StringBuilder str2= new StringBuilder();
        StringBuilder str3 = new StringBuilder();
        System.out.println(str1.append(a).append(" + ").append(b).append(" = ").append(a + b));
        System.out.println(str2.append(a).append(" - ").append(b).append(" = ").append(a - b));
        System.out.println(str3.append(a).append(" * ").append(b).append(" = ").append(a * b));
        System.out.println( str1.replace(6,8, " равно "));
        System.out.println( str2.replace(6,8, " равно "));
        System.out.println( str3.replace(6,8, " равно "));
    }
}
