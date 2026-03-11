package fileHandlinginJava;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class WriteFileProperties {

	public static void main(String[] args) throws IOException {
		Properties properties = new Properties();

		properties.setProperty("name", "Pintu");
		properties.setProperty("age", "25");
		properties.setProperty("email", "pintu@gmail.com");

		String filePath = System.getProperty("user.dir") + "\\data\\example.properties";

		FileOutputStream file = new FileOutputStream(filePath);

		properties.store(file, "Sample data in properties file...");

		file.close();

		System.out.println("Properties have been written into " + filePath);

	}

}
