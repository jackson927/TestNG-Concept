package testng;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
@Listeners(Listioner.class)
public class Parameters2 
{
	WebDriver driver;
	@BeforeSuite
	public void create()
	{
		driver=new ChromeDriver();
		driver.get("http://brm.tremplintech.in/web_pages/ord_reg.aspx");		
	}
	@AfterSuite
	public void quit()
	{
		driver.quit();
	}
	@Test(priority=1)
	@Parameters({"username","password"})
	public void invalid(String un,String pwd) 
	{	  
		PageFactory.initElements(driver,Paramet.class);
		Paramet.connect.sendKeys("gowtham");
		Paramet.include.sendKeys("admin123");
		Paramet.add.click();  
		Alert a=driver.switchTo().alert();
		a.accept();
	}
	@Test(priority=2)
	@Parameters({"user","pass"})
	public void valid(String un,String pwd) 
	{
		PageFactory.initElements(driver, Paramet.class);
		Paramet.connect.sendKeys("sylix");	
		Paramet.include.sendKeys("admin");
		Paramet.add.click();		  
	}
}
