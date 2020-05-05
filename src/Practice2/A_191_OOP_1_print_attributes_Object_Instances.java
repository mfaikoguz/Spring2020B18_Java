package Practice2;

public class A_191_OOP_1_print_attributes_Object_Instances {
    public static void main(String[] args) {

        Atts a = new Atts();
        a.name = "ball";
        a.color = "red";
        a.amount = 1;


        System.out.println(a.asString());
    }
}
