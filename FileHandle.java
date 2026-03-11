package fileHandlinginJava;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandle {

	public static void createFile(String filePath) {
		File myObj = new File(filePath);
		try {
			if (myObj.createNewFile()) {
				System.out.println("File create succesfully." + myObj.getName());
			} else {
				System.out.println("File already exist.");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void writeFile(String filePath) {
		FileWriter myWriter;
		try {
			myWriter = new FileWriter(filePath);
			myWriter.write("Welcome to Java.");
			myWriter.close();
			System.out.println("Successfully wrote the file...");
		} catch (IOException e) {
			System.out.println("An error occured.");
			e.printStackTrace();
		}

	}

	public static void readFile(String filePath) {
		try {
			File myObj = new File(filePath);

			Scanner myReader = new Scanner(myObj);

			while (myReader.hasNextLine()) {
				String data = myReader.nextLine();
				System.out.println(data);
			}
			myReader.close();
		} catch (Exception e) {
			System.out.println("An error occured while reading.");
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		String filePath = "D:\\Java\\javaFileCreationDemo\\java1stDemo.txt";
		createFile(filePath);
		writeFile(filePath);
		readFile(filePath);
	}

}
