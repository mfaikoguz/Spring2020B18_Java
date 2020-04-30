package day29_Wrapper_ArrayList;

import java.util.ArrayList;

public class List_Practice {
    public static void main(String[] args) {
        ArrayList<String> shoppingList = new ArrayList<>();
        shoppingList.add("Milk"); // size: 1
        shoppingList.add("Coffee"); // size: 2
        shoppingList.add("Bread"); // size: 3
        shoppingList.add("Toilet Paper"); // size: 4


        System.out.println(shoppingList);

        for (int i = 0; i < shoppingList.size(); i++) {
            System.out.println(shoppingList.get(i));
        }
    }
}
