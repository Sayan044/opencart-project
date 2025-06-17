package ActionMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickAction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		//switch to frame
//		driver.switchTo().frame("iframeResult");
		
		WebElement box1=driver.findElement(By.xpath("//input[@id='field1']"));
		WebElement box2=driver.findElement(By.xpath("//input[@id='field2']"));
		WebElement button=driver.findElement(By.xpath("//button[normalize-space()='Copy Text']"));
		
		box1.clear();
		box1.sendKeys("SELENIUM");
		
		// Double Click
		
		Actions act=new Actions(driver);
		
		act.doubleClick(button).perform();
		
		// validation : box2 should contains "WELCOME"
		
		String text=box2.getText();
		
		if(text.equals("SELENIUM")) {
			System.out.println("Text Copied....");
		}
		
		else {
			System.out.println("Text Not copied properly");
		}
		
		

	}

}
