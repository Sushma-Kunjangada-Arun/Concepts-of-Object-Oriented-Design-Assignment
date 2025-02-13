package edu.neu.csye6200;
import java.util.*;

public class Person {
    private int ID;
    private int age;
    private String firstName;
    private String lastName;
    private String parentFirstName;
    private String parentLastName;

    public Person(int ID, int age, String firstName, String lastName, String parentFirstName, String parentLastName) {
        this.ID = ID;
        this.age = age;
        this.firstName = firstName;
        this.lastName = lastName;
        this.parentFirstName = parentFirstName;
        this.parentLastName = parentLastName;
    }

    public void displayPersonInfo() {
        System.out.println("ID: " + ID);
        System.out.println("Name: " + firstName + " " + lastName);
        System.out.println("Age: " + age);
        System.out.println("Parent: " + parentFirstName + " " + parentLastName);
    }

    //Student
    public class Student extends Person {
        private int studentID;
        private double GPA;

        public Student(int ID, int age, String firstName, String lastName, String parentFirstName, String parentLastName,
                       int studentID, double GPA) {
            super(ID, age, firstName, lastName, parentFirstName, parentLastName);
            this.studentID = studentID;
            this.GPA = GPA;
        }

        public static Student parseStudent(String csvLine) {
            String[] data = csvLine.split(",");
            if (data.length != 8) {
                throw new IllegalArgumentException("Invalid CSV format: " + csvLine);
            }
            return new Person(
                    Integer.parseInt(data[0]), Integer.parseInt(data[1]), data[2], data[3], data[4], data[5]
            ).new Student(
                    Integer.parseInt(data[0]), Integer.parseInt(data[1]), data[2], data[3], data[4], data[5],
                    Integer.parseInt(data[6]), Double.parseDouble(data[7])
            );
        }

        public void displayStudentInfo() {
            /*System.out.println("Name: " + firstName + " " + lastName);
            System.out.println("Age: " + age);
            System.out.println("GPA: " + GPA);
            System.out.println("-------------------");
            */
        	super.displayPersonInfo();
            System.out.println("Student ID: " + studentID);
            System.out.println("GPA: " + GPA);
            System.out.println("-------------------");
        }

        // Getters
        public int getID() { return super.ID; }
        public int getStudentID() { return studentID; }
        public String getLastName() { return super.lastName; }
        public String getFirstName() { return super.firstName; }
        public double getGPA() { return GPA; }
    }

    // Teacher
    public class Teacher extends Person {
        private double hourlyWage;

        public Teacher(int ID, int age, String firstName, String lastName, String parentFirstName, String parentLastName,
                       double hourlyWage) {
            super(ID, age, firstName, lastName, parentFirstName, parentLastName);
            this.hourlyWage = hourlyWage;
        }

        public void displayTeacherInfo() {
            System.out.println("Name: " + firstName + " " + lastName);
            System.out.println("Age: " + age);
            System.out.println("Hourly Wage: $" + hourlyWage);
            System.out.println("-------------------");
        }
    }

    public static void demo() {
        // Read student data from CSV file
        List<Student> students = new ArrayList<>();
        try {
        	List<String> lines = FileUtil.readFile("/Users/sushmaka/eclipse-workspace/students.txt");
            for (String line : lines) {
                students.add(Student.parseStudent(line));
            }
        } catch (Exception e) {
            System.out.println("Error reading student file: " + e.getMessage());
            return;
        }

        /*System.out.println("Displaying Student Info:");
        students.forEach(Student::displayStudentInfo);
        */

        Teacher teacher = new Person(301, 35, "David", "Smith", "John", "Smith").new Teacher(301, 35, "David", "Smith", "John", "Smith", 50.0);
        /*System.out.println("Displaying Teacher Info:");
        teacher.displayTeacherInfo();
        */

        sortStudents(students, "ID");
        System.out.println("\n\n");
        sortStudents(students, "StudentID");
        System.out.println("\n\n");
        sortStudents(students, "LastName");
        System.out.println("\n\n");
        sortStudents(students, "FirstName");
        System.out.println("\n\n");
        sortStudents(students, "GPA");
        System.out.println("\n\n");
        sortStudents(students, "");
        
    }

    public static void sortStudents(List<Student> students, String criteria) {
        Comparator<Student> comparator;
        
        if (criteria == null || criteria.isEmpty()) {
            System.out.println("No sorting criteria provided. Sorting by ID by default.");
            comparator = Comparator.comparingInt(Student::getID);
        } else {
            comparator = switch (criteria) {
                case "ID" -> Comparator.comparingInt(Student::getID);
                case "StudentID" -> Comparator.comparingInt(Student::getStudentID);
                case "LastName" -> Comparator.comparing(Student::getLastName);
                case "FirstName" -> Comparator.comparing(Student::getFirstName);
                case "GPA" -> Comparator.comparingDouble(Student::getGPA);
                default -> throw new IllegalArgumentException("Invalid sorting criteria: " + criteria);
            };
        }

        students.sort(comparator);
        System.out.println("Sorting students by " + criteria + ":");
        students.forEach(Student::displayStudentInfo);
    }
}

