package testCasePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pomPackage.LoginPage;

public class SimleTestNG
{
	public static void main(String[] args)
	{
		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver", "C:\\Software testing Application\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://www.facebook.com");
		
		
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
}
