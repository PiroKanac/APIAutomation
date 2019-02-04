package test.api.automation;

import static com.jayway.restassured.RestAssured.*;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;

public class TC_007_Validate_JSON_data {
	
	@Test
	 public void validate_json_response()
	 {
		//Store author data in string
		 String actualAuthor = when()
		 .get("http://localhost:3000/posts/1")
		 .then()
		 .contentType(ContentType.JSON)
		 .extract()
		 .path("author");
		 
		 
		 Assert.assertEquals(actualAuthor, "typicode");
		 
		
	 }

}
