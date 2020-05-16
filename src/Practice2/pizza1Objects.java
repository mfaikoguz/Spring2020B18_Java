package Practice2;

public class pizza1Objects {
    public static void main(String[] args) {
        Pizza pizza1 = new Pizza("large", 1, 2,0);


        System.out.println(pizza1.getDescription());
        System.out.println("Total Price: " + pizza1.calcCost());
    }
}
