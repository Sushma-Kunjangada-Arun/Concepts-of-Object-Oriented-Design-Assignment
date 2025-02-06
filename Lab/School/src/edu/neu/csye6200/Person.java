package edu.neu.csye6200;

class Person implements Comparable<Person> {
    int id;
    String firstName;
    String lastName;
    int age;

    public Person(int id, String firstName, String lastName, int age) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    @Override
    public int compareTo(Person other) {
        return Integer.compare(this.id, other.id); // Default sorting by ID
    }

    public String toString() {
        return "ID: " + id + ", Name: " + firstName + " " + lastName + ", Age: " + age;
    }
}
