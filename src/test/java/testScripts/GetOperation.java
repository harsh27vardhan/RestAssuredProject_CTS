package testScripts;

import org.testng.annotations.Test;

import genericLib.AutoConstant;

import static io.restassured.RestAssured.*;

import java.io.FileNotFoundException;
import java.io.IOException;

/*
 * This script gets the data of the "repository" used in property file
 */

public class GetOperation extends BaseClass{
	@Test
	public void getOper() throws FileNotFoundException, IOException {
		given()
		.pathParam("owner", du.readData("owner"))
		.pathParam("repo", du.readData("repository"))
		
		.when()
		.get(AutoConstant.getOperation)
		
		.then()
		.log().all();
	}
}
