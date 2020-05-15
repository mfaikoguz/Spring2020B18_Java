package day40_Encapsulation;

public class CredentialsObject {
    public static void main(String[] args) {
        Credentials facebook = new Credentials();

        facebook.setUserName("faikoguz");
        facebook.setPassword("1564868486");

        System.out.println(facebook.getUserName());
        System.out.println(facebook.getPassword());
    }

}
