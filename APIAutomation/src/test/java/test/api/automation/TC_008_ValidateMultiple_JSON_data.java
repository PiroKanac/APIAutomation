package test.api.automation;

import static com.jayway.restassured.RestAssured.*;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.ValidatableResponse;

public class TC_008_ValidateMultiple_JSON_data {

	
	@Test
	 public void validatemultiple_json_response()
	 {
		//Store author data in string
		 ValidatableResponse response = when()
		 .get("http://localhost:3000/posts/1")
		 .then()
		 .contentType(ContentType.JSON);
		 
		 String actualTitle = response.extract().path("title");
		 String actualAuthor = response.extract().path("author");
		 int actualId = response.extract().path("id");
	
		 Assert.assertEquals(actualAuthor, "Updated Author");
		 Assert.assertEquals(actualId, 1);
		
	 }
}
