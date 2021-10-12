package Lessons.Lesson5;

public class MainPerson {
    public static void main(String[] args) {
        Person person = new Person("Vasya");
//        person.printName();
//        Employe employe = new Employe("Petya", 2);
//        employe.a();
//        employe.a(4);
        Person person1 = new Employe("Vasya", 1);
        person.printName();
        person1.printName();
    }
}