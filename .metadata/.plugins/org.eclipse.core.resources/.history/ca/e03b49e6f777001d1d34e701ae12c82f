package com.fdmgroup.jpa.properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class DatabaseProperties {
	// MAC URL => /Users/matthew.hircock/database-login.properties
	private static final String PROP_FILE_LOCATION = "C:\\Users\\matthew.hircock\\database-login.properties";

	public static Map<String, String> getProperties() {
		Map<String, String> properties = new HashMap<>();
		Properties props = new Properties();
		try {
			props.load(new FileInputStream(PROP_FILE_LOCATION));
		} catch (FileNotFoundException e) {
			System.out.println("Properties file not found - " + e.getMessage());
		} catch (IOException e) {
			System.out.println("Unable to load properties file - " + e.getMessage());
		}

		String username = (String) props.get("username");
		String password = (String) props.get("password");

		properties.put("javax.persistence.jdbc.user", username);
		properties.put("javax.persistence.jdbc.password", password);
		
		return properties;
	}
	
}
