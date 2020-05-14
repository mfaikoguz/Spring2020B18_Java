package Resources;

import day39_AccessModifiers.AccessModifiers;
import org.w3c.dom.ls.LSOutput;

public class AccessModifier_Test {
    public static void main(String[] args) {
        AccessModifiers obj = new AccessModifiers();
        System.out.println(obj.publicAccess); // accessible outside of the package
        // System.out.println(obj.defaultAccess); // not accessible outside of the package

    }
}
