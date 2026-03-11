package csvFiles;

import java.io.FileWriter;
import java.io.IOException;

public class CSVFileWriter {

	public static void main(String[] args) throws IOException {
		String csvFileName = System.getProperty("user.dir") + "\\data\\example.csv";

		FileWriter fileWriter = new FileWriter(csvFileName);

		fileWriter.append("Name,Age,Email \n"); // header
		fileWriter.append("Raghu,45,raghu@gmail.com \n");
		fileWriter.append("Jamuna,35,jamuna@gmail.com \n");
		fileWriter.append("Subash,22,subu@gmail.com \n");

		fileWriter.close();
		System.out.println("CSV File created. " + csvFileName);
	}

}
