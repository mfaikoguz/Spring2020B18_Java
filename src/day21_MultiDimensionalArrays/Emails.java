package day21_MultiDimensionalArrays;

public class Emails {
    public static void main(String[] args) {
        /*
        Task:
    given an array:
        String[] emails = {"Cybertek@gmail.com", "Cybertek@yahoo.com", "Cybertek@hotmail.com", "Cybertek@outlook.com"}
        elements could be more in the array
        print all the email addresses excluding the gmail addresses
        NOTE: MUST USE FOR EACH LOOP
        */
        String[] emails = {"Cybertek@gmail.com", "Cybertek@yahoo.com", "Cybertek@hotmail.com", "Cybertek@outlook.com"};

        for (String eachEmail: emails) {
            if (!eachEmail.endsWith("@gmail.com")) {
                System.out.println(eachEmail);
            }
        }
    }
}
