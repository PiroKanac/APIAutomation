package test.api.automation;
import static com.jayway.restassured.RestAssured.*;
import org.testng.annotations.Test;

import com.jayway.restassured.http.ContentType;

import test.automation.common.CreatePost;

public class TC_004_PATCH_UpdateResource {
	
	//********************PATCH METHOD******************************
	// PATCH is used to update data on server, here you can update only one getter data
	@Test
	public void updateData()
	{
		CreatePost cpost = new CreatePost();
		cpost.setAuthor("Update Author Name with patching");
		
		given()
		.contentType(ContentType.JSON)
		.body(cpost)
		.when()
		.patch("http://localhost:3000/posts/2")
		.then()
		.statusCode(200);
	}

}
