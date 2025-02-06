package edu.neu.csye6200;

class Student extends Person {
    double gpa;

    public Student(int id, String firstName, String lastName, int age, double gpa) {
        super(id, firstName, lastName, age);
        this.gpa = gpa;
    }

    public String toString() {
        return super.toString() + ", GPA: " + gpa;
    }
}