package HandleAlert;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAuthenticatedAlert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		
		// Syntax --->
		// https://username:password@the-internet.herokuapp.com/basic-auth
		
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		
		

	}

}
