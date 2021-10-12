package Lessons.Lesson6;

public class Person {
    private int a;
    private static String name;

    static {
        name = "Vasya";
        System.out.println(name);
    }

    public Person(int a) {
        this.a = a;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }
}
