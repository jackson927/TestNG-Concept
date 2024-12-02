package testng;

import org.testng.annotations.Test;

public class skip 
{
  @Test(enabled=false)
  public void skips()
  {
	  System.out.println("I am learning TestNG concept");
  }
  @Test
  public void skipss()
  {
	  System.out.println("I am learning how to skip the test case in TestNG concept");
  }
}
