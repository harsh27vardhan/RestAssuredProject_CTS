package testScripts;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import genericLib.DataUtilities;
import static io.restassured.RestAssured.*;


public class BaseClass {
	public DataUtilities du = new DataUtilities();
	@BeforeMethod
	public void setUp() {
		baseURI = "https://api.github.com";
	}
	
	@AfterMethod
	public void tearDown() {
		Reporter.log("CRUD operation is successfull");
	}
}
