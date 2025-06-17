package DatePicker;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DataPicker1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		// input DOB
		String requiredYear = "2021";
		String requiredMonth = "June";
		String requiredDate = "15";
		
		driver.findElement(By.xpath("//span[@class='icon_calendar']")).click();
		
			

	}

}
