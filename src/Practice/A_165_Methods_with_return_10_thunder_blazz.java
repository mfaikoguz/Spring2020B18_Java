package Practice;

public class A_165_Methods_with_return_10_thunder_blazz {
    public static boolean getThunderBlazz(boolean available, boolean gift, int ingredient1, int ingredient2, int ingredient3) {
        if (available) {
            return true;
        } else if (gift) {
            return true;
        } else if (ingredient1 == 1 && ingredient2 == 2 && ingredient3 == 3) {
            return true;
        } else if (ingredient1 == 3 && ingredient2 == 1 && ingredient3 == 2) {
            return true;
        } else {
            return false;
        }
    }


}
