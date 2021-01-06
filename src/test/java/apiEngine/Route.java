package apiEngine;

public class Route {
	
	private static final String getPetById = "/pet";
	private static final String VERSION = "/v2";
	
	
	public static String getPetById(Integer id) {
		return VERSION+getPetById+"/"+id;
	}

	public static String addNewPet() {
		return VERSION+getPetById;
	}
	
	public static String updatePet() {
		return VERSION+getPetById;
	}
	
	public static String deletePetById(Integer id) {
		return VERSION+getPetById+"/"+id;
	}
}
