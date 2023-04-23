package day7;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;


public class Authentication {

//	@Test(priority = 1)
	public void n4() {
		
		RestAssured.useRelaxedHTTPSValidation();
		
	given()
	.auth().basic("postman","password")
	.when().get("https://postman-echo.com/basic-auth")
	.then().statusCode(200).body("authenticated", equalTo(true)).log().all();
	
	
}
	
	@Test(priority = 2)
	public void n5() {
		
		RestAssured.useRelaxedHTTPSValidation();
		
	given()
	.auth().digest("postman","password")
//	for prementive auth use below code line 
//	.auth().prementive().basic("postman","password")
	.when().get("https://postman-echo.com/basic-auth")
	.then().statusCode(200).body("authenticated", equalTo(true)).log().all();
	
	
}
	
	
}