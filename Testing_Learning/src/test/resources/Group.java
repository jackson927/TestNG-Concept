package testng;

import org.testng.annotations.Test;

public class Group 
{
  @Test(groups="Functional Testing")
  public void RegressionTest()
  {
	  System.out.println("When we adding new functionality in the software application,it does not effect existing functionality is called as regression testing");
  }
  @Test(groups="Functional Testing")
  public void Retesting()
  {
	  System.out.println("We receiving bug after it got fixed by the developer team,in that we testing that particular functionality is called as retesting");
  }
  @Test(groups="Dynamic Testing")
  public void BlackBoxTesting()
  {
	  System.out.println("Black box testing is also called as functional testing");
  }
  @Test(groups="Dynamic Testing")
  public void WhiteBoxTesting()
  {
	  System.out.println("White box testing is also called as structural testing");
  }
}
