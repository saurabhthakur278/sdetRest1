package sdetRest1day;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;


public class qqqq {
	
	int id;

	@Test(enabled = false)
	public void getUser() {
	
		 RestAssured.useRelaxedHTTPSValidation();
		 
	given()
	.when().get("https://reqres.in/api/users?page=2")
	.then().statusCode(200).body("total_pages",equalTo("<2>")).log().all();
	}
	
	@Test(priority = 1)
	void createuser() {
		
		RestAssured.useRelaxedHTTPSValidation();
		HashMap hs=new HashMap();
		hs.put("A", "a");
		hs.put("B", "b");
		
		id=given().contentType("application/json").body(hs)
		
		.when().post("https://reqres.in/api/users").jsonPath().getInt("id");
		
//		.then().statusCode(201).log().all();
	}
	@Test(priority = 2, dependsOnMethods = {"createuser"})
	void updateUser() {
		
		RestAssured.useRelaxedHTTPSValidation();
		HashMap hs=new HashMap();
		hs.put("C", "c");
		hs.put("D", "d");
		
		given().contentType("application/json").body(hs)
		
		.when().put("https://reqres.in/api/users/"+id)
		
		.then().statusCode(200).log().all();
		
		
	}
	
	@Test(priority = 3)
	void deleteUser() {
		when().delete("https://reqres.in/api/users/"+id)
		.then().statusCode(204).log().all();
		
	}
	
	
}
