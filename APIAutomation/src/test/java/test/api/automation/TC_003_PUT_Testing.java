package test.api.automation;
import static com.jayway.restassured.RestAssured.*;

import org.testng.annotations.Test;

import com.jayway.restassured.http.ContentType;

import test.automation.common.CreatePost;

public class TC_003_PUT_Testing {
	
	//********************PUT METHOD******************************
	// PUT is used to update data on server, but you cannot update only one getter data, you must update all
	@Test
	public void updateResource()
	{
		//int i = 4;     
		//Can use i and replace value with i in 18 and 25 and  after that just change i when you want to change something
		CreatePost cpost = new CreatePost();
		cpost.setId(4);
		cpost.setTitle("Spiderman");
		cpost.setAuthor("Updated Author Name");
		
		given()
		.contentType(ContentType.JSON)
		.body(cpost)
		.put("http://localhost:3000/posts/4")
		.then()
		.statusCode(200);
	}
}
