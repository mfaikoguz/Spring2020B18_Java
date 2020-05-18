package day41_Inheritance.Task01;

public class EmployeeObjects {

    public static void main(String[] args) {

        Developer dev1 = new Developer("Faik", 125000, 515686, "Software Developer", 'M');
        System.out.println(dev1.name);
        dev1.coding();
        dev1.fixingBug();
        System.out.println(dev1);

        System.out.println("===============================================================================");

        Tester tester1 = new Tester("Faik", 130000, 1861354, "QA", 'M');
        System.out.println(tester1.name);
        tester1.testing();
        tester1.reportingBug();
        System.out.println(tester1);

        System.out.println("===============================================================================");

        businessAnalyst BA1 = new businessAnalyst("Faik", 110000, 2515185, "BA", 'M');
        System.out.println(BA1.name);
        BA1.gathering();
        BA1.writingDocuments();
        System.out.println(BA1);

    }
}
