package Lessons.Lesson5.Phone;

public class Phone {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();
        iphone.call(23);
        iphone.connection();
        System.out.println("=================== Теперь другой телефон ^_^ ==========================================");
        Xiomi xiomi = new Xiomi();
        xiomi.call();
        xiomi.connection();
    }
}
