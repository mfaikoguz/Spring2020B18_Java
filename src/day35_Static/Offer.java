package day35_Static;

public class Offer {
    String location;
    String company;
    long salary;
    boolean isFullTime;

    public void setOfferInfo(String location, String company, long salary, boolean isFullTime) {
        this.location = location;
        this.company = company;
        this.salary = salary;
        this.isFullTime = isFullTime;
    }

    public String toString() {
        return "Location: " + location + ", Company: " + company + ", Salary: " + salary +
                ", Full time?(true = yes, false = no): " + isFullTime;
    }
}
