import org.testng.Reporter;
import org.testng.annotations.Test;

public class Tg3 {
@Test
public void testcase1()
	{
	Reporter.log("1",true);
}
@Test(invocationCount=3,priority=1)
public void testcase2()
{
	Reporter.log("2",true);
}
}
