package day41_Inheritance.Task01;

public class businessAnalyst extends Employee {
    /*
     create subclass of employee name it businessAnalyst
     		variables: salary, name, id, jobTitle, gender
     		actions: writingRequirements, gathering
     		create a constructor that can initialize all the attributes of businessAnalyst
     */

    public businessAnalyst(String name, double salary, long id, String jobTitle, char gender) {
        this.name = name;
        this.salary = salary;
        this.id = id;
        this.jobTitle = jobTitle;
        this.gender = gender;
    }

    public void writingDocuments() {
        System.out.println(name + " is writing documents!");
    }

    public void gathering() {
        System.out.println(name + " is gathering!");
    }
}
