package Lessons.Lesson6.Task2Interface;

public class Main {
    public static void main(String[] args) {
        Flyable flyable = new Plane();
        flyable.fly();
        Dandelion dandelion = new Dandelion();
        dandelion.fly();
        Plane plane = new Plane();
        plane.fly();
    }
}
