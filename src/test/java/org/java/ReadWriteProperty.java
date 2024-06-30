package org.java;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Collection;
import java.util.Properties;
import java.util.Set;

public class ReadWriteProperty {

	public static void main(String[] args) {
		try {
			Properties prop = new Properties();
			String str = System.getProperty("user.dir")+"\\data\\property.properties";
			prop.setProperty("Age", "28");
			prop.setProperty("Name", "karna");
			FileOutputStream writeFile = new FileOutputStream(str);
			prop.store(writeFile,"properties stored");
			writeFile.close();
			
			FileInputStream readFile = new FileInputStream(str);
			prop.load(readFile);
			readFile.close();
			
			String name = prop.getProperty("Name");
			String age = prop.getProperty("Age");
			System.out.println(name+" "+age);
			
			Set<String> keys = prop.stringPropertyNames();
			System.out.println(keys);
			
			Set<Object> allkeys = prop.keySet();
			System.out.println(allkeys);
			
			Collection<Object> values = prop.values();
			System.out.println(values);
			
			for(String key : prop.stringPropertyNames()) {
				System.out.println(key+": "+prop.getProperty(key));
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
