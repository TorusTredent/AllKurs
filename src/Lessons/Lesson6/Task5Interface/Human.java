package Lessons.Lesson6.Task5Interface;

public class Human implements Kurtka,Shtany,Obuv{
    private String name;
    private boolean kurtka, shtany, obuv;

    public Human(String name, boolean kurtka, boolean shtany, boolean obuv) {
        this.name = name;
        this.kurtka = kurtka;
        this.shtany = shtany;
        this.obuv = obuv;
    }

    public void takeOn(){
        System.out.println(name);
        nadetKurtku(true);
        nadetShtany(true);
        nadetObuv(true);
        System.out.println(kurtka);
    }

    public void takeOff(){
        System.out.println(name);
        snyatKurtku(false);
        snyatShtany(false);
        snyatObuv(false);
    }

    @Override
    public void nadetKurtku(boolean kurtka) {
        this.kurtka = kurtka;
        System.out.println("Надел куртку");
    }

    @Override
    public void snyatKurtku(boolean kurtka) {
        this.kurtka = kurtka;
        System.out.println("Снял куртку");
    }

    @Override
    public void nadetObuv(boolean obuv) {
        this.obuv = obuv;
        System.out.println("Надел обувь");
    }

    @Override
    public void snyatObuv(boolean obuv) {
        this.obuv = obuv;
        System.out.println("Снял обувь");
    }

    @Override
    public void nadetShtany(boolean shtany) {
        this.shtany = shtany;
        System.out.println("Надел штаны");
    }

    @Override
    public void snyatShtany(boolean shtany) {
        this.shtany = shtany;
        System.out.println("Снял штаны");
    }
}
