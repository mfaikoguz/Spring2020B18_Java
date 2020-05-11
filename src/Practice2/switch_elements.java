package Practice2;

public class switch_elements {
    public static int[] do_switch(int[] i) {
        int f = i[0];
        i[0] = i[i.length - 1];
        i[i.length - 1] = f;
        return i;
    }
}