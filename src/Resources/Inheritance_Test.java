package Resources;

import day42_Inheritance.AccessModifiers;

public class Inheritance_Test extends AccessModifiers {
    //              sub                     super

    /*
    publicVariable
    protectedVariable
    publicMethod()
    protectedMethod()
     */
    public static void main(String[] args) {
        System.out.println(Inheritance_Test.publicVariable);
        System.out.println(Inheritance_Test.protectedVariable);

        Inheritance_Test.publicMethod();
        Inheritance_Test.protectedMethod();

    }
}
