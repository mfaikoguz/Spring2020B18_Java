package day34_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class StudentObjects {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setStudentInfo("Faik", "Turkish", 21, 3.75, 'M', false);
        System.out.println(student1);

        Student student2 = new Student();
        student2.setStudentInfo("Meagan", "American", 20, 3.90, 'F', false);
        System.out.println(student2);

        Student student3 = new Student();
        student3.setStudentInfo("James", "American", 23, 3.20, 'M', true);
        System.out.println(student3);

        Student student4 = new Student();
        student4.setStudentInfo("Natasha", "Russian", 22, 2.80, 'F', true);
        System.out.println(student4);

        Student[] students = {student1, student2, student3, student4};

        ArrayList<Student> canGraduate = new ArrayList<>(Arrays.asList(students));
        canGraduate.removeIf(p -> p.GPA <= 3.0);

        System.out.println(canGraduate.size());

        for (Student each : canGraduate) {
            System.out.println(each.name + " can graduate");
        }


    }
}
