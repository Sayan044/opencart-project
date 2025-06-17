package WebDriverMethods;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class WebDriverMethods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Thread.sleep(5000);
		
		System.out.println(driver.getTitle());
		
		System.out.println(driver.getCurrentUrl());
		
		System.out.println(driver.getPageSource());
		
		
//		String windowid=driver.getWindowHandle();
//		System.out.println("Window ID:"+windowid);
		
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		
		Set<String> windowids=driver.getWindowHandles();
		System.out.println(windowids);
		
		
		
		

	}

}
