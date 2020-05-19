package day42_Inheritance.Task01;

public class Company {
    public static void main(String[] args) {
    /*
    create a class called company:
					create 3 objects of employee and set their info
					create an array of employees and store all those employee objects
					use regular for loop to print out each employee' name and employeeID
     */

        Employee employee1 = new Employee();
        Employee employee2 = new Employee();
        Employee employee3 = new Employee();

        employee1.setEmployeeInfo("Zuura", 29, 'F', 120000, 90123, "SDET");
        employee2.setEmployeeInfo("Sasha", 32, 'M', 140000, 90625, "Developer");
        employee3.setEmployeeInfo("Muhtar", 30, 'M', 150000, 90476, "Java Master");

        Employee arr[] = {employee1, employee2, employee3};
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Employee name: " + arr[i].name + ". Employee ID: " + arr[i].employeeID);
        }
    }
}