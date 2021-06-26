package InterviewTests.FugetronSruthi;

import org.json.JSONObject;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.*;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class APITest {
	@Test
	public void GetAPI() {
		
		 // Specify the base URL to the RESTful web service
		 RestAssured.baseURI = "http://demo.guru99.com/";
		 RequestSpecification httpRequest = RestAssured.given();

		 // This will return the Response from the server. Store the response in a variable.
		 Response response = httpRequest.request(Method.GET, "/test/web-table-element.php");

		 // print the body of the message received from the server
		 System.out.println("Status Code is =>  " + response.statusCode());
		 System.out.println(response.statusLine());
		 Reporter.log("RestAssured GET method executed");
		 //System.out.println(response.asString());
		 //System.out.println(response.getBody().asString());
		 
		 
	
	}
	
	@Test
	public void PostAPI() {
		
		RestAssured.baseURI ="https://reqres.in/api";
		 RequestSpecification request = RestAssured.given();
		 
		 JSONObject requestParams = new JSONObject();
		 requestParams.put("name", "chaya");
		 requestParams.put("job", "BA");

		 request.body(requestParams.toString());
		 Response response = request.post("/users");
		 System.out.println("Status Code is =>  " + response.statusCode());
		 System.out.println(response.statusLine());
		 
		 int statusCode = response.getStatusCode();
		 Assert.assertEquals(statusCode, 201);
		 Reporter.log("RestAssured POST method executed");

		
	}

}
