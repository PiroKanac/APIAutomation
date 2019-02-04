package test.api.automation;

import org.testng.Assert;
import org.testng.annotations.Test;

import static com.jayway.restassured.RestAssured.*;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;

public class TC_001_GetMethod {

	@Test
	public void tc_001_getMethod_validation() 
	{
		/*  ************************Jump into Rest API Automation using Rest-Assured*****************
		 
		 
		//Response response = RestAssured.get("http://services.groupkt.com/country/get/iso2code/RS");
		Response response = get("http://www.omdbapi.com/?t=Spiderman&y=&plot=short&r=json");
		//System.out.println(response.asString());
		//System.out.println(response.getStatusCode());
		Assert.assertEquals(response.getStatusCode(),200);     */
		
		
		//******************Write Rest Assured test cases**********************
		//***************POST METHOD******************
	/*	Response response = given()
		.contentType(ContentType.JSON)
		//update with new value
		//.body("{\"id\": 2, \"title\": \"json-server\", \"author\": \"typicode\"}")
		//update with new value
		.body("{\"id\": 3, \"title\": \"Spiderman\", \"author\": \"ABC\"}")
		.when()
		.post("http://localhost:3000/posts");
		
		System.out.println(response.asString());
		*/
		
		//**************POST METHOD with Validation************
		given()
		.contentType(ContentType.JSON)
		.body("{\"id\": 4, \"title\": \"Spiderman\", \"author\": \"ABC\"}")
		.when()
		.post("http://localhost:3000/posts")
		.then()
		.statusCode(201)
		.contentType(ContentType.JSON);
	}

	
}
