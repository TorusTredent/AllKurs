package Dz.Checking;

import java.util.ArrayList;

public class Check2 extends Check1{
    private ArrayList arrNames;
    public  Check2(String name, String login, String password, ArrayList arrNames) {
        super(name, login, password);
        this.arrNames = arrNames;
    }

    public void saving(){
        System.out.println(getArrNames());
    }

    public ArrayList getArrNames() {
        return arrNames;
    }

    public void setArrNames(ArrayList arrNames) {
        this.arrNames = arrNames;
    }
}
