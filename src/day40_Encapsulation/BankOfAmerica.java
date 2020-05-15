package day40_Encapsulation;

public class BankOfAmerica {
    public static void main(String[] args) {

        EmployeeInfo employee1 = new EmployeeInfo();

        employee1.setSalary(100000);
        employee1.setSSN(1156665);
        employee1.setID(848452);
        employee1.setAddress("Oylesine Dr. Harika St.");

        System.out.println("Salary: $" + employee1.getSalary());
        System.out.println("SSN: " + employee1.getSSN());
        System.out.println("ID: " + employee1.getID());
        System.out.println("Address: " + employee1.getAddress());
    }
}
