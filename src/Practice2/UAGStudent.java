package Practice2;

public class UAGStudent {
    String name;
    int grade;
    static String principalName = "Ms. McKoy";
    String studentID;
    static int nextID = 100;

    public UAGStudent(String name, int grade) {
        this.name = name;
        this.grade = grade;
        studentID = (name.substring(0, 1).toUpperCase()) + nextID++;
    }

    public static void newPrincipal(String newPrincipalName) {
        principalName = newPrincipalName;
    }

    public static void resetID() {
        nextID = 100;
    }

    public String toString() {
        return name + " " + studentID;
    }
}
