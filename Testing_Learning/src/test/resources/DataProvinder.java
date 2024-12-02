package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvinder
{
	 WebDriver d;
	 WebElement username,password;
	 String [][] id= {{"gowtham","bose"},{"gautam","powerranger"},{"sylix","admin"}};
  @DataProvider(name="Login_Page")
  public String[][] f() 
  {
	  return id;	  
  }
  @Test(dataProvider="Login_Page")
  public void test(String username,String password)
  {
	  d=new ChromeDriver();
	  d.get("http://brm.tremplintech.in/web_pages/login.aspx"); 
	  d.findElement(By.id("txt_unam")).sendKeys(username);
	  d.findElement(By.name("txt_pass")).sendKeys(password);
	  d.findElement(By.id("Button3")).click();
	  d.quit();
  }
}
