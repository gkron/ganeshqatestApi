package requests;

import java.util.ArrayList;
import java.util.List;
import requests.PhotoUrls;
import requests.Category;
import requests.Tag;

public class AddPetRequest {

//	public Integer id;
//	public Category category;
//	public String name;
//	public List<PhotoUrls> collectionphotoUrls;
//	public Tag tags;
//	public String status;
	public Integer id;
	public Category category;
	public String name;
	public List<String> photoUrls = null;
	public List<Tag> tags = null;
	public String status;
	
	
	public AddPetRequest(Integer id, Category category, String name, List<String> photoUrls, List<Tag> tags, String status) {
//		this.id = id;
//		category = category;
//		category.id=id;
//		category.name=name;		
//		this.name = name;
//		collectionphotoUrls = new ArrayList<PhotoUrls>();
//		collectionphotoUrls.add(photourls);
//		tags = tags;
//		tags.id=id;
//		tags.name=name;
//		this.status = status;
		
		this.id = id;
		this.category = category;
		this.name = name;
		this.photoUrls = photoUrls;
		this.tags = tags;
		this.status = status;
		
		}
	
}
