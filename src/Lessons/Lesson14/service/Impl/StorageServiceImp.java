package Lessons.Lesson14.service.Impl;

import Lessons.Lesson14.entity.Group;
import Lessons.Lesson14.entity.Student;
import Lessons.Lesson14.entity.University;
import Lessons.Lesson14.repository.Storage;
import Lessons.Lesson14.service.StorageService;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class StorageServiceImp implements StorageService {

    @Override
    public void addStudent(Storage storage) {

        Student student = new Student(0, returnListWithRandomMarks(), "Alex", "Stahovski");
        Student student1 = new Student(1, returnListWithRandomMarks(), "Petr", "Pervyj");
        Student student2 = new Student(2, returnListWithRandomMarks(), "Sveta", "Ivanova");
        Student student3 = new Student(3, returnListWithRandomMarks(), "Igor", "Pupkin");
        Student student4 = new Student(4, returnListWithRandomMarks(), "Kostya", "Lee");
        Student student5 = new Student(5, returnListWithRandomMarks(), "Lida", "Paranga");
        Student student6 = new Student(6, returnListWithRandomMarks(), "Viktor", "Xoh");
        Student student7 = new Student(7, returnListWithRandomMarks(), "Andrey", "Horny");

        ArrayList<Student> listOfStudents = new ArrayList<>();
        ArrayList<Student> listOfStudents1 = new ArrayList<>();
        ArrayList<Student> listOfStudents2 = new ArrayList<>();
        ArrayList<Student> listOfStudents3 = new ArrayList<>();

        List<Group> groupList = storage.getGroupList();
        List<Group> groupList1 = storage.getGroupList();


        listOfStudents.add(student);
        listOfStudents.add(student1);
        listOfStudents1.add(student2);
        listOfStudents1.add(student3);
        listOfStudents2.add(student4);
        listOfStudents2.add(student5);
        listOfStudents3.add(student6);
        listOfStudents3.add(student7);


        groupList.get(0).setListOfStudent(listOfStudents);
        groupList.get(1).setListOfStudent(listOfStudents1);
        groupList1.get(0).setListOfStudent(listOfStudents2);
        groupList1.get(1).setListOfStudent(listOfStudents3);

        storage.setGroupList(groupList);


    }

    @Override
    public void addGroup(Storage storage) {
        Group group = new Group(0);
        Group group1 = new Group(1);
        Group group2 = new Group(2);
        Group group3 = new Group(3);

        List<Group> listOfGroup = storage.getGroupList();
        List<Group> listOfGroup1 = storage.getGroupList();


        listOfGroup.add(group);
        listOfGroup.add(group1);
        listOfGroup1.add(group2);
        listOfGroup1.add(group3);

        storage.setGroupList(listOfGroup);

    }

    @Override
    public void addUniversity(Storage storage) {
        University university1 = new University("PorgVill");
        University university2 = new University("GregorVill");

        List<University> listOfUniversity = storage.getUniversityList();

        if(listOfUniversity == null){
            listOfUniversity = new ArrayList<>();
        }

        listOfUniversity.add(university1);
        listOfUniversity.add(university2);

        storage.setUniversityList(listOfUniversity);

    }

    private List<Integer> returnListWithRandomMarks() {
        Random random = new Random();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(i, random.nextInt(10));
        }
        return list;
    }
}
