package day19_Arrays;

public class Arrays_Practice1 {
    public static void main(String[] args) {
        String[] names = {"Harun", "Natallia", "Mustafa", "Ghayrat", "Onur"};
        System.out.println(names[3]);

        for (int i = 0; i <= 4; i++) {
            String name = names[i];
            System.out.println(name);
        }

        String[] emails = {"cybertek@yahoo.com", "cybertek@gmail.com", "cybertek@hotmail.com", "cybertek@outlook.com"};

        // print out all the users who registered with their gmail

        // max: 4

        for (int i = 0; i <= 3; i++) {
            String email = emails[i];
            if (email.endsWith("@gmail.com")){
                System.out.println(email);
            }
        }
    }
}
