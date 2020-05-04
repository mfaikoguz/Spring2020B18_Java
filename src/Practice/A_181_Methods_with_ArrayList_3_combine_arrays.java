package Practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class A_181_Methods_with_ArrayList_3_combine_arrays {
    public static String combineRs(String[] r1, String[] r2) {
        ArrayList combine = new ArrayList(Arrays.asList(r1));

        String result = "";
        for (Object each : combine) {
            result += each;
        }
        return result;

    }
}
