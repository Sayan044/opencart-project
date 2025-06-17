package HandleAlert;



import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAlerts {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.manage().window().maximize();
//
//        // Normal alert with OK button
//        driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
//        Thread.sleep(5000);
//
//        Alert myalert = driver.switchTo().alert();
//        System.out.println(myalert.getText());
//        myalert.accept();
    	
    	// 2) Confirmation alert- OK and Cancel
//    	driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click();
//    	Thread.sleep(5000);
//    	
//    	driver.switchTo().alert().accept();
//    	driver.switchTo().alert().dismiss();
        
       // 3) Prompt alert-input box
        driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
        Thread.sleep(5000);
        
        Alert myalert=driver.switchTo().alert();
        
        myalert.sendKeys("Welcome");
        myalert.accept();
        
    }	
    
}
