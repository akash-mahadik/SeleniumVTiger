package Com.Crm.Pom;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Com.Crm.JavaUtility.JavaUtility1;


public class Contact_Date_Pom {
	
	
	 public Contact_Date_Pom(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
        
	}
	 
	 
	 
	 
	
	private @FindBy(xpath ="//img[@src='themes/softed/images/btnL3Add.gif']")
	WebElement plusbutton;
	
	private @FindBy (name = "lastname")
	WebElement lastname;
	
	private @FindBy(xpath = "//select[@name='industry']")
	WebElement industries;
	
	
	private @FindBy (xpath = "//input[@accesskey='S']")
	WebElement savebutton;
	
	private @FindBy(name = "support_start_date")
	WebElement start_date;
	
	private @FindBy(name="support_end_date")
	WebElement end_date;
	
	public void plus_button()
	{
     	plusbutton.click();
	}
	public void contact_name() 
	{
       String l_name=JavaUtility1.randomData("data1");
	  lastname.sendKeys(l_name);
	}
	
	public void industries()
	{
		Select s=new Select(industries);
		s.selectByValue("Banking");
	}
	
	public void start_date()
	{
       String s_date=JavaUtility1.startDate("currentDate");
		
		start_date.sendKeys(s_date);
	}
	
	public void end_date()
	{
       String e_date=JavaUtility1.endDate("afterDate");
		end_date.sendKeys(e_date);
	}
	
	
	public void save()
	{
		savebutton.click();
	}

}
