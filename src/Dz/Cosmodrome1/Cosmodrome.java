package Dz.Cosmodrome1;

public class Cosmodrome {
    public void launch(IStart iStart){
        if(!iStart.preLaunchCheck()){
            System.out.println("Предстартовая проверка не прошла успешно");
        } else {
            timer();
            iStart.startEngine();
            iStart.start();
        }
    }

    private void timer(){
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }
    }
}
