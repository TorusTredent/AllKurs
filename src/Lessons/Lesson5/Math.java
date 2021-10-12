package Lessons.Lesson5;

public class Math {
    private int a;
    private int b;

    public Math() {
    }

    public Math(int a, int b) {
        this.a = a;
        this.b = b;
    }

    private int privateSum(){
        return a + b;
    }

    private int privateMinus(){
        return a - b;
    }

    private double privateDelen(){
        return (double)a/b;
    }

    private int privateMultiply(){
        return a * b;
    }

    public void sum(){
        System.out.println(privateSum());
    }

    public void minus(){
        System.out.println(privateMinus());
    }

    public void delen(){
        System.out.println(privateDelen());
    }

    public void multiply(){
        System.out.println(privateMultiply());
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
}
