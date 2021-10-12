package Lessons.Lesson4.Phone;

public class Lesson4 {
    public static void main(String[] args) {
        Phone phone = new Phone("Iphone", 16);
        String company = phone.company;
        System.out.println(company);
        phone.firstMethod();
    }
}
