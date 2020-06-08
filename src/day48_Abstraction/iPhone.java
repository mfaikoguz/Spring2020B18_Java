package day48_Abstraction;

public class iPhone extends Phone {

    static {
        brand = "iPhone";
    }

    public iPhone(String model, double price, String size) {
        this.model = model;
        this.price = price;
        this.size = size;
    }

    public void FaceTiming(long phoneNumber) {
        System.out.println("Iphone is facetiming with " + phoneNumber);
    }

    @Override
    public void calling(long phoneNumber) {
        System.out.println("Iphone is calling with " + phoneNumber);
    }

    @Override
    public void texting(long phoneNumber) {
        System.out.println("Iphone is texting with " + phoneNumber);
    }
}