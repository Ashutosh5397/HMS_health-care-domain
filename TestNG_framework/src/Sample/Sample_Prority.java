package Sample;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Sample_Prority {
	@Test(priority =  2, invocationCount = 5)
	void mo()
	{
		Reporter.log("mm",true);
	}

}
