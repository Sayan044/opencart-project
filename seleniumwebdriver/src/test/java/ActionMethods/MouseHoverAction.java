package ActionMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverAction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement pointMe=driver.findElement(By.xpath("//button[normalize-space()='Point Me']"));
		WebElement mobiles=driver.findElement(By.xpath("//a[normalize-space()='Mobiles']"));
		
		Actions act=new Actions(driver);
		
		// mouse hover
		act.moveToElement(pointMe).moveToElement(mobiles).click().build().perform();
		 

	}

}
