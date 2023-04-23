
package day2;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;

import org.json.JSONObject;
import org.testng.annotations.Test;

import com.google.gson.JsonObject;

public class aqweds {
	

	
//	@Test(priority = 1)
	void m1() {
		
		
		JSONObject js =new JSONObject();
		js.put("a", "sdas");
		
		RestAssured.useRelaxedHTTPSValidation();
		given().contentType("application/json").body(js.toString())
		.when().post("https://reqres.in/api/users")
		.then().statusCode(201).log().all();
	}
	
	@Test(priority = 1)
	void pojo() {
		
		pojopost ps=new pojopost();
		
		ps.setName("asd");
		String course1[]= {"c","c++"};
		ps.setCourse(course1);
		
		
		
		RestAssured.useRelaxedHTTPSValidation();
		given().contentType("application/json").body(ps)
		.when().post("https://reqres.in/api/users")
		.then().statusCode(201).log().all();
	}
	
	
}
