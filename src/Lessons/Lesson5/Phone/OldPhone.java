package Lessons.Lesson5.Phone;

public class OldPhone {

    public OldPhone() {
    }

    public void call(int numbers){
        System.out.println("Номер который вы ввели: +" + numbers);
        priviteCall();
    }
    private void priviteCall(){
        System.out.println("Барабан крутиться, цифарки мутяться");
        for (int i = 0; i < 3; i++) {
            System.out.println("...");
        }
    }
    public void connection(){
        System.out.println("Сигнал найден, оставайтесь на линии ^-^ ");
    }
}
