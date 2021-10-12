package Lessons.Lesson14.service.Impl;

import Lessons.Lesson14.entity.University;
import Lessons.Lesson14.repository.Storage;
import Lessons.Lesson14.service.VerificationService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VerificationImp implements VerificationService {

    Scanner scan = new Scanner(System.in);

    @Override
    public int checkInt() {
        while (!scan.hasNextInt()) {
            System.out.println("Вы ввели значение не того типа");
            scan.next();
        }
        return scan.nextInt();
    }

    @Override
    public int checkMarks() {
        while (!scan.hasNextInt()) {
            System.out.println("Вы хотите прекратить ввод чисел?");
            System.out.println("Если да, то введите '-1'," +
                    " если нет, продожайте вводить оценки");
            scan.next();
        }
        int temp1 = scan.nextInt();

        if (temp1 == -1) {
            System.out.println("Введите еще раз -1 для выхода");
            if (scan.nextInt() == -1) {
                return -1;
            } else {
                return -2;
            }
        }

        if (temp1 < 0) {
            System.out.println("Число отрицательное, можно вводить только положительные оценки");
            return -2;
        }

        return temp1;
    }

    @Override
    public String checkString() {
        while (!scan.hasNext()) {
            System.out.println("Вы ввели значение не того типа");
            scan.next();
        }
        return scan.nextLine();
    }

    @Override
    public List<Integer> checkForIdStudent(int id, Storage storage) {
        List<Integer> listIdStudent = new ArrayList<>();
        for (int i = 0; i < storage.getGroupList().size(); i++) {
            for (int j = 0; j < storage.getGroupList().get(i).getListOfStudent().size(); j++) {
                if (storage.getGroupList().get(i).getListOfStudent().get(j).getId() == id) {
                    listIdStudent.add(i);
                    listIdStudent.add(j);
                    return listIdStudent;
                }
            }
        }
        return null;
    }

    @Override
    public int checkForIdGroup(int numberOfGroup, Storage storage) {
        for (int i = 0; i < storage.getGroupList().size(); i++) {
            if (storage.getGroupList().get(i).getNumberOfGroup() == numberOfGroup) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public int checkForNumberOfUniversity(String nameOfUniversity, Storage storage) {
        ArrayList<String> savedNames = new ArrayList<>();

        for (int i = 0; i < storage.getUniversityList().size(); i++) {
            savedNames.add(storage.getUniversityList().get(i).getNameOfUniversity());
        }

        for (int i = 0; i < savedNames.size(); i++) {
            if(nameOfUniversity.equals(savedNames.get(i))){
                return i;
            }
        }
        return -1;
    }
}
