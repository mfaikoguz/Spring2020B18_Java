package Practice;

public class A_159_Methods_with_return_4_profit_or_loss {
    public static String c_profits (int buyPrice,int sellPrice){
        if (sellPrice > buyPrice) {
            return "profit";
        } else if (buyPrice > sellPrice) {
            return "loss";
        } else {
            return "no loss";
        }
    }

}
