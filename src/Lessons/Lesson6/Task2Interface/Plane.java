package Lessons.Lesson6.Task2Interface;

public class Plane implements Flyable{

    @Override
    public void fly() {
        System.out.println("Самолет летит");
    }
}
