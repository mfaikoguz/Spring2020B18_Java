package Practice2;

public class Pizza {
    private String size;
    private int cheeseToppings;
    private int pepperoniToppings;
    private int hamToppings;

    public Pizza(String size, int cheeseToppings, int pepperoniToppings, int hamToppings) {
        this.size = size;
        this.cheeseToppings = cheeseToppings;
        this.pepperoniToppings = pepperoniToppings;
        this.hamToppings = hamToppings;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getCheeseToppings() {
        return cheeseToppings;
    }

    public void setCheeseToppings(int cheeseToppings) {
        this.cheeseToppings = cheeseToppings;
    }

    public int getPepperoniToppings() {
        return pepperoniToppings;
    }

    public void setPepperoniToppings(int pepperoniToppings) {
        this.pepperoniToppings = pepperoniToppings;
    }

    public int getHamToppings() {
        return hamToppings;
    }

    public void setHamToppings(int hamToppings) {
        this.hamToppings = hamToppings;
    }

    public double calcCost() {
        double cost = 0;
        if (size.equalsIgnoreCase("small")) {
            cost = 10 + (2 * cheeseToppings) + (2 * pepperoniToppings) + (2 * hamToppings);
        } else if (size.equalsIgnoreCase("medium")) {
            cost = 12 + (2 * cheeseToppings) + (2 * pepperoniToppings) + (2 * hamToppings);
        } else if (size.equalsIgnoreCase("large")) {
            cost = 14 + (2 * cheeseToppings) + (2 * pepperoniToppings) + (2 * hamToppings);
        }
        return cost;
    }

    public String getDescription() {
        return size + " Pizza with " + cheeseToppings + " Cheese Toppings, "
                + pepperoniToppings + " Pepperoni Toppings, " + hamToppings + " Ham toppings.";
    }
}