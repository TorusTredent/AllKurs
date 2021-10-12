package Lessons.Lesson14.repository;

import Lessons.Lesson14.entity.Group;
import Lessons.Lesson14.entity.Student;
import Lessons.Lesson14.entity.University;

import java.util.ArrayList;
import java.util.List;

public class Storage {

    private List<Group> groupList = new ArrayList<>();
    private List<University> universityList = new ArrayList<>();

    public List<Group> getGroupList() {
        return groupList;
    }

    public void setGroupList(List<Group> groupList) {
        this.groupList = groupList;
    }

    public List<University> getUniversityList() {
        return universityList;
    }

    public void setUniversityList(List<University> universityList) {
        this.universityList = universityList;
    }
}
