package day36_StaticBlock;

import day34_CustomClass.Tester;

public class HumanResources {

    static Tester tester1 = new Tester();
    static Tester tester2 = new Tester();
    static Tester tester3 = new Tester();
    static Tester tester4 = new Tester();
    static Tester tester5 = new Tester();

    public static void main(String[] args) {
        tester1.setTesterInfo("faik", 21321, "SDET", 210300);
        // this doesn't work on the CapitalOne class because we set the Tester info in the main method
    }

    static {
        tester1.setTesterInfo("faik", 21321, "SDET", 210300);
        // this works on the CapitalOne class because we set the Tester in fo in the static method
    }

}
