package Practice;

import java.util.Scanner;

public class A_074_SMSmessage_String_Methods {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String message = scan.nextLine();
        String sender;
        String phoneNumber;
        String messageBody;

        sender = message.substring(message.indexOf("") + 1, message.indexOf(""));
        phoneNumber = message.substring(message.indexOf("[") + 1, message.indexOf("]"));
        messageBody = message.substring(message.indexOf("{") + 1, message.length() - 1);
        System.out.println("Sender: " + sender);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Message body: " + messageBody);

    }
}
