package day25_MethodsRecap;

import java.util.Scanner;

public class Warmup1 {
    /*
    1. write a return method named getDriver1 that accepts a string parameter called Browser
				if the browser name matches with {"chrome", "firefox", "id", "safari", "edge", "Opera"}, then it returns the name of that specific browser' driver
					Ex: getDriver("chrome");  ==> "Chrome Driver"
						getDriver("fireFOX"); ==> "FireFox Driver"
							....
				if the browser name does not match with any of browsers above, the method should return "Invalid"
				APPLY SWITCH STATEMENTS
    */

    public static String getDriver1(String browser) {
        String result = "";
        switch (browser.toLowerCase()) {
            case "chrome":
                result = "Chrome Driver";
                break;
            case "firefox":
                result = "Firefox Driver";
                break;
            case "internet explorer":
                result = "Internet Explorer Driver";
                break;
            case "safari":
                result = "Safari Driver";
                break;
            case "edge":
                result = "Edge Driver";
                break;
            case "opera":
                result = "Opera Driver";
                break;
            default:
                System.out.println("Invalid");
        }
        return result;
    }

    public static void main(String[] args) {
        String str = getDriver1("chrome");
        System.out.println(str);
    }
}
