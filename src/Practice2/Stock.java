package Practice2;

import java.util.*;

public class Stock {

    String tickerSymbol;
    String companyName;
    int price;
    double percentChange;
    int totalShares;
    long marketCap;

    public Stock(String tickerSymbol, String companyName, int price, int totalShares) {
        this.tickerSymbol = tickerSymbol.toUpperCase();
        this.companyName = companyName;
        this.price = price;
        this.totalShares = totalShares;
        marketCap = totalShares * price;
    }


    // DO NOT CHANGE THE METHOD BELOW
    public void adjustPrice(int value) {
        int temp = price;
        price = price + (value);
        percentChange = ((double) (price - temp)) / temp;
        marketCap = totalShares * price;
    }

    public String toString() {
        return "Ticker Symbol: " + tickerSymbol + "\n Company: " + companyName
                + "\nCurrent Price: " + price + "\nMarket Cap: " + marketCap;
    }


}

class Main1 {
    public static void main(String[] args) {
        Stock stock1 = new Stock("asd", "Apple", 55, 6);
        System.out.println(stock1);
    }
}
