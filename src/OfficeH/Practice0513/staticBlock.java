package OfficeH.Practice0513;

public class staticBlock {
    static String str;


    static {
        str = "Cybertek";
    }



    public static void main(String[] args) {
        str = "Cybertek";
        System.out.println(str);
    }
}


class staticBlockTest {
    public static void main(String[] args) {
        System.out.println(staticBlock.str);
    }
}