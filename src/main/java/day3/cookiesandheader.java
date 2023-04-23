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

public class cookiesandheader {

//	@Test
	public void n4() {
		
		RestAssured.useRelaxedHTTPSValidation();
		
	given()
	
	
	.when().get("https://www.google.com/")
	
	
	.then()
	.cookie("AEC","ARSKqsKcI3OCtrm8Bck28qjM64jxsJ1fKcuEGrtQmL973a_Z8aExgetiugU")
	.log().all();
	
	
}
	
	@Test
	public void n5() {
		
		RestAssured.useRelaxedHTTPSValidation();
		
		Response res=given()
	
	
	.when().get("https://www.google.com/");
	
//	single cookie values
		
//	String coockeval=res.getCookie("AEC");
//	System.out.println(coockeval);
	
//	multiple cookie val
		
		Map<String, String> cokies=res.getCookies();
//		System.out.println(cokies.keySet());
		
		
		for( String k :cokies.keySet()) {
			String coockeval=res.getCookie(k);
			
			System.out.println(k+"   "+coockeval);
			
		}
	
}




}
