package day48_Abstraction;

public class PhoneObjects {
    public static void main(String[] args) {
        iPhone iphone1 = new iPhone("XR", 799, "11\"");
        iPhone iphone2 = new iPhone("XS Plus", 1199, "13\"");
        System.out.println(iphone1);
        System.out.println(iphone2);

        iphone1.FaceTiming(123456);
        iphone1.calling(911);
        iphone1.texting(987456);

        System.out.println("===============================");

        Samsung samsung1 = new Samsung("Note10 Plus", 1200, "15\"");
        System.out.println(samsung1);
        samsung1.calling(416546516);
        samsung1.texting(15648656);
        samsung1.freezing();
    }
}
