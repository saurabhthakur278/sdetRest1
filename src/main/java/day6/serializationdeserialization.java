package day6;

import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import day2.pojopost;
import io.restassured.RestAssured;

public class serializationdeserialization {
	
	
//pojo to json
//	@Test(priority = 1)
	void pojo() throws JsonProcessingException {
		
		RestAssured.useRelaxedHTTPSValidation();
		
		studentpojo ps=new studentpojo();
		
		ps.setName("asd");
		String course1[]= {"c","c++"};
		ps.setCourse(course1);
		
		
		
//		convert java obj into -----json object(serialization)
		ObjectMapper om=new ObjectMapper();
		String jsondata=om.writerWithDefaultPrettyPrinter().writeValueAsString(ps);
		
		System.out.println(jsondata);
		

}
	
//	json to pajo
	
		@Test(priority = 2)
		void pojo1() throws JsonMappingException, JsonProcessingException{
			
			RestAssured.useRelaxedHTTPSValidation();
			
//			studentpojo ps=new studentpojo();
//			
//			ps.setName("asd");
//			String course1[]= {"c","c++"};
//			ps.setCourse(course1);
			
			

			String jsondata= "{\r\n"
					+ "  \"name\" : \"asd\",\r\n"
					+ "  \"course\" : [ \"c\", \"c++\" ]\r\n"
					+ "}";
			
//			converting pojo to java obj	
			ObjectMapper om=new ObjectMapper();
			studentpojo stu=om.readValue(jsondata, studentpojo.class);
			
			System.out.println(stu.getName());
			System.out.println(stu.getCourse()[0]);
			System.out.println(stu.getCourse()[1]);
		}
	

		
	
		
		

}