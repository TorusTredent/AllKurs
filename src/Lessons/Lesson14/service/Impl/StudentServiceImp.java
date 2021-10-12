package Lessons.Lesson14.service.Impl;

import Lessons.Lesson14.repository.Storage;
import Lessons.Lesson14.service.StudentService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentServiceImp implements StudentService {

    Scanner scan = new Scanner(System.in);
    VerificationImp verificationImp = new VerificationImp();

    @Override
    public void addMarks(Storage storage) {
        System.out.println("Введите id студента: ");
        int id = verificationImp.checkInt();
        List<Integer> listOfIdStudent = verificationImp.checkForIdStudent(id, storage);
        if(listOfIdStudent == null) {
            System.out.println("Такого студента нет!");
        } else {
            List<Integer> listOfNewMarks = new ArrayList<>();
            int i = listOfIdStudent.get(0);
            int j = listOfIdStudent.get(1);
            System.out.println("Студент найден!");
            System.out.println("Если хотите прекратить, введите любую букву");
            while (true) {
                int mark = verificationImp.checkMarks();
                if (mark == -1) {
                    break;
                }
                if (mark == -2) {
                    mark = 0;
                } else {
                    listOfNewMarks.add(mark);
                }
            }
            storage.getGroupList().get(i).getListOfStudent().get(j).setListOfMarks(listOfNewMarks);
        }
    }

    @Override
    public void renameStudent(Storage storage) {
        System.out.println("Введите id студента");
        int id = verificationImp.checkInt();
        List<Integer> listOfIdStudent = verificationImp.checkForIdStudent(id, storage);
        if (listOfIdStudent == null) {
            System.out.println("Такого студента нет!");
        } else {
            System.out.println("Студент найден!");
            int i = listOfIdStudent.get(0);
            int j = listOfIdStudent.get(1);
            System.out.println("Введите новое имя: ");
            storage.getGroupList().get(i).getListOfStudent().get(j).setFirstName(verificationImp.checkString());
            System.out.println("Введите новую фамилию: ");
            storage.getGroupList().get(i).getListOfStudent().get(j).setLastName(verificationImp.checkString());
            System.out.println("Данные изменены ^_^ ");
        }
    }
}