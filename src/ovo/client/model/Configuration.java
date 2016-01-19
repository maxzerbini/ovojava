package ovo.client.model;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;

public class Configuration {

    public ArrayList<Node> ClusterNodes;

    public Configuration() 
    {
        ClusterNodes = new ArrayList<Node>();
    }
    
    public static Configuration loadFromFile(String path) throws FileNotFoundException
    {
    	Gson gson = new Gson();
    	JsonReader reader;
		try {
			reader = new JsonReader(new FileReader(path));
			Configuration data = gson.fromJson(reader, Configuration.class);
	    	return data;
		} catch (FileNotFoundException e) {
			throw e;
		}
    	
    }
    
}
