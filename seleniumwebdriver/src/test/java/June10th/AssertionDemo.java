package June10th;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionDemo {
	@Test
	void testTitle() {
		String exp_title="opencart";
		String act_title="Openshop";
		
		Assert.assertEquals(exp_title, act_title);
		
	}

}
