package day3;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;

import org.json.JSONObject;
import org.testng.annotations.Test;

import com.google.gson.JsonObject;


public class pathandqueryparam {
	//https://reqres.in/api/users?page=2
	
	@Test
	public void n3() {
		
		RestAssured.useRelaxedHTTPSValidation();
		
	given()
	.pathParam("path","users")
	.queryParam("page", 2)
	.queryParam("id", 3)
	.when().get("https://reqres.in/api/{path}")
	.then().statusCode(200).log().all();
	}
	
	
	
}



