package Dz.Shop;

import java.util.Scanner;

public class Application {
    Verification verification = new Verification();
    Shop shop = new Shop();

    public void start() {
        System.out.println("1 - добавить новый товар");
        System.out.println("2 - удалить товар");
        System.out.println("3 - отредактировать имеющийся товар");
        System.out.println("4 - показать весь товар");
        System.out.println("5 - выход");
        choice();
    }

    public void choice() {
        int i = verification.checkInt();

        switch (i) {
            case 1: {
                Scanner sc = new Scanner(System.in);
                System.out.println("===============================================");
                System.out.println("Введите id товара");
                int id = verification.checkInt();
                System.out.println("Введите название товара");
                String name = sc.nextLine();
                System.out.println("Введите цену товара");
                int price = verification.checkInt();
                Product product = new Product(id, name, price);
                shop.addProduct(product);
                System.out.println("===============================================");
                start();
            }
            case 2: {
                System.out.println("===============================================");
                System.out.println("1 - удалить товар с определенным id");
                System.out.println("2 - удалить все товары");
                int choice = verification.checkIntInCase2();

                switch (choice) {
                    case 1: {
                        System.out.println("Введите id");
                        int tempId = verification.checkInt();
                        shop.deleteProduct(tempId);
                        break;
                    }
                    case 2: {
                        shop.deleteAllProducts();
                        break;
                    }
                }
                System.out.println("===============================================");
                start();
            }
            case 3: {
                System.out.println("===============================================");
                System.out.println("Введите id товара");
                shop.refactorProduct(verification.checkInt());
                start();
            }
            case 4: {
                System.out.println("===============================================");
                System.out.println("Выберите в каком виде вывести весь товар:");
                System.out.println("1 - первоначальный список");
                System.out.println("2 - список отсортированный по названию(от 'A' до 'Я')");
                System.out.println("3 - список отсортированный по названию(от 'Я' до 'A' )");
                System.out.println("4 - список отсортированный по цене(возрастанию)");
                System.out.println("5 - список отсортированный по цене(убыванию)");
                System.out.println("6 - список отсортированный по id(возрастанию)");
                System.out.println("7 - список отсортированный по id(убыванию)");
                int choice = verification.checkInCase3();
                System.out.println("Ваш список: ");

                switch (choice) {
                    case 1: {
                        shop.showAllProducts();
                        break;
                    }
                    case 2: {
                        shop.sortListNameUp();
                        break;
                    }
                    case 3: {
                        shop.sortListNameDown();
                        break;
                    }
                    case 4: {
                        shop.sortListPriseUp();
                        break;
                    }
                    case 5: {
                        shop.sortListPriseDown();
                        break;
                    }
                    case 6: {
                        shop.sortListIdUp();
                        break;
                    }
                    case 7: {
                        shop.sortListIdDown();
                        break;
                    }
                }
                System.out.println("===============================================");
                start();
            }
            case 5: {
                System.out.println("Работа в магазине завершена");
                try {
                    throw new NullPointerException();
                } catch (NullPointerException e) {
                    e.getMessage();
                } finally {
                    System.out.println("Работа в магазине завершена");
                }
                System.exit(0);
            }

            default: {
                System.out.println("Таково пункта в меню нет");
                System.out.println("===============================================");
                start();
            }
        }
    }
}
