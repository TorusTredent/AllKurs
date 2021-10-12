package Lessons.Lesson5.Phone;

public class Xiomi extends NewPhone{
    public Xiomi() {
        super();
    }

    public void call() {
        System.out.println("Звоню с телефона, который топ за свои деньги");
        privateCall();
    }

    @Override
    public void connection() {
        System.out.println("Сигнал налажен, теперь ты слышешь чела на трубке");
    }

    private void privateCall(){
        System.out.print("Сори что-то залагало :( ....        ");
        System.out.println("ОООООоооо отлагало!!!!!!");
    }
}
