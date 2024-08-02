package TestCases;


import static org.testng.Assert.assertTrue;


import java.io.IOException;

import org.testng.annotations.Test;

import Com.Crm.BaseClass.BaseClassVtiger;
import Com.Crm.Pom.HomePage_Pom;
import Com.Crm.Pom.Orgnization_Pom;
public class CreateOrgnization extends BaseClassVtiger{
	
	
	@Test
	public void orgnization() throws IOException, InterruptedException
	{
		HomePage_Pom ref1=new HomePage_Pom(driver);
		ref1.organizationLink();
		Orgnization_Pom ref2=new Orgnization_Pom(driver);
		ref2.plus_button();
		ref2.org_name();
		ref2.save();
		Thread.sleep(2000);
		
		assertTrue(ref2.headerText().getText().contains("ShriLaptops"));
	}

}
