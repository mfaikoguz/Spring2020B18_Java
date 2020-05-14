package Practice2;

public class Combine_to_full_name {
    public static String[] combineNames(String[] first_names, String[] last_names) {
        String[] combined = new String[first_names.length];
        for (int i = 0; i < first_names.length; i++) {
            combined[i] = first_names[i] + " " + last_names[i];
        }
        return combined;

    }
}
