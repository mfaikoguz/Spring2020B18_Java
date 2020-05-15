package Resources;

import day40_Encapsulation.Encapsulation;

public class Encapsulation_Test {
    public static void main(String[] args) {
        Encapsulation obj = new Encapsulation();

        // obj.SSN = 1000;
        // System.out.println(obj.SSN);

        obj.setSSN(2132135482);
        System.out.println(obj.getSSN());
    }
}