package testng;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
public class Assertion 
{	
  WebDriver d;
  @Test
  public void HardAssertion() 
  {
	  //HARD ASSERTION LA IN BETWEEN LA EXCEPTION VANDHA PROGRAM STOP AGIDUM FURTHER PROGRAM RUN AGADHU
	  d=new ChromeDriver();
	  d.get("https://www.google.com");	 
	  String actual_result=d.getTitle();
	  String excepted_result="Google";
	  Assert.assertEquals(actual_result,excepted_result,"letter is mismatched");
	  System.out.println("It was matched"); 
  }
  @Test
  public void SoftAssertion()
  {
	  //SOFT ASSERTION LA IN BETWEEN LA EXCEPTION VANDHALUM AFTER THE PROGRAM COMPLETION APRM DHAN EXCEPTION SHOW AGUM
	  d=new ChromeDriver();
	  d.get("https://www.facebook.com/login/");
	  String title=d.getTitle();
	  String except="facebook";
	  SoftAssert s=new SoftAssert();
	  s.assertEquals(title,except,"mismatch exception");
	  System.out.println("It is matched...!!!");
  }
}
