package day06_Shorthnd_LogicalOperators;

public class SingleIfStatement {
    public static void main(String[] args) {


        boolean coldWeather = true;
        if (coldWeather){
            // true
            System.out.println("Wear your hat");
            System.out.println("Wear your coat");
        }

        boolean coronaDetected = true;
        if(coronaDetected){
            System.out.println("Buy more toilet papers");
            System.out.println("Buy more water");
            System.out.println("Stay at home");
            System.out.println("Do more Java coding");
        }
        System.out.println("======================================================");

        int a = 101;
        boolean evenNumber = a % 2 == 0;
        boolean oddNumber = a % 2 != 0;

        if (evenNumber) {
            System.out.println(a + " is even number");
        }

        if (!evenNumber) {
            System.out.println(a + " is odd number");
        }
    }
}
