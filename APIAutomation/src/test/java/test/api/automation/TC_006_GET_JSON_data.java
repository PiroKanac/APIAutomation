package test.api.automation;
import static com.jayway.restassured.RestAssured.*;

import org.testng.annotations.Test;

import com.jayway.restassured.response.Response;

public class TC_006_GET_JSON_data {

	@Test
	 public void validate_json_response()
	 {
		 Response response = when()
		 .get("http://localhost:3000/posts/1");
		 
		 System.out.println(response.asString());
	 }
}
