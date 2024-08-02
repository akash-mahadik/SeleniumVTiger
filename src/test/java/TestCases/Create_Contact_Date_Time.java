package TestCases;

import org.testng.annotations.Test;

import Com.Crm.BaseClass.BaseClassVtiger;
import Com.Crm.Pom.Contact_Date_Pom;
import Com.Crm.Pom.HomePage_Pom;


public class Create_Contact_Date_Time extends BaseClassVtiger{
	
	@Test
	public void contact()
	{
		HomePage_Pom ref1=new HomePage_Pom(driver);
		ref1.contactLink();
		
		Contact_Date_Pom ref2=new Contact_Date_Pom(driver);
		ref2.plus_button();
		ref2.contact_name();
		ref2.start_date();
		ref2.end_date();
		ref2.save();
	}
	
	
	

}
