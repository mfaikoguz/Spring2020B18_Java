package Practice;

import java.util.Scanner;

public class A_078_Car_Insurance_Quote_String_methods_Scanner_If {
    private static void main(String[] args) {
        double premium = 0;
        int accidentsAmount = 0;
        int daysDrivenToWorkOrSchool = 0;
        int milesToWorkOrSchool = 0;
        String vehicleOwnership = "";
        String vehicleUsage = "";
        String continuousInsurance = "";
        String education = "";
        String name = "";
        String referenceNumber = "";
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the CountyFarm car insurance!");
        System.out.println("Enter your name");
        String name1 = scan.nextLine();
        System.out.println("Do you have a US driver license?");
        String driverlic = scan.next();
        if (driverlic.equals("No")) {
            System.out.println("Invalid data!");
            System.exit(0);
        }
        System.out.println("Enter your zip code");
        int code1 = scan.nextInt();
        if (code1 == 20910 || code1 == 20740) {
            premium += 60;
        } else if (code1 == 22102 || code1 == 22103) {
            premium += 30;
        } else {
            premium += 50;
        }
        System.out.println("Is this vehicle Owned, Financed, or Leased?");
        String vehicle = scan.next();
        if (vehicle.equals("Owned")) {
            premium = premium + 10;
        } else {
            premium = premium + 20;
        }
        System.out.println("How is this vehicle primarily used?");
        String primarily = scan.next();
        if (primarily.equals("Business")) {
            premium += 50;
        } else if (primarily.equals("Pleasure")) {
            premium += 10;
        } else if (primarily.equals("Commute")) {
            premium += 20;
            System.out.println("Days Driven To Work And/Or School");
            int days = scan.nextInt();
            premium = premium + (days * 5);
            System.out.println("Miles Driven To Work And/Or School");
            int mile = scan.nextInt();
            premium = premium + (mile * 1);
        }
        System.out.println("How old are you?");
        int age = scan.nextInt();
        if (age >= 25) {
            premium = premium * 1;
        } else if (age < 16) {
            System.out.println("Invalid data!");
            System.exit(0);
        } else if (age >= 16 || age < 18) {
            premium *= 20;
        } else if (age >= 18 || age <= 21) {
            premium *= 6;
        } else if (age > 21 || age < 25) {
            premium *= 2;
        }
        System.out.println("How many years you've been driving?");
        int year = scan.nextInt();
        if (year > 0 && age >= 16) {
            premium = premium - (year * 5);
        } else {
            System.out.println("Invalid data!");
        }
        System.out.println("Have you had any accidents in the last 5 years?");
        String accident = scan.next();
        if (accident.equals("Yes")) {
            System.out.println("How many?");
            double yes = scan.nextDouble();
            premium = premium + premium * 20 / 100 * yes;
        }
        System.out.println("Have you had continuous insurance for the past 12 months?");
        String insurance = scan.next();
        if (insurance.equals("No")) {
            premium = premium * 2;
        }
        scan.nextLine();
        System.out.println("What is the highest level of education you have completed?");
        String education1 = scan.nextLine();
        if (education1.equals("PhD") || education1.equals("Bachelors") || education1.equals("Masters")) {
            premium = premium - premium * 5 / 100;
        } else if (education1.equals("Doctors")) {
            premium = premium - premium * 10 / 100;
        } else if (education1.equals("Less than High School")) {
            premium = premium + (premium * 5 / 100);
        }
        System.out.println(name1 + ", here's your quote!");
        System.out.println("Start Your Policy Today For: $" + premium);
        int name2 = name1.length() - 1;
        referenceNumber = "" + name1.substring(0, 2) + age + name1.substring(name2 - 1, name2 + 1) + code1
                + education1.replace(" ", "");
        System.out.println("Reference number: " + referenceNumber.toUpperCase());
    }
}