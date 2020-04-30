package day09_NestedIf_Ternary;

public class Loan_NestedIf {
    public static void main(String[] args) {
        double salary = 120000;
        byte workHistory = 3;

        if (salary >= 30000) { // might be qualified for the loan
            if (workHistory >= 2) {
                System.out.println("You are qualified. Congratulations!");
            } else {
                System.out.println("Not qualified. You need 2 years of work history to qualify.");
            }
        } else {
            System.out.println("Not qualified. You must earn at least $30000 to qualify.");
        }

    }
}
