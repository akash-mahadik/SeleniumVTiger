package Com.Crm.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage_Pom {
	
	public HomePage_Pom(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	private @FindBy(linkText = "Calendar")
	WebElement calLink;
	private @FindBy(linkText = "Leads")
	WebElement leadLink;
	private @FindBy(linkText = "Organizations")
	WebElement organLink;
	private @FindBy(linkText = "Contacts")
	WebElement contLink;
	private @FindBy(linkText = "Opportunities")
	WebElement opporLink;
	private @FindBy(linkText = "Products")
	WebElement prod;
	private @FindBy(linkText = "Documents")
	WebElement doc;
	private @FindBy(linkText = "Email")
	WebElement email;
	private @FindBy(linkText = "Trouble Tickets")
	WebElement troubkeTickets;
	private @FindBy(linkText = "Dashboard")
	WebElement dashboard;
	private @FindBy(linkText = "More")
	WebElement more;
	
	public void calendarLink()
	{
		calLink.click();
	}
	public void leadLink()
	{
		leadLink.click();
	}
	public void organizationLink()
	{
		organLink.click();
	}
	public void contactLink()
	{
		contLink.click();
	}
	public void opportunitiesLink()
	{
		opporLink.click();
	}
	public void productLink()
	{
		prod.click();
	}
	public void emailLink()
	{
		email.click();
	}
	public void troubleTicketLink()
	{
		troubkeTickets.click();
	}
	public void DashboardLink()
	{
		dashboard.click();
	}
	public void MoreLink()
	{
		more.click();
	}

}
