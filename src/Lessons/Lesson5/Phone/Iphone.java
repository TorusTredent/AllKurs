package Lessons.Lesson5.Phone;

public class Iphone extends NewPhone{
    public Iphone() {
        super();
    }

    @Override
    public void call(int number) {
        System.out.println("Абонент с нномером: " + number + " звоню с Айфона, если ЧТО");
        privateCall();
    }

    @Override
    public void connection() {
        System.out.println("Контакт налажен, можно разговаривать :)");
    }

    private void privateCall(){
        System.out.println("Соединяю с бомжом на xiomi...");
    }
}
