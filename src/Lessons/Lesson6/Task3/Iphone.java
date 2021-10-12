package Lessons.Lesson6;

public class Iphone extends Phone{
    private int ram;

    public Iphone(String company, int ram) {
        super(company);
        this.ram = ram;
    }

    @Override
    public void ring() {
        System.out.println("Кто-то звонит");
    }

    @Override
    public void call() {
        System.out.println("Мы кому-то звоним");
    }
}