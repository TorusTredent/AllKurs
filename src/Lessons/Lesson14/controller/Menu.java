package Lessons.Lesson14.controller;

import Dz.Shop.Verification;
import Lessons.Lesson14.entity.University;
import Lessons.Lesson14.repository.Storage;
import Lessons.Lesson14.service.Impl.StorageServiceImp;
import Lessons.Lesson14.service.Impl.UniversityServiceImp;
import Lessons.Lesson14.service.Impl.VerificationImp;

import java.util.Scanner;

public class Menu {

    public static void menu(){
//        Scanner sc = new Scanner(System.in);
//        Storage storage = new Storage();
//        StorageServiceImp storageServiceImp = new StorageServiceImp();
////        storageServiceImp.addUniversity(storage);
////        storageServiceImp.addGroup(storage);
//////        storageServiceImp.addStudent(storage);
////
//////        VerificationImp verificationImp = new VerificationImp();
//////        String name = "PorgVil";
//////        int i = verificationImp.checkForNumberOfUniversity(name,storage);
//////        System.out.println(i);
////
////        UniversityServiceImp universityServiceImp = new UniversityServiceImp();
////        universityServiceImp.addUniversity(storage);
////        for (University list : storage.getUniversityList()){
////            System.out.println(list);
////        }

        VerificationImp verification = new VerificationImp();
        System.out.println("Введите число: ");
        int a = verification.checkInt();

//        for(Group list : storage.getUniversityList().get(1).getGroupList()){
//            System.out.println(list);
//        }

//        GroupServiceImp groupServiceImp = new GroupServiceImp();
//        groupServiceImp.printListOfStudentsOfGroup(storage);
//        for(Group group : storage.getGroupList()){
//            System.out.println(group);
//        }
    }

    public static void main(String[] args) {
        menu();
    }

    private void initialize(){

    }
}
