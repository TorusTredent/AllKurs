package Dz.Dz4;

public class Functions {
    double a;
    double b;

    public Functions(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public void function() {
        sum(a, b);
        minus(a, b);
        division(a, b);
        multiplication(a, b);
    }

    private void sum(double a, double b){
        System.out.println("Сумма: " + (a+b));
    }

    private void minus(double a, double b){
        System.out.println("Разность: " + (a-b));
    }

    private void division(double a, double b){
        System.out.println("Деление: " + (a/b));
    }

    private void multiplication(double a, double b){
        System.out.println("Умножение: " + (a*b));
    }
}
