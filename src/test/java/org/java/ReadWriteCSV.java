package org.java;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class ReadWriteCSV {

	public static void main(String[] args) {
		try{
			String str = System.getProperty("user.dir")+"\\data\\example.csv";
			FileWriter writeFile = new FileWriter(str);
			writeFile.append("Name,Age\n");
			writeFile.append("karna,28\n");
			writeFile.append("kirthik,26\n");
			writeFile.append("prem,29\n");
			writeFile.close();
			
			FileReader readFile1 = new FileReader(str);
			Scanner scan = new Scanner(readFile1);
			scan.useDelimiter(",");
			while(scan.hasNext()) {
				System.out.print(scan.next()+"\t");
			}
			scan.close();
			System.out.println();
			
			FileReader readFile2 = new FileReader(str);
			BufferedReader br = new BufferedReader(readFile2);
			String line;
			while((line=br.readLine())!=null) {
				String[] data = line.split(",");
				for(String i : data) {
					System.out.print(i+"\t");
				}
				System.out.println();
			}
			br.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
