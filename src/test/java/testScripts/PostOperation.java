package testScripts;

import org.testng.annotations.Test;

import genericLib.AutoConstant;
import genericLib.PojoClass;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

import java.io.FileNotFoundException;
import java.io.IOException;

/*
 * This script creates a new repository.
 */

public class PostOperation extends BaseClass {
	@Test
	public void postOper() throws FileNotFoundException, IOException {
		
		PojoClass pobj = new PojoClass("New Repo", "It's the new repo from the Rest Assured using Pojo Class.");
		
		given()
		.auth()
		.oauth2(du.readData("gitToken"))
		.contentType(ContentType.JSON)
		.body(pobj)
		
		.when()
		.post(AutoConstant.postOperation)
		
		.then()
		.log().all();
	}
}
