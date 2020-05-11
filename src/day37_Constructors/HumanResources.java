package day37_Constructors;

public class HumanResources {
    /*
    create a class called HumanResources
			declare 5 variables of Employee as static
			use static block to:
						1. initialize those static variables
						2. set all the info of the Employees
     */

    static Employee employee1 = new Employee();
    static Employee employee2 = new Employee();
    static Employee employee3 = new Employee();
    static Employee employee4 = new Employee();
    static Employee employee5 = new Employee();

    public static void main(String[] args) {
        employee1.setInfo("Faik", 123546, 8584554, "QA", 100000, 'M');
        employee2.setInfo("Ahmet", 123555146, 5484656, "Mechanic", 60000, 'M');
        employee3.setInfo("Merve", 1235454856, 25511452, "Manual Tester", 100000, 'F');
        employee4.setInfo("Ruveyda", 1254843546, 12155213, "QA", 110000, 'F');
        employee5.setInfo("Talha", 12354546, 85864554, "QA", 100000, 'M');
        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println(employee3);
        System.out.println(employee4);
        System.out.println(employee5);
    }

    static {
        employee1.setInfo("Faik", 123546, 8584554, "QA", 100000, 'M');
        employee2.setInfo("Ahmet", 123555146, 5484656, "Mechanic", 60000, 'M');
        employee3.setInfo("Merve", 1235454856, 25511452, "Manual Tester", 100000, 'F');
        employee4.setInfo("Ruveyda", 1254843546, 12155213, "QA", 110000, 'F');
        employee5.setInfo("Talha", 12354546, 85864554, "QA", 100000, 'M');
    }
}