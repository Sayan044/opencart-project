package HandleCheckBoxes;

import java.util.Arrays;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RandomCheckboxes {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();

        
        List<String> daysToSelect = Arrays.asList("monday", "wednesday", "saturday");

        
        for (String day : daysToSelect) {
            driver.findElement(By.xpath("//input[@id='" + day.toLowerCase() + "']")).click();
            Thread.sleep(3000);
        }

        
    }
}
