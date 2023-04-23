package day4;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;
import java.util.Map;

import org.json.JSONObject;
import org.testng.annotations.Test;

import com.google.gson.JsonObject;

public class Parsingjsonresdata {

	@Test
	public void n4() {
		
		RestAssured.useRelaxedHTTPSValidation();
		
	
	
//	given().contentType(ContentType.JSON)
//	.when()
//	.get("https://reqres.in/api/users?page=2")
//	.then()
//	.statusCode(200).header("Content-Type", "application/json; charset=utf-8")
//	.body("data[0].first_name",equalTo("Michael"));
//		
		
		Response res =given().contentType(ContentType.JSON)
		.when()
		.get("https://reqres.in/api/users?page=2");
		
		
		JSONObject js=new JSONObject(res.toString());
		
		for(int i=0;i<js.getJSONArray("data").length();i++) {
		String fname = js.getJSONArray("data").getJSONObject(i).get("first_name").toString();
		System.out.println(fname);	
		} 
		
		
	
}
	
	@Test
	public void n5() {
		
		double price=0;
		RestAssured.useRelaxedHTTPSValidation();
		
		Response res =given().contentType(ContentType.JSON)
				.when()
				.get("https://reqres.in/api/users?page=2");
				
		JSONObject js=new JSONObject(res.toString());
		
		for(int i=0;i<js.getJSONArray("data").length();i++) {
			String fname = js.getJSONArray("data").getJSONObject(i).get("first_name").toString();
			price=price+ Double.parseDouble(fname);
			} 
		
		System.out.println(price);
	}
}