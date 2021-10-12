package Lessons.Lesson6.Task6Interface;

public class Pechka implements PechGlag, Pech{

    @Override
    public void printPech() {
        System.out.println("Печь - существительно");
    }

    @Override
    public void printPechGlag() {
        System.out.println("Печь - глагол");
    }
}
