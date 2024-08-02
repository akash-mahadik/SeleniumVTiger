package TestCases;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Com.Crm.BaseClass.BaseClassVtiger;
import Com.Crm.Pom.HomePage_Pom;
import Com.Crm.Pom.Orgnization_Pom;
public class Create_Organization_Industry extends BaseClassVtiger {
	
	@Test
	public void orgIndu() throws IOException
	{
		HomePage_Pom ref=new HomePage_Pom(driver);
		ref.organizationLink();
		Orgnization_Pom ref2=new Orgnization_Pom(driver);
		ref2.plus_button();
		ref2.org_name();
		ref2.indDropDwon();
		ref2.save();
		assertTrue(ref2.getindutstrytext().getText().contains("Banking"));
	}

}
