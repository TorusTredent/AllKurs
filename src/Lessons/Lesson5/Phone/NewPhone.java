package Lessons.Lesson5.Phone;

public class NewPhone extends OldPhone{
    public NewPhone() {
        super();
    }

    @Override
    public void call(int numbers) {
        System.out.println("Красава, натыкал номер " + numbers + " теперь жди :0");
        privateCall1();
    }

    @Override
    public void connection() {
        System.out.println("А все нашло, можешь говорить ");
    }

    private void privateCall1(){
        System.out.println("Связь с вышкой");
        for (int i = 0; i < 2; i++) {
            System.out.println("туц туц");
        }
    }
}
