package OfficeH.Practice0513;

public class Constructor {

    public Constructor() {
        System.out.println("Default constructor");
    }

    public static void main(String[] args) {

        Constructor obj = new Constructor();

        System.out.println("===================================");

        Employee employee1 = new Employee("Faik", 123456, 100000);
    }
}

class Employee {

    String name;
    long id;
    double salary;

    public Employee(String name, long id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public String toString() {
        return "Name: " + name + ", id: " + id + ", Salary: " + salary;
    }
}