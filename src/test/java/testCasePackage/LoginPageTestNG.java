package testCasePackage;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pomPackage.LoginPage;

public class LoginPageTestNG {
	WebDriver driver ;
	
	 @BeforeClass
	  public void beforeClass() 
	 {
		 	System.setProperty("webdriver.chrome.driver", "C:\\Software testing Application\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.navigate().to("https://www.facebook.com");
		
	  }

	 @BeforeMethod
	  public void beforeMethod() 
	 {
		driver.manage().window().maximize(); 
	 }
	 
  @Test(priority=0)
  public void loginPage()
  {
	  LoginPage login = new LoginPage(driver);
	 
	  login.clickcreateButton();
	  login.sendfirstname();
	  login.sendlastname();
	  login.sendemailAddress();
	  login.sendpassWord();
	  login.selectday();
	  login.selectmonth();
	  login.selectyear();
	  login.clickmaleButton();
  }
 
 
   @AfterMethod
  public void afterMethod() 
  {
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));  
	 driver.navigate().back();
  }
   
    
  @AfterClass
  public void afterClass() {
	 System.out.println("afterClass");
  }

 

 
}
