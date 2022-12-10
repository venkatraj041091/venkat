package org.autoapi;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Automatecode {

	public static void main(String[] args) {

		RequestSpecification resSpec;
		resSpec=RestAssured.given();
		resSpec=resSpec.header("accept","application/json");
		//		resSpec=resSpec.pathParam("page", "2");
		//		Response response = resSpec.get("https://reqres.in/api/users/{page}");
		//		resSpec=resSpec.body("{\r\n"
		//				+ "    \"email\": \"eve.holt@reqres.in\",\r\n"
		//				+ "    \"password\": \"pistol\"\r\n"
		//				+ "}");
		//		Response response = resSpec.put("https://reqres.in/api/register");
		resSpec = resSpec.body("{\r\n"
				+ "    \"name\": \"venkat\",\r\n"
				+ "    \"job\": \"leader\"\r\n"
				+ "}");
		Response response = resSpec.post("https://reqres.in/api/users");
		int statusCode = response.getStatusCode();
		System.out.println(statusCode);
		String asString = response.asString();
		String asPrettyString = response.asPrettyString();
		System.out.println(asString);
		System.out.println(asPrettyString);

	}

}
