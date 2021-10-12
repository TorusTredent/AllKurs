package Lessons.Lesson14.entity;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private int id;
    private List<Integer> listOfMarks;
    private String firstName;
    private String lastName;

    public Student(int id, List<Integer> listOfMarks, String firstName, String lastName) {
        this.id = id;
        this.listOfMarks = listOfMarks;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Integer> getListOfMarks() {
        return listOfMarks;
    }

    public void setListOfMarks(List<Integer> listOfMarks) {
        this.listOfMarks = listOfMarks;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", listOfMarks=" + listOfMarks +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
