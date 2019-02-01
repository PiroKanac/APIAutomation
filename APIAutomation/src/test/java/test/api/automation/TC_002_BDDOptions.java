package test.api.automation;

import static com.jayway.restassured.RestAssured.*;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.jayway.restassured.response.Response;

public class TC_002_BDDOptions {

	@Test
	public void tc_001_getMethod_validation() 
	{
			
		given().param("t", "Spiderman")
			   .param("y", "")
			   .param("plot", "short")
			   .param("r", "json")
		.when().get("http://www.omdbapi.com/")
		.then().statusCode(401);
	
	}
}
