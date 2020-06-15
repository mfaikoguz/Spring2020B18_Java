package day49_Polymorphism;

public abstract class Employee {
    String name;
    long id;
    String jobTitle;
    double salary;

    public abstract void work();
}

class Tester extends Employee {

    @Override
    public void work() {

    }
}

class Developer extends Employee {

    @Override
    public void work() {

    }
}

class ScrumTeam {
    
}