package Practice;

public class A_164_Methods_with_return_9_simple_room_booking {
    public static boolean simpleRoomBook(boolean isAvailable, int month, int day, int year) {
        if (isAvailable) {
            if ((month != 7 || day > 8) && year == 2018) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }

    }
}
