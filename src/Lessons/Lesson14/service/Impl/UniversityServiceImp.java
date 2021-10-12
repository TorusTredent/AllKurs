package Lessons.Lesson14.service.Impl;

import Lessons.Lesson14.entity.University;
import Lessons.Lesson14.repository.Storage;
import Lessons.Lesson14.service.UniversityService;

import java.util.Scanner;

public class UniversityServiceImp implements UniversityService {

    Scanner scanner = new Scanner(System.in);
    VerificationImp verificationImp = new VerificationImp();

    @Override
    public void addUniversity(Storage storage) {
        while (true) {
            System.out.println("Введите название университета: ");
            String inputName = verificationImp.checkString();
            int checkNumberOfUniversity = verificationImp.checkForNumberOfUniversity(inputName, storage);
            if (checkNumberOfUniversity != -1) {
                System.out.println("Такой университет уже есть");
            } else {
                University newUniversity = new University(inputName);
                storage.getUniversityList().add(newUniversity);
                System.out.println("Добавление выполнено!");
                break;
            }
        }
    }

    @Override
    public void removeGroup(Storage storage) {

    }

    @Override
    public void addGroup(Storage storage) {

    }
}
