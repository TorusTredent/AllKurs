package Lessons.Lesson14.service;

import Lessons.Lesson14.repository.Storage;

public interface UniversityService {
    void addUniversity(Storage storage);
    void addGroup(Storage storage);
    void removeGroup(Storage storage);
}
