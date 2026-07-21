package aPIRestAssured;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.io.File;
import java.util.HashMap;

import io.restassured.response.Response;
		public class First {

		public static void main(String[] args) {
		
		Response res= given()
		 .when ()
		//Request-1
		 .get("https://jsonplaceholder.typicode.com/posts");
		  String Cookies =res.jsonPath().getString("[2].id");
	
		  //Request-2
		  given()
		  .pathParam("userId", Cookies)
		  .when()
		  .get("https://jsonplaceholder.typicode.com/posts/{userId}")
		  .then()
		  .log()
		  .all();  
		  
		}
	
	}
