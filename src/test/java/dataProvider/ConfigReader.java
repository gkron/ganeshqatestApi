package dataProvider;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
	private Properties properties;
	private static ConfigReader configReader;

    private ConfigReader() {
		BufferedReader reader;
	    	String propertyFilePath = "configs//Configuration.properties";
	        try {
	            reader = new BufferedReader(new FileReader(propertyFilePath));
	            properties = new Properties();
	            try {
	                properties.load(reader);
	                reader.close();
	            } catch (IOException e) {
	                e.printStackTrace();
	            }
	        } catch (FileNotFoundException e) {
	            e.printStackTrace();
	            throw new RuntimeException("Configuration.properties not found at " + propertyFilePath);
	        }		
	}

    public static ConfigReader getInstance( ) {
    	if(configReader == null) {
    		configReader = new ConfigReader();
    	}
        return configReader;
    }

    public String getBaseUrl() {
        String baseUrl = properties.getProperty("base_Url");
        if(baseUrl != null) return baseUrl;
        else throw new RuntimeException("base_Url not specified in the Configuration.properties file.");
    }

    public String getIds() {
        String getid = properties.getProperty("getid");
        if(getid != null) return getid;
        else throw new RuntimeException("getid not specified in the Configuration.properties file.");
    }

    public String getMainid() {
        String id = properties.getProperty("id");
        if(id != null) return id;
        else throw new RuntimeException("id not specified in the Configuration.properties file.");
    }

    public String getCatId() {
        String catid = properties.getProperty("catid");
        if(catid != null) return catid;
        else throw new RuntimeException("cat id not specified in the Configuration.properties file.");
    }

    public String getCatname() {
        String catname = properties.getProperty("catname");
        if(catname != null) return catname;
        else throw new RuntimeException("cat name not specified in the Configuration.properties file.");
    }

    public String getPhotoUrl() {
        String photoUrls = properties.getProperty("photoUrls");
        if(photoUrls != null) return photoUrls;
        else throw new RuntimeException("photoUrls not specified in the Configuration.properties file.");
    }

    public String getTagId() {
        String tagid = properties.getProperty("tagid");
        if(tagid != null) return tagid;
        else throw new RuntimeException("tag id not specified in the Configuration.properties file.");
    }

    public String getTagName() {
        String tagname = properties.getProperty("tagname");
        if(tagname != null) return tagname;
        else throw new RuntimeException("tag name not specified in the Configuration.properties file.");
    }
    
    public String getName() {
        String name = properties.getProperty("name");
        if(name != null) return name;
        else throw new RuntimeException("name not specified in the Configuration.properties file.");
    }
}