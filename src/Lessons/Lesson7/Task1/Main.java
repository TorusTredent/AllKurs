package Lessons.Lesson7;

public class Main {
    public static void main(String[] args) {
        Calc calc = new Calc(Calculator.SUM);
        System.out.println(calc.getCalculator().action(5, 6));
    }
}
