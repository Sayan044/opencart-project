package JSExecuter;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZoominZoomout {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/");
		
		
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		 
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		js.executeScript("document.body.style.zoom='50%'"); // set zoom level 50%
		
		Thread.sleep(5000);
		
		js.executeScript("document.body.style.zoom='80%'");
		
		Thread.sleep(5000);

	}

}
