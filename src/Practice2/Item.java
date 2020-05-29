package Practice2;

public class Item {
    //private instance variables
    private String name;
    private int catalogNumber;
    private int quantity;
    private double price;

    /**
     * public constructor with:
     *
     * @param name
     * @param quantity
     * @param catalogNumber
     * @param price         assigns to values to instance variables
     */
    public Item(String name, int quantity, int catalogNumber, double price) {


    }

    /**
     * setter for name instance variable
     *
     * @param name
     */
    public void setName(String name) {

    }

    /**
     * setter for private price
     *
     * @param price
     */
    public void setPrice(double price) {

    }

    /**
     * getter for price
     *
     * @return
     */
    public double getPrice() {

        return 0.0;
    }

    /**
     * getter for name
     *
     * @return
     */
    public String getName() {


        return null;
    }


    public int getQuantity() {
        //TODO
        return -1;

    }

    public void setQuantity(int quantity) {
        //TODO

    }

    public int getCatalogNumber() {
        //TODO
        return -1;
    }

    public void setCatalogNumber(int catalogNumber) {


    }

    /**
     * Override toString:
     *
     * @returns Object description in this format:
     * "Regular Item{name='Item name', catalogNumber=1234, quantity=5, price=9.99}"
     */
    @Override
    public String toString() {
        return "";
    }

}

class OnSaleItem extends Item {
    /**
     * private instance variable, used for discount percentage
     */
    private double discount;

    /**
     * public constructor for OnSaleItem
     *
     * @param name
     * @param quantity
     * @param catalogNumber
     * @param price
     * @param discount      - Calls Super class constructor by passing name,quantity,catalogNumber,price
     *                      - it will assign the price after deducting(minus) discount from the price
     *                      - assigns discount
     */
    public OnSaleItem(String name, int quantity, int catalogNumber, double price, double discount) {
        super(name, quantity, catalogNumber, price - price * (discount / 100));
        this.discount = discount;
    }

    /**
     * getter for discount
     *
     * @return
     */
    public double getDiscount() {
        //TODO
        return 0.0;
    }

    /**
     * setter for discount
     *
     * @param discount
     */
    public void setDiscount(double discount) {

    }

    /**
     * overrides toString from Item:
     *
     * @returns Object description in this format:
     * * "OnSaleItem{discount=20.0%, name=ItemName, price=100.45}"
     */
    @Override
    public String toString() {
        return "";
    }
}