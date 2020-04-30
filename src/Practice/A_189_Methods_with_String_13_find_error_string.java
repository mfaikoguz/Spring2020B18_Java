package Practice;

public class A_189_Methods_with_String_13_find_error_string {
    public static boolean isError(String line) {
        if (line.substring(0,5).equalsIgnoreCase("error")){
            return true;
        } else {
            return false;
        }
    }
}
