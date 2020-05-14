package day39_AccessModifiers;

public class CheckInfo {
    public static void main(String[] args) {

        //public
        System.out.println("Name: " + PersonalInfo.name);
        System.out.println("Gender: " + PersonalInfo.gender);

        //default
        System.out.println("Age: " + PersonalInfo.age);
        System.out.println("Grade: " + PersonalInfo.grade);

        //private
        /*
        System.out.println("SSN: " + PersonalInfo.SSN);
        System.out.println("ID: " + PersonalInfo.ID);
        */

    }
}
