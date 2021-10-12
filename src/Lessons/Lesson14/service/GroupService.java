package Lessons.Lesson14.service;

import Lessons.Lesson14.repository.Storage;
import com.fasterxml.jackson.core.JsonProcessingException;

public interface GroupService {
    void addStudent(Storage storage);
    void deleteStudent(Storage storage);
    void changNumberOfGroup(Storage storage);
    void printListOfStudentsOfGroup(Storage storage);
}
