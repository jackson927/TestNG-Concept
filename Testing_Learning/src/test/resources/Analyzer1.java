package testng;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Analyzer1 
{
//    @Test(retryAnalyzer = Analyzer.class)
//    public void f()
//  {
//	  WebDriver d=new ChromeDriver();
//	  d.get("https://www.leafground.com/alert.xhtml");
//	  d.findElement(By.xpath("//*[@id=\'j_idt88:j_idt91\']/span[2]")).click();
//	  Alert a=d.switchTo().alert();
//	  //a.accept();
//  }
	@Test(retryAnalyzer = Analyzer.class)
	public void RetryAnalyzer()
	{
		WebDriver d=new ChromeDriver();
		d.get("https://www.google.co.in/");
		String title=d.getTitle();
		String exp="google";
		Assert.assertEquals(title,exp);
		d.quit();
		
	}
}
