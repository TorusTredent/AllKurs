package Lessons.Lesson14.service.Impl;

import Lessons.Lesson14.entity.Student;
import Lessons.Lesson14.repository.Storage;
import Lessons.Lesson14.service.GroupService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GroupServiceImp implements GroupService {

    Scanner scanner = new Scanner(System.in);
    VerificationImp verificationImp = new VerificationImp();

    @Override
    public void addStudent(Storage storage) {
        while (true) {
            System.out.println("Введите номер группы, в которую хотите добавить студента: ");
            int inputNumberOfGroup = scanner.nextInt();
            int numberOfGroup = verificationImp.checkForIdGroup(inputNumberOfGroup, storage);
            if (numberOfGroup == -1) {
                System.out.println("Такой группы нет!");
            } else {
                System.out.println("Список занятых id: ");
                printIdStudentsInGroup(numberOfGroup, storage);
                System.out.println("Введите id студента (он не должен повторяться с уже имеющимися)");
                int inputIdStudent = scanner.nextInt();
                List<Integer> listOfStudent = verificationImp.checkForIdStudent(inputIdStudent, storage);

                if (listOfStudent != null) {
                    System.out.println("Такой студент уже есть!");
                } else {
                    System.out.println("Введите имя студента: ");
                    String firstName = verificationImp.checkString();
                    System.out.println("Введите фамилию: ");
                    String lastName = verificationImp.checkString();
                    List<Integer> listOfMarks = new ArrayList<>();
                    Student newStudent = new Student(inputIdStudent, listOfMarks, firstName, lastName);
                    storage.getGroupList().get(numberOfGroup).getListOfStudent().add(newStudent);
                    break;
                }
            }
        }
    }

    @Override
    public void deleteStudent(Storage storage) {
        while (true) {
            System.out.println("Введите номер группы: ");
            int inputNumberOfGroup = verificationImp.checkInt();
            int numberOfGroup = verificationImp.checkForIdGroup(inputNumberOfGroup, storage);
            if (numberOfGroup == -1) {
                System.out.println("Такой группы нет!");
            } else {
                System.out.println("Введите id студента: ");
                int inputIdStudent = verificationImp.checkInt();
                List<Integer> listOfStudent = verificationImp.checkForIdStudent(inputIdStudent, storage);
                if (listOfStudent == null) {
                    System.out.println("Такого студента нет!");
                } else {
                    int idStudent = listOfStudent.get(1);
                    storage.getGroupList().get(numberOfGroup).getListOfStudent().remove(idStudent);
                    System.out.println("Студент удален");
                    break;
                }
            }
        }
    }

    @Override
    public void changNumberOfGroup(Storage storage) {
        while (true) {
            System.out.println("Введите номер группы: ");
            int inputNumberOfGroup = verificationImp.checkInt();
            int numberOfGroup = verificationImp.checkForIdGroup(inputNumberOfGroup, storage);
            if (numberOfGroup == -1) {
                System.out.println("Такой группы нет!");
            } else {
                System.out.println("Введите новый номер группы: ");
                while (true) {
                    int newNumberOfGroup = verificationImp.checkInt();
                    if (newNumberOfGroup < 0) {
                        System.out.println("Номер группы не может быть отрицательным! ");
                    } else {
                        int checkNewNumberGroup = verificationImp.checkForIdGroup(newNumberOfGroup, storage);
                        if (checkNewNumberGroup == -1) {
                            System.out.println("Такой номер группы уже существует");
                        } else {
                            storage.getGroupList().get(inputNumberOfGroup).setNumberOfGroup(checkNewNumberGroup);
                            break;
                        }
                    }
                }
                break;
            }
        }
    }


    @Override
    public void printListOfStudentsOfGroup(Storage storage) {
        while (true) {
            System.out.println("Введите номер группы: ");
            int inputNumberOfGroup = verificationImp.checkInt();
            int numberOfGroup = verificationImp.checkForIdGroup(inputNumberOfGroup, storage);
            if (numberOfGroup == -1) {
                System.out.println("Такой группы нет!");
            } else {
                ObjectMapper objectMapper = new ObjectMapper();
                try {
                    Storage groupList = objectMapper.readValue(storage.getGroupList().get(numberOfGroup).getListOfStudent().toString(), Storage.class);
                    System.out.println(groupList);
                    break;
                } catch (JsonProcessingException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private void printIdStudentsInGroup(int numberOfGroup, Storage storage) {
        for (int i = 0; i < storage.getGroupList().get(numberOfGroup).getListOfStudent().size(); i++) {
            System.out.println(storage.getGroupList().get(numberOfGroup).getListOfStudent().get(i).getId());
        }
    }
}
