package fileHandlinginJava;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collection;
import java.util.Properties;
import java.util.Set;

public class ReadFileProperties {

	public static void main(String[] args) throws IOException {
		Properties properties = new Properties();

		String filePath = System.getProperty("user.dir") + "\\data\\example.properties";

		FileInputStream file = new FileInputStream(filePath);

		properties.load(file);

		file.close();

		// Read data from properties
		String name = properties.getProperty("name");
		String email = properties.getProperty("email");
		String age = properties.getProperty("age");

		System.out.println(name + " " + email + " " + age);

		// Capture all the properties
		Set<String> keys = properties.stringPropertyNames();
		System.out.println(keys);

		// Capture all the properties
		Set<Object> allKeys = properties.keySet();
		System.out.println(allKeys);

		// Capture all the values
		Collection<Object> values = properties.values();
		System.out.println(values);

		// Read all the Properties and Values
		System.out.println("------------------USING FOR EACH LOOP--------------------");
		for (String key : properties.stringPropertyNames()) {
			System.out.println(key + " = " + properties.getProperty(key));
		}
	}

}
