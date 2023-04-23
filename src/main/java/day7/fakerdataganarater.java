package day7;



import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;



public class fakerdataganarater {

	@Test(priority = 1)
	public void n5() {
		
		RestAssured.useRelaxedHTTPSValidation();
	
	Faker fake=new Faker();
	String fullname=fake.name().fullName();
	String fname= fake.name().firstName();
	String uname=fake.name().username();
	String pass=fake.internet().password();
	
	System.out.println(fullname);
	System.out.println(fname);
	System.out.println(uname);
	System.out.println(pass);
	
	
	
	
	
	
}
}