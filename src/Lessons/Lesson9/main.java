package Lessons.Lesson9;

public class main{
    public static void main(String[] args){
        try {
            int a = 5;
            int b = 10;
            if(a + b > 10) {
                throw new NullPointerException();
            }
            System.out.println(a / b);
        }
        catch (NullPointerException | ArithmeticException e){
            System.out.println("У вас бросилась ошибка");
            e.printStackTrace();
        }
        finally {
            System.out.println("Вы зашли в finally");
        }
        System.out.println("Вы пошли дальше");
        System.out.println("Hello");
        try {
            a();
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            throw new MyException(1);
        } catch (MyException e) {
            e.printStackTrace();
        }
    }

    static void a() throws Exception{
        int a = 5;
        int b = 5;
        throw new Exception();
    }
}
