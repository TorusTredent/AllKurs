package Lessons.Lesson14.entity;

import java.util.ArrayList;
import java.util.List;

public class Group  {
    private List<Student> listOfStudent;
    private int numberOfGroup;

    public Group(int numberOfGroup) {
        this.numberOfGroup = numberOfGroup;
    }

    public List<Student> getListOfStudent() {
        return listOfStudent;
    }

    public void setListOfStudent(List<Student> listOfStudent) {
        this.listOfStudent = listOfStudent;
    }

    public int getNumberOfGroup() {
        return numberOfGroup;
    }

    public void setNumberOfGroup(int numberOfGroup) {
        this.numberOfGroup = numberOfGroup;
    }

    @Override
    public String toString() {
        return "Group{" +
                "listOfStudent=" + listOfStudent +
                ", numberOfGroup=" + numberOfGroup +
                '}';
    }
}
