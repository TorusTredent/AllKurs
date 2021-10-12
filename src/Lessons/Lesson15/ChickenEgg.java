package Lessons.Lesson15;

public class ChickenEgg {
    public static void main(String[] args) {
        Egg egg = new Egg();

        egg.start();
        egg.setPriority(8);

        for (int i = 0; i < 10; i++) {
           Helper.print(i);
        }
    }
}