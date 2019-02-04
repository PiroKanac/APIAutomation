package test.api.automation;
import static com.jayway.restassured.RestAssured.*;

import org.testng.annotations.Test;

import com.jayway.restassured.http.ContentType;

public class TC_005_DELETE_DeleteData {

	@Test
	public void deleteData()
	{
		given()
		.contentType(ContentType.JSON)
		.when()
		.delete("http://localhost:3000/posts/4")
		.then()
		.statusCode(200);
	}
}
