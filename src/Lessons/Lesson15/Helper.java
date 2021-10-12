package Lessons.Lesson15;

import java.util.Random;

public class Helper {
    public static int timeOut() {
        Random random = new Random();
        return random.nextInt(1000);
    }

    public static synchronized void print(int i){
        System.out.println(i);
    }
}
