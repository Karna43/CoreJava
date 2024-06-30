package org.java;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternRegex{
	public static void main(String[] args) throws IOException{
		String s = "^[a-zA-Z0-9+_.-]+@(.+)$";
		String ss = "klk@mm.com";
		Pattern p = Pattern.compile(s);
		Matcher m = p.matcher(ss);
		if(m.matches()) {
			System.out.println(m.group());
		}
		
		String r = "Hii hello Hi";
//		String r = s.replace(" ", "");
		Pattern pat = Pattern.compile("Hi$");
		Matcher mat = pat.matcher(r);
		int count = 0;
		while(mat.find()) {
			count++;
			System.out.println(mat.group()+":"+mat.start()+":"+mat.end());
		}
		System.out.println(count);
	}
}