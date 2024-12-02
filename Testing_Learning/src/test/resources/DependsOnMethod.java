package testng;
import org.testng.annotations.Test;

public class DependsOnMethod 
{
  @Test
  public void f() 
  {
	  System.out.println("I am learning depends on the method in TestNG selenium");
  }
  @Test(dependsOnMethods="f")
  public void d()
  {
	  System.out.println("TestNG is a interesting concept in automation testing");
  }  
}
