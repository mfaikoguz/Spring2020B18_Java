package Practice2;

import java.util.ArrayList;
import java.util.Arrays;

public class MyOffers {
    public static void main(String[] args) {

        Offer offer1 = new Offer();
        offer1.setOfferInfo("Austin", "Dell", 105000, true);

        Offer offer2 = new Offer();
        offer2.setOfferInfo("Houston", "Apple", 120000, true);

        Offer offer3 = new Offer();
        offer3.setOfferInfo("Boston", "Capital One", 60000, false);

        Offer offer4 = new Offer();
        offer4.setOfferInfo("Austin", "Microsoft", 70000, false);

        Offer offer5 = new Offer();
        offer5.setOfferInfo("Los Angeles", "SpaceX", 150000, true);


        ArrayList<Offer> offers = new ArrayList<>();
        offers.addAll(Arrays.asList(offer1, offer2, offer3, offer4, offer5));

        for (int i = 0; i < offers.size(); i++) {
            Offer eachOffer = offers.get(i);
            System.out.println(eachOffer);
        }

        System.out.println("=================================================");

        offers.removeIf(o -> o.isFullTime = false);
        offers.removeIf(o -> !o.location.equalsIgnoreCase("Austin"));
        offers.removeIf(o -> o.salary < 100000);

        for (int i = 0; i < offers.size(); i++) {
            Offer eachOffer = offers.get(i);
            System.out.println(eachOffer);
        }

    }
}