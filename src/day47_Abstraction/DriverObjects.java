package day47_Abstraction;

public class DriverObjects {
    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        driver.quit();

        FirefoxDriver driver2 = new FirefoxDriver();
        driver2.get("https://www.youtube.com");
        driver2.quit();

        OperaDriver driver3 = new OperaDriver();
        driver3.get("https://www.facebook.com");
        driver3.quit();
    }
}
