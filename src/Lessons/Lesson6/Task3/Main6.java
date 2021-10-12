package Lessons.Lesson6;

public class Main6 {
    public static void main(String[] args) {
        Iphone iphone = new Iphone("Iphone", 64);
        iphone.call();
        iphone.ring();
        Huawei huawei = new Huawei("Huawei", "Human");
        huawei.call();
        huawei.ring();
    }
}
