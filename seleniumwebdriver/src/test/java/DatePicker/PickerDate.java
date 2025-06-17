package DatePicker;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PickerDate {
	
	static void selectFuturedate(WebDriver driver,String month, String year,String date) {
		while (true) {
		    String currentMonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
		    String currentYear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
 		    
		    if (currentMonth.equals(month) && currentYear.equals(year)) {
		        break;
		    } 
		    
		    driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click(); // correct next button
//		    driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();
		}
	
	
		List<WebElement> allDates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td//a"));
		for(WebElement dt:allDates) {
			if(dt.getText().equals(date)) {
				dt.click();
				break;
			}

		} 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();
		
		// switching frame
		driver.switchTo().frame(0);
		
		//Method1: using sendKeys()
//		driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("04/05/2024");
		
		//Method2: using day picker
		String year="2026";
		String month="April";
		String date="20";
		 
		driver.findElement(By.xpath("//input[@id='datepicker']")).click(); // opens date picker
		
		selectFuturedate(driver,month,year,date);
		
		
		

		
		
	}

}
