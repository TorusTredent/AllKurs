package Dz.Checking;

import java.util.Scanner;

public class Check1 {
    private String name, login, password;

    public Check1(String name, String login, String password) {
        this.name = name;
        this.login = login;
        this.password = password;
    }

    public void creatNewUser(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите новый логин: ");
        login = scanner.toString();
        System.out.println("Введите новый пароль: ");
        password = scanner.toString();
        System.out.println("Введите ваше имя: ");
        name = scanner.toString();
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
