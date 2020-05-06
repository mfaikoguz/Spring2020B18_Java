package day34_CustomClass;

import java.util.ArrayList;

public class CarpetObjects {
    public static void main(String[] args) {

        Carpet[] carpets = {new Carpet(), new Carpet(), new Carpet(), new Carpet(), new Carpet()};

        carpets[0].customOrder(7, 8.5, 20, true);
        carpets[1].customOrder(10, 15, 30, false);
        carpets[2].customOrder(9, 20, 15, true);
        carpets[3].customOrder(20, 18, 25, false);
        carpets[4].customOrder(35, 45, 35, true);

        ArrayList<Carpet> persianCarpets = new ArrayList<>();
        for (Carpet eachCarpet : carpets) {
            if (eachCarpet.isPersian) {
                persianCarpets.add(eachCarpet);
            }
        }

        System.out.println(carpets[0]);
        System.out.println(carpets[1]);
        System.out.println(carpets[2]);
        System.out.println(carpets[3]);
        System.out.println(carpets[4]);
        System.out.println("There are " + persianCarpets.size() + " Persian carpets");
    }
}