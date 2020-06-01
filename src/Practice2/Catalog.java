package Practice2;

import java.util.ArrayList;

public class Catalog {
    public ArrayList<String> items = new ArrayList<>();
    public ArrayList<Double> prices = new ArrayList<>();
    public ArrayList<Double> monthlyPayments = new ArrayList<>();

    /**
     * This method adds all listed items to <items> arraylist
     * that is already declared above
     */
    public void loadItems() {
        //TODO
        items.add(0, "iPhone 6s");
        items.add(1, "iPhone 6s Plus");
        items.add(2, "iPhone X");
        items.add(3, "MacbookPro");
        items.add(4, "ThumbDrive");
        items.add(5, "Beats Headphones");
        items.add(6, "Mouse");
        items.add(7, "Charger");
        items.add(8, "iPad");
        items.add(9, "Dyson Vacuum");
        items.add(10, "TV");
        items.add(11, "Apple Watch");
      /*
        "iPhone 6s"
		"iPhone 6s Plus"
		"iPhone X"
		"MacbookPro"
		"ThumbDrive"
		"Beats HeadPhones"
		"Mouse"
		"Charger"
		"iPad"
		"Dyson Vacuum"
		"TV"
		"Apple Watch"
       */
    }

    /**
     * This method adds all listed prices to <prices> arraylist
     * that is already declared above
     */
    public void loadPrices() {
        //TODO
        prices.add(0, 449.0);
        prices.add(1, 549.0);
        prices.add(2, 1149.0);
        prices.add(3, 1499.99);
        prices.add(4, 39.99);
        prices.add(5, 349.99);
        prices.add(6, 79.99);
        prices.add(7, 39.99);
        prices.add(8, 429.0);
        prices.add(9, 399.0);
        prices.add(10, 2199.0);
        prices.add(11, 559.0);
		/*449.0
		  549.0
		  1149.0
		  1499.99
		  39.99
		  349.99
		  79.99
		  39.99
		  429.0
		  399.0
		  2199.0
		  559.0
		 */
    }

    /**
     * This method adds all listed monthly payments to <monthlyPayments> arraylist
     * that is already declared above
     */

    public void loadMonthlyPayments() {
        //TODO
        monthlyPayments.add(0, 18.71);
        monthlyPayments.add(1, 22.88);
        monthlyPayments.add(2, 56.16);
        monthlyPayments.add(3, 79.49);
        monthlyPayments.add(4, 2.68);
        monthlyPayments.add(5, 15.12);
        monthlyPayments.add(6, 8.98);
        monthlyPayments.add(7, 4.56);
        monthlyPayments.add(8, 18.31);
        monthlyPayments.add(9, 16.25);
        monthlyPayments.add(10, 89.49);
        monthlyPayments.add(11, 21.18);
		/*
		  18.71
		  22.88
		  56.16
          79.49
          2.68
          15.12
		  8.98
		  4.56
		  18.31
		  16.25
		  89.49
		  21.18
		  */
    }

    /**
     * This method will load whole catalog data - <items>,<prices>,<monthlyPayments>
     * Call loadItems(),loadPrices(),loadMonthlyPayments() that you created above
     */
    public void loadWholeCatalog() {
        //TODO
        loadItems();
        loadPrices();
        loadMonthlyPayments();
    }

    /**
     * do not change the method below
     */
    public StringBuilder getWholeCatalog() {
        loadWholeCatalog();
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < items.size(); i++) {
            str.append(items.get(i) + "-" + prices.get(i) + "-" + monthlyPayments.get(i) + "\n");
        }
        return str;
    }


    /**
     * write a method that an item name and returns all details for it. If item
     * is not in the list then returns null
     * ex:
     * getItemDetails("ThumbDrive") -->ThumbDrive-39.99-2.68
     * getItemDetails("Charger") --> Charger-39.99-4.56
     * getItemDetails("Potato") --> null
     *
     * @param item
     * @return
     */

    public String getItemDetails(String item) {
        //LOAD WHOLE CATALOG HERE FIRST:
        loadWholeCatalog();
        //TODO:
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).equals(item)) {
                return items.get(i) + "-" + prices.get(i) + "-" + monthlyPayments.get(i);
            }

        }

        return null;
    }

    /**
     * write a method that accepts a price and returns a ArrayList<String> with
     * items with all detail that have less than or equal monthly payments
     * <p>
     * getItemsLessThanAMonthlyPrice(5.99) --> ThumbDrive-39.99-2.68
     * Charger-39.99-4.56
     * getItemsLessThanAMonthlyPrice(1.99) --> ""
     * <p>
     * //* @param double price
     *
     * @return ArrayList<String>
     */

    public ArrayList<String> getItemsLessThanAMonthlyPrice(double price) {
        //LOAD WHOLE CATALOG HERE FIRST
        loadWholeCatalog();
        //TODO
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < items.size(); i++) {
            if (monthlyPayments.get(i) < price) {
                list.add(items.get(i) + "-" + prices.get(i) + "-" + monthlyPayments.get(i));
            }
        }

        return null;
    }

    /**
     * Method accepts an item name and updates total Price and monthly payments
     * for that item in <items>,<prices>,<monthlyPayments> arrayLists
     * When assigning monthlyPayments do =>  newPrice/12 <= to get monthly payments
     *
     * @param item     name
     * @param newPrice
     */

    public void updatePrice(String item, double newPrice) {
        //LOAD WHOLE CATALOG HERE FIRST
        loadWholeCatalog();
        //TODO
        for (int i = 0; i < prices.size(); i++) {
            if (items.get(i).equalsIgnoreCase(item)) {
                prices.set(i, newPrice);
                monthlyPayments.set(i, newPrice / 12);
            }
        }
    }

    /**
     * Method looks for an item in the catalog and removes
     * all details for that item including item name, price, monthlypayments
     *
     * @param item
     */

    public void deleteItemFromCatalog(String item) {
        //LOAD WHOLE CATALOG HERE FIRST
        loadWholeCatalog();
        //TODO
        for (int i = 0; i < prices.size(); i++) {
            if (items.get(i).equals(item)) {
                items.remove(i);
                prices.remove(i);
                monthlyPayments.remove(i);
            }
        }
    }


}