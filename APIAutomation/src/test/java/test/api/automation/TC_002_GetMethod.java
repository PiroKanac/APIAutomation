package test.api.automation;

import org.testng.annotations.Test;
import static com.jayway.restassured.RestAssured.*;
import com.jayway.restassured.http.ContentType;

import test.automation.common.CreatePost;

public class TC_002_GetMethod {
	
	//******Use object from CreatePost class******
	
	@Test
	public void tc_002_getMethod_validation() 
	{
		CreatePost cpost = new CreatePost();
		cpost.setId(6);
		cpost.setTitle("ABCD");
		cpost.setAuthor("Author 1");
		
		given()
		.contentType(ContentType.JSON)
		.body(cpost)
		.when()
		.post("http://localhost:3000/posts")
		.then()
		.contentType(ContentType.JSON)
		.statusCode(201);
	}

}
