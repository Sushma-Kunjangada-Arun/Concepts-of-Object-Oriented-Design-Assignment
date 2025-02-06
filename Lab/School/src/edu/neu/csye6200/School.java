package edu.neu.csye6200;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class School {
    List<Student> studentRoster = new ArrayList<>();
    List<Person> personRoster = new ArrayList<>();

    public void addStudent(Student student) {
        studentRoster.add(student);
        personRoster.add(student);
    }

    public void addToPersonRoster(Person person) {
        personRoster.add(person);
    }

    public void defaultSort() {
        Collections.sort(studentRoster, Comparator.comparingInt(s -> s.id)); // Sort students by ID by default
        Collections.sort(personRoster); // Sort persons by ID (default in Person class)
    }

    public void sortById() {
        studentRoster.sort(Comparator.comparingInt(s -> s.id));
        personRoster.sort(Comparator.comparingInt(p -> p.id));
    }

    public void sortByAge() {
        studentRoster.sort(Comparator.comparingInt(s -> s.age));
        personRoster.sort(Comparator.comparingInt(p -> p.age));
    }

    public void sortByLastName() {
        studentRoster.sort(Comparator.comparing(s -> s.lastName));
        personRoster.sort(Comparator.comparing(p -> p.lastName));
    }

    public void sortByGPA() {
        studentRoster.sort(Comparator.comparingDouble(s -> s.gpa)); // Sorting students by GPA
        personRoster.sort((p1, p2) -> {
            if (p1 instanceof Student && p2 instanceof Student) {
                return Double.compare(((Student) p1).gpa, ((Student) p2).gpa);
            } else if (p1 instanceof Student) {
                return -1; // Students come before Persons without GPA
            } else if (p2 instanceof Student) {
                return 1;
            }
            return 0;
        });
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Student Roster:\n");
        for (Student student : studentRoster) {
            sb.append(student).append("\n");
        }
        sb.append("Person Roster:\n");
        for (Person person : personRoster) {
            sb.append(person).append("\n");
        }
        return sb.toString();
    }
}