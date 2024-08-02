package Com.Crm.Pom;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.Crm.JavaUtility.JavaUtility1;

public class Login_Pom {
	
	public  Login_Pom(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
		
	
	
	private @FindBy(css = "input[name='user_name']")
	WebElement userName;
	private @FindBy(css = "input[name='user_password']")
	WebElement password;
	
	private @FindBy(id = "submitButton")
	WebElement loginButton;
	
	private @FindBy(xpath = "//img[@src='themes/softed/images/user.PNG']")
	WebElement click1;
	
	private@FindBy (xpath = "//a[text()='Sign Out']")
	WebElement click2;
	
	public void userName() throws IOException
	{
		String name=JavaUtility1.credentials("username");
		userName.sendKeys(name);
	}
	public void password() throws IOException
	{
		String pass=JavaUtility1.credentials("password");
		password.sendKeys(pass);
	}
	public void loginButton()
	{
		loginButton.click();
	}
	public void click1()
	{
		click1.click();
	}
	public void click2()
	{
		click2.click();
	}

}
