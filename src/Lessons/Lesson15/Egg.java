package Lessons.Lesson15;

public class Egg extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            Helper.print(i);
        }
    }
}
