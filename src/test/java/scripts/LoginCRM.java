package scripts;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;

public class LoginCRM {
	WebDriver driver;
	@Test
  
  public void f() {
	driver.findElement(By.id("btnlogin")).click();
	driver.findElement(By.id("txtuname")).sendKeys("techcanvassacademy@techcanvass.co.in");;
	driver.findElement(By.id("txtpwd")).sendKeys("abhishek1234");
	WebElement drop= driver.findElement(By.id("ddlloginuser"));
	//Select s=new Select(drop);
	//s.selectByIndex(1);
	driver.findElement(By.id("loginbtn")).click();
	System.out.println("Added");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
	   driver=new ChromeDriver();
	   driver.get("http://crm.techcanvass.co.in/");
	   driver.manage().window().maximize();
  }

  @AfterMethod
  public void afterMethod() {
  }

}
