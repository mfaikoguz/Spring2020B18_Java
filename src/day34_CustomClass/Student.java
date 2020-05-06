package day34_CustomClass;

public class Student {
    String name;
    String nationality;
    int age;
    double GPA;
    char gender;
    boolean married;

    public void setStudentInfo(String name, String nationality, int age, double GPA, char gender, boolean married) {
        this.name = name;
        this.nationality = nationality;
        this.age = age;
        this.GPA = GPA;
        this.gender = gender;
        this.married = married;
    }

    public String toString() {
        return "Name: " + name + ", Nationality: " + nationality + ", Age: "
                + age + ", GPA: " + GPA + ", Gender: " + gender + ", Married?: " + married;
    }
}
