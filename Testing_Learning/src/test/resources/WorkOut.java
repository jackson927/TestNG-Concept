package testng;

import java.util.InputMismatchException;
import java.util.Scanner;

import org.testng.annotations.Test;
public class WorkOut 
{
 
  @Test(invocationCount=2)
  public void f()
  {
	  System.out.println("I am learning TestNG concept in automation testing");
  }
  @Test(timeOut=3000)
  public void g()
  {
	  String name="Gowtham";
	  System.out.println(name);
  }
  @Test(expectedExceptions=InputMismatchException.class)
  public void z()
  {
	  Scanner scan=new Scanner(System.in);
	  System.out.println("Tell me ur number");
	  int num=scan.nextInt();
	  System.out.println("what is your number :"+num);
  }
}
