package Dz.Shop;

import java.util.*;

public class Shop {
    private final ArrayList<Product> list = new ArrayList<>();
    Verification verification = new Verification();


    public void addProduct(Product products) {
        if (checkExisting(products.getId())) {
            list.add(products);
        } else {
            System.out.println("Такой товар уже есть в списке");
        }
    }


    private boolean checkExisting(int id) {
        for (Product product : list) {
            if (product.getId() == id) {
                return false;
            }
        }
        return true;
    }


    public void deleteProduct(int id) {
        boolean temp = false;
        if (!list.isEmpty()) {
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).getId() == id) {
                    list.remove(i);
                    temp = true;
                    break;
                }
            }
            if (temp) {
                System.out.println("Такого элемента нет в списке");
            } else {
                System.out.println("Удаление выполнено успешно");
            }
        } else {
            System.out.println("Список пуст");
        }
    }


    public void deleteAllProducts() {
        list.clear();
        System.out.println("Удаление выполнено успешно");
    }


    public void refactorProduct(int id) {
        if (!list.isEmpty()) {
            boolean temp = false;
            for (Product product : list) {
                if (product.getId() == id) {
                    System.out.println("Введите новое название товара: ");
                    product.setName(verification.checkString());
                    System.out.println("Введите новую цену товара: ");
                    product.setPrice(verification.checkInt());
                    System.out.println("Новый товар: ");
                    System.out.print("id- " + product.getId() + "; name- ' " + product.getName() + "'; price- " + product.getPrice());
                    System.out.println();
                    System.out.println("===============================================");
                    temp = true;
                    break;
                }
            }
            if(!temp){
                System.out.println("Такого элемента нет в списке");
            }
        } else {
            System.out.println("Список пуст");
        }
    }


    public void showAllProducts() {
        if (!list.isEmpty()) {
            for (int i = 0; i < list.size(); i++) {
                System.out.println((i + 1) + ") " + list.get(i).getId() + " - " + list.get(i).getName() + " - " + list.get(i).getPrice());
            }
        } else {
            System.out.println("Список пуст");
        }
    }


    public void sortListPriseUp() {
        if (!list.isEmpty()) {
            if (list.size() > 1) {
                list.sort(new ListPriceCorparator());
                for (int i = 0; i < list.size(); i++) {
                    System.out.println((i + 1) + ") " + list.get(i).getId() + " - " + list.get(i).getName() + " - " + list.get(i).getPrice());
                }
            } else {
                System.out.println("В списке находится 1 элемент или совсем нет");
            }
        } else {
            System.out.println("Список пуст");
        }
    }


    public void sortListPriseDown() {
        if (!list.isEmpty()) {
            if (list.size() > 1) {
                list.sort(new ListPriceCorparator());
                Collections.reverse(list);
                for (int i = 0; i < list.size(); i++) {
                    System.out.println(i + ") " + list.get(i).getId() + " - " + list.get(i).getName() + " - " + list.get(i).getPrice());
                }
            } else {
                System.out.println("В списке находится 1 элемент или совсем нет");
            }
        } else {
            System.out.println("Список пуст");
        }
    }


    public void sortListNameUp() {
        if (!list.isEmpty()) {
            if (list.size() > 1) {
                list.sort(new ListNameComparator());
                for (int i = 0; i < list.size(); i++) {
                    System.out.println(i + ") " + list.get(i).getId() + " - " + list.get(i).getName() + " - " + list.get(i).getPrice());
                }
            } else {
                System.out.println("В списке находится 1 элемент или совсем нет");
            }
        } else {
            System.out.println("Список пуст");
        }
    }


    public void sortListNameDown() {
        if (!list.isEmpty()) {
            if (list.size() > 1) {
                list.sort(new ListNameComparator());
                Collections.reverse(list);
                for (int i = 0; i < list.size(); i++) {
                    System.out.println(i + ") " + list.get(i).getId() + " - " + list.get(i).getName() + " - " + list.get(i).getPrice());
                }
            } else {
                System.out.println("В списке находится 1 элемент или совсем нет");
            }
        } else {
            System.out.println("Список пуст");
        }
    }


    public void sortListIdUp() {
        if (!list.isEmpty()) {
            if (list.size() > 1) {
                list.sort(new ListIdComparator());
                for (int i = 0; i < list.size(); i++) {
                    System.out.println(i + ") " + list.get(i).getId() + " - " + list.get(i).getName() + " - " + list.get(i).getPrice());
                }
            } else {
                System.out.println("В списке находится 1 элемент или совсем нет");
            }
        } else {
            System.out.println("Список пуст");
        }
    }


    public void sortListIdDown() {
        if (!list.isEmpty()) {
            if (list.size() > 1) {
                list.sort(new ListIdComparator());
                Collections.reverse(list);
                for (int i = 0; i < list.size(); i++) {
                    System.out.println(i + ") " + list.get(i).getId() + " - " + list.get(i).getName() + " - " + list.get(i).getPrice());
                }
            } else {
                System.out.println("В списке находится 1 элемент или совсем нет");
            }
        } else {
            System.out.println("Список пуст");
        }
    }
}