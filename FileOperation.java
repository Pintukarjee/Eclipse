package fileOperation;

import java.io.File;
import java.util.Iterator;
import java.util.Scanner;

public class FileOperation {

	private static final String BASE_DIRECTORY = "D:\\Java\\New folder";

	public static void createFolder(String folderPath) {
		File folder = new File(folderPath);
		if (!folder.exists()) {
			folder.mkdir();
			System.out.println("Folder created successfully." + folderPath);
		} else {
			System.out.println("Failed to create folder!. Check Path and Permission.");
		}
	}

	public static void deleteFolder(String folderPath) {
		File folder = new File(folderPath);

		if (folder.exists()) {
			for (File file : folder.listFiles()) {
				file.delete();
			}
			folder.delete();
		}
	}

	public static void main(String[] args) {



		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the folder name: ");
		String folderName = scanner.next();
		String fullPath = BASE_DIRECTORY + folderName;
		createFolder(fullPath);
		scanner.close();

		Scanner scanner1 = new Scanner(System.in);
		System.out.print("Enter the folder name to delete : ");
		String fileName = scanner1.next();
		String fullFileName = BASE_DIRECTORY + folderName;
		deleteFolder(fullFileName);
		scanner1.close();
	}

}
