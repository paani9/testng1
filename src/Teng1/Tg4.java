package Teng1;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Tg4 {
	@Test(enabled=false)
	public void testcase1()
	{
		Reporter.log("1",true);
	}
	@Test
	public void testcase2()
	{
		Reporter.log("2",true);
	}

}
