package stepDefinitions;
import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.internal.support.FileReader;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import requests.AddPetRequest;
import requests.Category;
import requests.PhotoUrls;
import requests.Tag;
import requests.RemovePet;
import apiEngine.Endpoints;
import dataProvider.ConfigReader;

public class Steps {

    private static Integer id;
	private static Response response; 



	@Given("I am able to get pet by id")
	public void i_am_able_to_get_pet_by_id() {
		response = Endpoints.getPetsById();
		System.out.println(response.asString());
	}

	@When("I add a new pet")
	public void i_add_a_new_pet() {
		//Category category = new Category(77, "mycat");
		String catid = ConfigReader.getInstance().getCatId();
		int caid = Integer.parseInt(catid);
		Category category = new Category(caid, ConfigReader.getInstance().getCatname());

		List<String> photoUrls = new ArrayList<String>();
		photoUrls.add(ConfigReader.getInstance().getPhotoUrl());
		List<Tag> tags = new ArrayList<Tag>();
		
		String tid = ConfigReader.getInstance().getTagId();
		int td = Integer.parseInt(tid);
		tags.add(new Tag(td, ConfigReader.getInstance().getTagName()));
		
		String pid = ConfigReader.getInstance().getMainid();
		int rootId =Integer.parseInt(pid);
		
		AddPetRequest addPetRequest = new AddPetRequest(rootId, category, ConfigReader.getInstance().getName(), photoUrls, tags, "Available");
		
		response = Endpoints.addNewPet(addPetRequest);
		String jsonString = response.asString();
		id = JsonPath.from(jsonString).get("id");
		System.out.println(id);
		
	}

	@Then("I should see new pet added in list")
	public void i_should_see_new_pet_added_in_list() {
		System.out.println(response.asString());
		Assert.assertEquals( 200, response.getStatusCode());
	}

	@When("I remove a pet FROM LIST")
	public void i_remove_a_pet_FROM_LIST() {
		response = Endpoints.deletePetById();

	}

	@Then("I should see pet removed from list")
	public void i_should_see_pet_removed_from_list() {
		System.out.println(response.asString());
		Assert.assertEquals( 200, response.getStatusCode());
	}

	@When("I update a status of existing pet")
	public void i_update_a_status_of_existing_pet() {
		
		String catid = ConfigReader.getInstance().getCatId();
		int caid = Integer.parseInt(catid);
		Category category = new Category(caid, ConfigReader.getInstance().getCatname());

		List<String> photoUrls = new ArrayList<String>();
		photoUrls.add(ConfigReader.getInstance().getPhotoUrl());
		List<Tag> tags = new ArrayList<Tag>();
		
		String tid = ConfigReader.getInstance().getTagId();
		int td = Integer.parseInt(tid);
		tags.add(new Tag(td, ConfigReader.getInstance().getTagName()));
		
		String pid = ConfigReader.getInstance().getMainid();
		int rootId =Integer.parseInt(pid);
		
		AddPetRequest addPetRequest = new AddPetRequest(rootId, category, ConfigReader.getInstance().getName(), photoUrls, tags, "Sold");
		

		System.out.println(addPetRequest.toString());
		
		response = Endpoints.updatePet(addPetRequest);

	}

	@Then("I should see status updated")
	public void i_should_see_status_updated() {
		System.out.println(response.asString());
		Assert.assertEquals( 200, response.getStatusCode());
	}

}
