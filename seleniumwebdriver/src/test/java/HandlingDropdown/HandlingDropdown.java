package HandlingDropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		WebElement drpCountryEle=driver.findElement(By.xpath("//select[@id='country']"));
		Select drpCountry=new Select(drpCountryEle);
		
		// select option from the drop down
		
//		drpCountry.selectByVisibleText("Brazil");
//		drpCountry.selectByValue("canada");
//		drpCountry.selectByIndex(2);
		
		// Capture the options from the dropdown
		
		List<WebElement>options=drpCountry.getOptions();
		System.out.println("Number of options in a drop down:"+options.size());
		
		// printing the options
		
		for(WebElement op:options) {
			System.out.println(op.getText());
		}
		 

   	}

}
