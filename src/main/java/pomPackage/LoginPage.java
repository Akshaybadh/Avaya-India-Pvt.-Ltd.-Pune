package pomPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage 
{
	WebDriver driver;
	
	
	@FindBy (xpath="//input[@id='email']")
	private WebElement emailAddress;
	
	@FindBy (xpath="//input[@id='pass']")
	private WebElement passWord;
	
	@FindBy (xpath="//button[text()='Log In']")
	private WebElement loginButton;
	
	@FindBy (xpath="//a[text()=\"Create New Account\"]")
	private WebElement createButton;
	
	@FindBy (xpath="//input[@id=\"u_2_b_Z4\"]")
	private WebElement firstname;
	
	@FindBy (xpath="//input[@name='lastname']")
	private WebElement lastname;
	
	@FindBy (xpath="//input[@name='reg_email__']")
	private WebElement createemail;
	
	@FindBy (xpath="//input[@name='reg_passwd__']")
	private WebElement createpass;
	
	@FindBy (xpath="//select[@id='day']")
	private WebElement day;
	
	@FindBy (xpath="//select[@id='month']")
	private WebElement month;
	
	@FindBy (xpath="//select[@id='year']")
	private WebElement year;
	
	@FindBy (xpath="(//label[@class='_58mt'])[2]")
	private WebElement maleButton;
	
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void sendemailAddress()
	{
		emailAddress.sendKeys("badhe.a123@gmail.com");
	}
	
	public void sendpassWord()
	{
		passWord.sendKeys("akshay");
	}
	
	public void clickloginButton()
	{
		loginButton.click();
	}
	
	public void clickcreateButton()
	{
		createButton.click();
	}
	
	public void sendfirstname()
	{
		firstname.sendKeys("Dinesh");
	}
	
	public void sendlastname()
	{	
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id=\\\"u_2_b_Z4\\\"]")));
		lastname.sendKeys("Patil");
	}
	
	public void sendcreateemail()
	{
		emailAddress.sendKeys("dinesh.d123@gmail.com");
	}
	public void sendcreatepass()
	{
		passWord.sendKeys("dinesh");
	}
	
	public void selectday()
	{
		Select s = new Select(day);
		s.selectByIndex(14);
	}
	public void selectmonth()
	{
		Select s = new Select(month);
		s.selectByIndex(14);
	}
	public void selectyear()
	{
		Select s = new Select(year);
		s.selectByIndex(14);
	}
	
	public void clickmaleButton()
	{
		maleButton.click();
	}

	
	
	
	
	
	
}
