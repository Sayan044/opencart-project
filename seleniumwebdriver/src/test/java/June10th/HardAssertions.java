package June10th;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertions {
	@Test
	void test()
	{
//		Assert.assertEquals("xyz", "xyz"); // passed
//		
//		Assert.assertNotEquals("xyz", "xyz"); // failed
//		
		Assert.assertTrue(true);
		Assert.assertTrue(false);
	}

}
