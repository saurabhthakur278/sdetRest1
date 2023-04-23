package day3;


import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;
import java.util.Map;

import org.json.JSONObject;
import org.testng.annotations.Test;

import com.google.gson.JsonObject;

public class headerinfo {

	@Test
	public void n4() {
		
		RestAssured.useRelaxedHTTPSValidation();
		
	
	
	given()
	.when()
	.then();

}
}