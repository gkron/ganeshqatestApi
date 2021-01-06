package apiEngine;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import requests.AddPetRequest;
import dataProvider.ConfigReader;

public class Endpoints {
	
	private static final String BASE_URL = "https://petstore.swagger.io/";

	
	public static Response getPetsById() {
        RestAssured.baseURI = ConfigReader.getInstance().getBaseUrl();
        RequestSpecification request = RestAssured.given();
 
        request.header("Content-Type", "application/json");
        
        String pid = ConfigReader.getInstance().getIds();
		int rootId =Integer.parseInt(pid);
        Response response = request.get(Route.getPetById(rootId));
       // Response response = request.get("v2/pet/200");
        return response;
    }
 
	public static Response addNewPet(AddPetRequest addPetRequest) {
		RestAssured.baseURI = ConfigReader.getInstance().getBaseUrl();
		RequestSpecification request = RestAssured.given();
		request.header("accept", "application/json")
		.header("Content-Type", "application/json");
		Response response = request.body(addPetRequest).post(Route.addNewPet());
		//Response response = request.body(addPetRequest).post("v2/pet");
        return response;
		
	}
	
	public static Response updatePet(AddPetRequest addPetRequest) {
		RestAssured.baseURI = ConfigReader.getInstance().getBaseUrl();
		RequestSpecification request = RestAssured.given();
		request.header("accept", "application/json")
		.header("Content-Type", "application/json");
		Response response = request.body(addPetRequest).put(Route.updatePet());
		//Response response = request.body(addPetRequest).put("v2/pet");
        return response;
		
	}

	public static Response deletePetById() {
		RestAssured.baseURI = ConfigReader.getInstance().getBaseUrl();
		RequestSpecification request = RestAssured.given();
		request.header("accept", "application/json")
		.header("Content-Type", "application/json");
     	Response response = request.delete(Route.deletePetById(1455));
		//Response response = request.delete("v2/pet/1455");
        return response;
    }
	

}
