package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpom {

	@FindBy(id="email")
	private WebElement username;
	@FindBy(id="pass")
	private WebElement password;
	@FindBy(name="login")
	private WebElement logbtn;
	public Loginpom(WebDriver driver)
	{PageFactory.initElements(driver,this);
}
public void setUsername(String un)
{username.sendKeys(un);
}
public void setPassword(String pwd)
{username.sendKeys(pwd);
}
public void clickLogin()
{logbtn.click();
}







}