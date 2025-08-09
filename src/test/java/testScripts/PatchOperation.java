package testScripts;

import org.testng.annotations.Test;

import genericLib.AutoConstant;
import genericLib.PojoClass;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

import java.io.FileNotFoundException;
import java.io.IOException;

/*
 * This script updates the data of the "repository" used in property file
 */

public class PatchOperation extends BaseClass {
	@Test
	public void patchOper() throws FileNotFoundException, IOException {

		PojoClass pobj = new PojoClass(du.readData("repository"), "A description created from the Rest Assured framework through Eclipse via github api using Pojo Class.");
		
		given()
		.pathParam("owner", du.readData("owner"))
		.pathParam("repo", du.readData("repository"))
		.auth()
		.oauth2(du.readData("gitToken"))
		.contentType(ContentType.JSON)
		.body(pobj)
		
		.when()
		.patch(AutoConstant.patchOperation)
		
		.then()
		.log().all();
	}
}
