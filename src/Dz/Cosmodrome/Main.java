package Dz.Cosmodrome;

public class Main {
    public static void main(String[] args) {
        System.out.println("===================================");
        Shuttle shuttle = new Shuttle(false);
        shuttle.launch();
        System.out.println("===================================");
        StarShip starShip = new StarShip(false);
        starShip.launch();
        System.out.println("===================================");
        Apollon13 apollon13 = new Apollon13(true);
        apollon13.launch();
    }
}
