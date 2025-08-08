package com.usecases.java;

import java.util.Scanner;

public class DriveSimulator {
	static String[] fileNames = new String[10];
	static int[] fileSizes = new int[10];
	static int fileCount = 0;

	public static void uploadFile(String name, int size) {
		if (fileCount < fileNames.length) {
			fileNames[fileCount] = name;
			fileSizes[fileCount] = size;
			fileCount++;
			System.out.println("File '" + name + "' uploaded successfully!\n");
		} else {
			System.out.println("Storage full. Cannot upload more files.\n");
		}
	}

	public static void showFiles() {
		if (fileCount == 0) {
			System.out.println("No files uploaded yet.\n");
			return;
		}
		for (int i = 0; i < fileCount; i++) {
			System.out.println((i + 1) + ". " + fileNames[i] + " (" + fileSizes[i] + " KB)");
		}
		System.out.println();
	}

	public static void downloadFile(String name) {
		boolean found = false;
		for (int i = 0; i < fileCount; i++) {
			if (fileNames[i].equalsIgnoreCase(name)) {
				System.out.println("Downloading '" + fileNames[i] + "' (" + fileSizes[i] + " KB)... Done!\n");
				found = true;
				break;
			}
		}
		if (!found) {
			System.out.println("File not found.\n");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice;

		do {
			System.out.println("1. Upload File");
			System.out.println("2. View Files");
			System.out.println("3. Download File");
			System.out.println("4. Exit");
			System.out.print("Enter your choice: ");
			choice = sc.nextInt();
			sc.nextLine(); 

			switch (choice) {
			case 1:
				System.out.print("Enter file name: ");
				String name = sc.nextLine();
				System.out.print("Enter file size (KB): ");
				int size = sc.nextInt();
				uploadFile(name, size);
				break;

			case 2:
				showFiles();
				break;

			case 3:
				System.out.print("Enter file name to download: ");
				String downloadName = sc.nextLine();
				downloadFile(downloadName);
				break;

			case 4:
				System.out.println("Thank you for using Mini Drive.");
				break;

			default:
				System.out.println("Invalid choice.\n");
			}

		} while (choice != 4);

		sc.close();
	}
}
