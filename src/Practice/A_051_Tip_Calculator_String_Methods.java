package Practice;

import java.util.Scanner;

public class A_051_Tip_Calculator_String_Methods {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter Split or No split");
        String Split= input.next();

        System.out.println("Enter Number of people entered");
        int NumberOfPeople=input.nextInt();

        System.out.println("Enter Service Quality");
        String ServiceQuality= input.next();

        System.out.println("Enter Check Amount");
        double CheckAmount=input.nextDouble();

        double TotalToPay = 0;
        double TotalTip = 0;
        double TipPerPerson = 0;
        boolean TipPerPerson1 = TipPerPerson==0;
        boolean Poor = ServiceQuality.equalsIgnoreCase("poor");
        boolean Fair = ServiceQuality.equalsIgnoreCase("fair");
        boolean Good = ServiceQuality.equalsIgnoreCase("good");
        boolean Great = ServiceQuality.equalsIgnoreCase("great");
        boolean Excellent=ServiceQuality.equalsIgnoreCase("excellent");
        if(Poor) {
            TotalTip= CheckAmount/100%5;
        } else if(Fair) {
            TotalTip= CheckAmount/100%10;
        } else if (Good) {
            TotalTip= CheckAmount/100%15;
        } else if (Great) {
            TotalTip= CheckAmount/100%20;
        } else {
            TotalTip= CheckAmount/100%25;
        }
        boolean YesSplit = Split.equalsIgnoreCase("yes");
        boolean NoSplit = Split.equalsIgnoreCase("no");
        if(YesSplit) {
            TotalToPay= CheckAmount / NumberOfPeople;
            TipPerPerson= TotalTip / NumberOfPeople;
        } else {
            TotalToPay = CheckAmount;
            System.out.println(TipPerPerson1);
        }
        System.out.println("Number of people entered:" + NumberOfPeople);
        System.out.println("Total to pay: " + TotalToPay);
        System.out.println("Total tip: " + TotalTip);
        System.out.println("Tip per person: " + TipPerPerson);

    }
}
