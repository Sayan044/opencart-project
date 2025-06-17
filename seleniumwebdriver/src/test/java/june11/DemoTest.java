package june11;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@Listeners(june11.MyListener.class)
public class DemoTest {

	@Test
	public void testGoogleTitle() {
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://www.google.com");
	    
	    String title = driver.getTitle();
	    System.out.println("Page title is: " + title); // Debug line
	    
	    Assert.assertEquals(title, "Google"); // This should pass
	    driver.quit();
	}


    @Test
    public void testFailCase() {
        Assert.fail("This test is supposed to fail"); // Should trigger onTestFailure
    }
}
