package SliderDemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SliderActions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.globalsqa.com/demo-site/sliders/#Range");
		driver.manage().window().maximize();
		
		Actions act=new Actions(driver);
		
		driver.findElement(By.id("Range")).click();
		
		// minimum slider
		
		WebElement iframe = driver.findElement(By.xpath("//div[@class='single_tab_div resp-tab-content resp-tab-content-active']//iframe[@class='demo-frame lazyloaded']"));
		driver.switchTo().frame(iframe);

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement min_slider = wait.until(ExpectedConditions.visibilityOfElementLocated(
		        By.xpath("(//span[contains(@class,'ui-slider-handle')])[1]")));

		System.out.println("Location of the min slider before moving: " + min_slider.getLocation()); // (101, 47)
		
		act.dragAndDropBy(min_slider, 200, 47).perform();
		System.out.println("Location of the min slider after moving:"+min_slider.getLocation());
		
		// maximum slider
		WebElement max_slider=driver.findElement(By.xpath("//span[2]"));
		System.out.println("Default Location of the max slider:"+max_slider.getLocation());
		act.dragAndDropBy(max_slider, -49, 47).perform();
		System.out.println("Location of the max slider after moving:"+max_slider.getLocation());
		
 

	}

}
