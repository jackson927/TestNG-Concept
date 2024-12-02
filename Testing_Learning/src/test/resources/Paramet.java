package testng;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Paramet 
{
  @FindBy(name="txt_unam")
  public static WebElement connect;
  @FindBy(name="txt_pass")
  public static WebElement include;
  @FindBy(name="Button3")
  public static WebElement add;
}
