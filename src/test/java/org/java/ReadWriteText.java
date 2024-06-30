package org.java;

import java.io.*;
import java.util.Scanner;

public class ReadWriteText {

	public static void main(String[] args) {
		try{
			File file = new File(System.getProperty("user.dir")+"\\data\\textFile.txt");
			
//			file.mkdir();
//			if(file.mkdirs()) {
//				System.out.println("Folder created");
//			}
//			else {
//				System.out.println("Folder not created");
//			}
//			
//			file.delete();
			
			if(file.createNewFile()) {
				System.out.println("New file created");
			}
			else {
				System.out.println("File already exists");
			}
			
			FileWriter f1 = new FileWriter(file);
			f1.write("Java is a programming language\nJava is platform independent");
			f1.close();
			
			FileReader f2 = new FileReader(file);
			Scanner s = new Scanner(f2);
			while(s.hasNext()) {
				System.out.println(s.nextLine());
			}
			f2.close();
			
			File newFile = new File(System.getProperty("user.dir")+"\\data\\text.txt");
			if(file.renameTo(newFile)) {
				System.out.println("File Renamed");
			}
			else {
				System.out.println("No file exists");
			}
			System.out.println();
			
			File listFile = new File(System.getProperty("user.dir")+"\\data");
			if(listFile.isDirectory()) {
				String[] str = listFile.list();
				for(String i:str) {
					System.out.println(i);
				}
			}
			System.out.println();
			
			File f = new File("c:\\");
			File[] fl = f.listFiles();
			for(File i : fl) {
				if(!i.isHidden()) System.out.println(i);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
