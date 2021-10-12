package Lessons.Lesson14.service;

import Lessons.Lesson14.entity.Student;
import Lessons.Lesson14.repository.Storage;

import java.util.ArrayList;
import java.util.List;

public interface StudentService {
    void addMarks(Storage storage);
    void renameStudent(Storage storage);
}
