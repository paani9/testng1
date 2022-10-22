import org.testng.Reporter;
import org.testng.annotations.Test;

public class Tg2 {
	@Test(priority=1)
	public void world()
	{
		Reporter.log("1",true);
		
	}

	@Test
	public void testcase2()
	{
		Reporter.log("2",true);
	}
}