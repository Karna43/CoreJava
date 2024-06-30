package org.java;

import java.util.LinkedHashMap;
import java.util.Map;

public class Count {

	public static void main(String[] args) {
		String s = "Java is programming";
		char[] c = s.toCharArray();
		Map<Character, Integer> m = new LinkedHashMap<Character, Integer>();
		for(char i : c) {
			if(m.containsKey(i)) {
				m.put(i, m.get(i)+1);
			}
			else {
				m.put(i, 1);
			}
		}
		System.out.println(m);
	}

}
