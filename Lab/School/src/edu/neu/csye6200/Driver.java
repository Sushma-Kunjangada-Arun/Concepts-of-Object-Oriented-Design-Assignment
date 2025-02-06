package edu.neu.csye6200;

public class Driver {
    public static void main(String[] args) {
        School school = new School();

        // Students
        Student s1 = new Student(3, "Shwetha", "Sathishkumar", 20, 3.8);
        Student s2 = new Student(1, "Saroja", "Subramanian", 22, 3.5);
        Student s3 = new Student(5, "Sandra", "Siby", 19, 3.9);
        Student s4 = new Student(4, "Priyanka", "Raghunathan", 21, 3.7);
        Student s5 = new Student(2, "Niveditha", "Singh", 23, 3.6);

        // Persons
        Person p1 = new Person(6, "Ruofeng", "You", 24);
        Person p2 = new Person(7, "Sneha", "Ekka", 20);
        Person p3 = new Person(8, "Natalie", "Sun", 22);
        Person p4 = new Person(9, "Gagana", "Gowda", 21);
        Person p5 = new Person(10, "Megha", "Manjunathan", 23);

        // Adding Students
        school.addStudent(s1);
        school.addStudent(s2);
        school.addStudent(s3);
        school.addStudent(s4);
        school.addStudent(s5);

        // Adding Persons
        school.addToPersonRoster(p1);
        school.addToPersonRoster(p2);
        school.addToPersonRoster(p3);
        school.addToPersonRoster(p4);
        school.addToPersonRoster(p5);

        System.out.println("\nDefault Sorting:");
        school.defaultSort();
        System.out.println(school);

        System.out.println("\nSorted by ID:");
        school.sortById();
        System.out.println(school);

        System.out.println("\nSorted by Age:");
        school.sortByAge();
        System.out.println(school);

        System.out.println("\nSorted by Last Name:");
        school.sortByLastName();
        System.out.println(school);

        System.out.println("\nSorted by GPA:");
        school.sortByGPA();
        System.out.println(school);
    }
}