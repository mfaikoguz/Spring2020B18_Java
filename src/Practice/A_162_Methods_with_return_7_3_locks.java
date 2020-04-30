package Practice;

public class A_162_Methods_with_return_7_3_locks {
    public static boolean threeLocks(boolean a, boolean b, boolean c) {
        if (a && b) {
            return true;
        } else if (c) {
            return true;
        } else {
            return false;
        }
    }

}
