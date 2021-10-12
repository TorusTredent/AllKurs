package Lessons.Lesson5;

public class Employe extends Person{
    private int a;
    public Employe(String name, int a){
        super(name);
        this.a = a;
    }

    @Override
    public void printName() {
        System.out.println("Iam Vasya");
    }

//    public void a(){
//        System.out.println("Hello");
//    }
//
//    public void a(int a){
//        System.out.println("Faf");
//    }
}
