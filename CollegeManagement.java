import java.util.*;
class Person {
    String name; int id;
    Person(String name, int id) { this.name = name; this.id = id; }
    void display() { System.out.println("Name: " + name + ", ID: " + id); }
}
class Student extends Person {
    String course;
    Student(String name, int id, String course) { super(name, id); this.course = course; }
    void display() { super.display(); System.out.println("Course: " + course); }
}
class Faculty extends Person {
    String department;
    Faculty(String name, int id, String department) { super(name, id); this.department = department; }
    void display() { super.display(); System.out.println("Department: " + department); }
}
public class CollegeManagement {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(new Student("Venky", 500, "CSe"), new Student("Baby", 502, "Cse"));
        List<Faculty> faculty = Arrays.asList(new Faculty("Dr. Sayamma", 300, "Chemistry"), new Faculty("Dr. VenkataSubbaiah", 302, "Physics"));
        System.out.println("\nStudents:");
        students.forEach(Student::display);
        System.out.println("\nFaculty:");
        faculty.forEach(Faculty::display);
    }
}
