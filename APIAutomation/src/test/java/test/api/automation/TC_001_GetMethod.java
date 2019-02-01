package test.api.automation;

import org.testng.Assert;
import org.testng.annotations.Test;

import static com.jayway.restassured.RestAssured.*;
import com.jayway.restassured.response.Response;

public class TC_001_GetMethod {

	@Test
	public void tc_001_getMethod_validation() 
	{
		
		//Response response = RestAssured.get("http://services.groupkt.com/country/get/iso2code/RS");
		Response response = get("http://www.omdbapi.com/?t=Spiderman&y=&plot=short&r=json");
		//System.out.println(response.asString());
		//System.out.println(response.getStatusCode());
		Assert.assertEquals(response.getStatusCode(),200);
	}
	
	
}
