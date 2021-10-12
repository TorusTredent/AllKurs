package Lessons.Lesson7.Task2;

import java.util.Objects;

public class Person {
    private String person;
    private int age;

    public Person(String person, int age) {
        this.person = person;
        this.age = age;
    }

    public String getPerson() {
        return person;
    }

    public void setPerson(String person) {
        this.person = person;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "person='" + person + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person1 = (Person) o;
        return age == person1.age && Objects.equals(person, person1.person);
    }

    @Override
    public int hashCode() {
        return Objects.hash(person, age);
    }
}
