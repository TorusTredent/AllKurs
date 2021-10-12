package Lessons.Lesson6;

public class Huawei extends Phone{
    private String creator;

    public Huawei(String company, String creator) {
        super(company);
        this.creator = creator;
    }

    @Override
    public void ring() {
        System.out.println("Кто-то звонит на Huawei");
    }

    @Override
    public void call() {
        System.out.println("Мы кому-то звоним на Huawei");
    }
}
