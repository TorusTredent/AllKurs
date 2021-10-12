package Lessons.Lesson14.entity;


import java.util.ArrayList;
import java.util.List;

public class University {
    private String nameOfUniversity;
    private List<Group> listOfGroup;

    public University(String nameOfUniversity) {
        this.nameOfUniversity = nameOfUniversity;
    }

    public List<Group> getGroupList() {
        return listOfGroup;
    }

    public void setGroupList(List<Group> groupList) {
        this.listOfGroup = groupList;
    }

    public String getNameOfUniversity() {
        return nameOfUniversity;
    }

    public void setNameOfUniversity(String nameOfUniversity) {
        this.nameOfUniversity = nameOfUniversity;
    }

}
