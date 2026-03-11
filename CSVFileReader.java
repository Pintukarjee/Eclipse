package csvFiles;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class CSVFileReader {

	public static void main(String[] args) throws IOException {
		/*
		File file = new File(System.getProperty("user.dir") + "\\data\\example.csv");

		//Approach -1 Using Scanner class
		Scanner sc = new Scanner(file);

		sc.useDelimiter(",");

		while (sc.hasNext()) {
			System.out.print(sc.next() + "\t");
		}
		sc.close();
		*/
		
		String csvFile = System.getProperty("user.dir") + "\\data\\example.csv";
		FileReader reader = new FileReader(csvFile);
		
		BufferedReader bfrReader = new BufferedReader(reader);
		String line;
		
		while((line = bfrReader.readLine())!=null) {
			String[] data = line.split(",");
			for(String value : data) {
				System.out.print(value + "\t");
			}
			System.out.println();
		}
	}

}
