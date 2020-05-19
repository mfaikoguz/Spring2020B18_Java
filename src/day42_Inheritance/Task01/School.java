package day42_Inheritance.Task01;

import java.util.ArrayList;
import java.util.Arrays;

public class School {
    public static void main(String[] args) {
    /*
    create a class called school:
					create 3 objects of student and set their info
					create a an ArrayList of students to store all student objects
					use for each loop to print out each students' name and studentID
     */

        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();

        student1.setStudentInfo("Faik", 21, 'M', 6453541, "Computer Science");
        student2.setStudentInfo("Ahmet", 20, 'M', 1516853, "Math");
        student3.setStudentInfo("Esma", 22, 'F', 2684465, "Chemistry");

        ArrayList<Student> group = new ArrayList<>(Arrays.asList(student1, student2, student3));
        for (Student each : group) {
            System.out.println(each.name + " " + each.studentID);
        }
    }
}