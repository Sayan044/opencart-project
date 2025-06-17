package NextActions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessTesting {

    public static void main(String[] args) throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless=new");

        WebDriver driver = new ChromeDriver(options);
        driver.get("https://demo.nopcommerce.com/");
        
        Thread.sleep(2000);  // Wait for page to load (in headless)

        String act_title = driver.getTitle();
        System.out.println("Actual Title: " + act_title);

        if (act_title.equals("nopCommerce demo store. Home page")) {
            System.out.println("Test Passed");
        } else {
            System.out.println("Test Failed");
        }

        driver.quit();
    }
}
