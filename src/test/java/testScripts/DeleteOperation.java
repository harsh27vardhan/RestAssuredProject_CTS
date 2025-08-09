package testScripts;

import org.junit.Test;

import genericLib.AutoConstant;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

import java.io.FileNotFoundException;
import java.io.IOException;

public class DeleteOperation extends BaseClass {
	@Test
	public void deleteOper() throws FileNotFoundException, IOException {
		given()
		.auth()
		.oauth2(du.readData("gitToken"))
		.pathParam("owner", du.readData("owner"))
		.pathParam("repo", du.readData("repository"))
		
		.when()
		.delete(AutoConstant.deleteOperation)
		
		.then()
		.log().all();
	}
}
