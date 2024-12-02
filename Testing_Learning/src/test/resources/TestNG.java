package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestNG
{
	WebDriver driver;
	@Test
	public void google()
	{
		driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");		
	}
	@Test
	public void facebook()
	{
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login.php");		
	}
	@Test
	public void amazon()
	{	
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/-/hi/ap/signin?openid.pape.max_auth_age=3600&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fspr%2Freturns%2Fgift&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=amzn_psr_desktop_in&openid.mode=checkid_setup&language=en_IN&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");	
	}
	@Test
	public void leafground()
	{		
		driver=new ChromeDriver();
		driver.get("https://www.leafground.com/radio.xhtml");
		PageFactory.initElements(driver, NewTest.class);
		NewTest.key.click();		
	}

}
