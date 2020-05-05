package Practice2;

public class pizza {
    String size;
    int cheeseToppings;
    int pepperoniToppings;

    public void customizeOrder(int cToppings, int pToppings, String pizzaSize) {
        size = pizzaSize;
        cheeseToppings = cToppings;
        pepperoniToppings = pToppings;
    }

    public double calcCost() {
        double cost = 0;
        if (size.equalsIgnoreCase("small")) {
            cost = 10 + (1.5 * pepperoniToppings) + (cheeseToppings);
        } else if (size.equalsIgnoreCase("medium")) {
            cost = 12 + (1.5 * pepperoniToppings) + (cheeseToppings);
        } else if (size.equalsIgnoreCase("large")) {
            cost = 14 + (1.5 * pepperoniToppings) + (cheeseToppings);
        }
        return cost;
    }

    public String toString() {
        String result = "Size: " + size + ", Cheese Toppings: " + cheeseToppings + ", Pepperoni Toppings: " + pepperoniToppings
                + ", Cost: $" + calcCost();
        return result;
    }
}
