package Lessons.Lesson14.service;

import Lessons.Lesson14.repository.Storage;

import java.util.List;

public interface VerificationService {
    int checkInt();
    String checkString();
    int checkMarks();
    List<Integer> checkForIdStudent(int id, Storage storage);
    int checkForIdGroup(int numberOfGroup, Storage storage);
    int checkForNumberOfUniversity(String nameOfUniversity, Storage storage);
}
