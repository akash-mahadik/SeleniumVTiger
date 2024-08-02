package Com.Crm.Pom;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Com.Crm.JavaUtility.JavaUtility1;



public class Orgnization_Pom {
	
	public Orgnization_Pom(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	private @FindBy(xpath ="//img[@src='themes/softed/images/btnL3Add.gif']")
	WebElement plusbutton;
	
	private @FindBy (name = "accountname")
	WebElement orgname;
	
	
	private @FindBy (xpath = "//input[@accesskey='S']")
	WebElement savebutton;
	
	private@FindBy (className = "dvHeaderText")
	WebElement header;
	
	private @FindBy(name = "industry")
	WebElement industry;
	
	
	public void plus_button()
	{
     	plusbutton.click();
	}
	public void org_name() throws IOException 
	{
	  String name = JavaUtility1.randomData("data1");
	  orgname.sendKeys(name);
	}
	
	public void save()
	{
		savebutton.click();
	}
	
	public void indDropDwon()
	{
		Select s=new Select(industry);
		s.selectByValue("Banking");
	}
	public WebElement headerText()
	{
		return header;
	}
	public WebElement getindutstrytext()
	{
		return industry;
	}
		

}
