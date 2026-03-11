package fileHandlinginJava;

import java.io.File;

public class CreateFolder {

	// Folder create
	public static void FolderCreation(String folderPath) {
		File folder = new File(folderPath);
		if (!folder.exists()) {
			folder.mkdir();
			System.out.println("Folder created." + folderPath);
		}
	}

	// Check Folder exist
	public static boolean checkFolderExist(String folderPath) {
		File folder = new File(folderPath);
		return folder.exists();
	}

	// Folder Rename
	public static void renameFolder(String oldPath, String newPath) {
		File oldFolder = new File(oldPath);
		File newFolder = new File(newPath);

		if (oldFolder.exists()) {
			oldFolder.renameTo(newFolder);
			System.out.println("Folder renamed." + newPath);
		}
	}

	// Delete Folder
	public static void deleteFolder(String folderPath) {
		File folder = new File(folderPath);

		if (folder.exists()) {
			for (File file : folder.listFiles()) {
				file.delete();
			}
			folder.delete();
			System.out.println("Folder deleted." + folderPath);
		}
	}

	public static void main(String[] args) {
		String folderPath = "D:\\Java\\javaFileCreationDemo";
		FolderCreation(folderPath);

		boolean folderExists = checkFolderExist(folderPath);
		System.out.println("Folder alredy exist." + folderExists);

		String newFolderPath = "D:\\Java\\javaFileRenamed";
		renameFolder(folderPath, newFolderPath);

		deleteFolder(newFolderPath);
	}

}
