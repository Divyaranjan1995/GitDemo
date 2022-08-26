
import static org.hamcrest.Matchers.*;
import static org.hamcrest.MatcherAssert.assertThat; 
import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;
import static io.restassured.RestAssured.given;

public class Basics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Validate if Add API is working as expected
				//Given, When & Then
				//Given = all input details - query @param, header, body
				//When = Submit the API - resource, http method
				//Then = validate the response
				
				RestAssured.baseURI = "https://rahulshettyacademy.com";
				given().log().all().queryParam("key", "qaclick123").header("Content-Type", "application/json")
				.body("{\r\n"
						+ "  \"location\": {\r\n"
						+ "    \"lat\": -38.383494,\r\n"
						+ "    \"lng\": 33.427362\r\n"
						+ "  },\r\n"
						+ "  \"accuracy\": 50,\r\n"
						+ "  \"name\": \"Divyaranjan Padhiary\",\r\n"
						+ "  \"phone_number\": \"(+91) 983 893 3937\",\r\n"
						+ "  \"address\": \"29, side layout, cohen 09\",\r\n"
						+ "  \"types\": [\r\n"
						+ "    \"shoe park\",\r\n"
						+ "    \"shop\"\r\n"
						+ "  ],\r\n"
						+ "  \"website\": \"http://google.com\",\r\n"
						+ "  \"language\": \"French-IN\"\r\n"
						+ "}").when().log().all().post("maps/api/place/add/json")
				.then().log().all().assertThat().statusCode(200);
	}

}

//import static io.restassured.RestAssured.given;
//import static org.hamcrest.Matchers.equalTo;
//
//import io.restassured.RestAssured;
//
//public class Basics {
//
//public static void main(String[] args) {
//		
//		RestAssured.baseURI = "https://rahulshettyacademy.com";
//		
//		RestAssured.useRelaxedHTTPSValidation();
//		
//		
//	String output = given().log().all().queryParam("key", "qaclick123")
//				.header("Content-Type","application/json")
//				.body("{\n" + 
//						"  \"location\": {\n" + 
//						"    \"lat\": -38.383494,\n" + 
//						"    \"lng\": 33.427362\n" + 
//						"  },\n" + 
//						"  \"accuracy\": 50,\n" + 
//						"  \"name\": \"Frontline house\",\n" + 
//						"  \"phone_number\": \"(+91) 983 893 3937\",\n" + 
//						"  \"address\": \"29, side layout, cohen 09\",\n" + 
//						"  \"types\": [\n" + 
//						"    \"shoe park\",\n" + 
//						"    \"shop\"\n" + 
//						"  ],\n" + 
//						"  \"website\": \"http://google.com\",\n" + 
//						"  \"language\": \"French-IN\"\n" + 
//						"}\n" + 
//						"").when().post("/maps/api/place/add/json")
//				.then().assertThat().statusCode(200).header("Server", "Apache/2.4.18 (Ubuntu)").body("scope", equalTo("APP")).extract().response()
//				.asString();
//	 
//		System.out.println(output);
//	
//		
//		
//	}
//	
//}
