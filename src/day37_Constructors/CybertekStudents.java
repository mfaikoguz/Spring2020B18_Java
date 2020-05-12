package day37_Constructors;

public class CybertekStudents {
    static String schoolName; // we already know this
    String studentName; //  we must need to know
    int groupNumber; //  we must need to know
    String batch; //  we must need to know

    public CybertekStudents(String studentName, int groupNumber, String batch) {
        schoolName = "Cybertek University";
        this.studentName = studentName;
        this.groupNumber = groupNumber;
        this.batch = batch;
    }

    public String toString() {
        return "Name: " + studentName + ", Batch: " + batch +
                ", in group: " + groupNumber + ", School Name: " + schoolName;
    }
}



class Test{
    public static void main(String[] args) {
        CybertekStudents students1 = new CybertekStudents("Faik", 10, "18");
        students1.schoolName = "Cybertek School"; // changes Cybertek University to Cybertek School
        System.out.println(students1);
        CybertekStudents students2 = new CybertekStudents("Ruveyda", 3, "15");
        System.out.println(students2);
    }
}
