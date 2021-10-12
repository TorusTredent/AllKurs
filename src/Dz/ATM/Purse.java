package Dz.ATM;

public class Purse {
    private int id;
    private int value;

    public Purse(int id, int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

}
