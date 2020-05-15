package day40_Encapsulation;

public class Person_Objects {

    public static void main(String[] args) {
        Person name1 = new Person("Mehmet");
        System.out.println(name1.name);
        name1.setSSN(153535);
        System.out.println("SSN: " + name1.getSSN());
        name1.setID(156165);
        System.out.println("ID: " + name1.getID());
    }
}
