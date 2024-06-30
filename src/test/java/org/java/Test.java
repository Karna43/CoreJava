package org.java;

import java.util.*;

public class Test {

	public static void main(String[] args) {
		int[] a = {1,2,1,1,3,2};
		Map<Integer, Integer> m = new HashMap<>();
		for(int i : a) {
			m.put(i, 1);
		}
		int size = m.keySet().size();
		int[] b = new int[size];
		int len = 0;
		for(Integer i : m.keySet()) {
			b[len] = i;
			len++;
		}
		for(int i : b) {
			System.out.println(i);
		}
		System.out.println();
		
		String s = "Vignesh Kumar";
		String[] ss = s.split(" ");
		ss[0] = ss[0]+ss[1];
		ss[1] = ss[0].substring(0, ss[0].length()-ss[1].length());
		ss[0] = ss[0].substring(ss[1].length());
		String az = ss[0] + " " + ss[1];
		System.out.println(az);
		
		String str = "ramesh is a good man";
		char[] c = str.toCharArray();
		String st = "";
		Map<Character, Integer> map = new HashMap<>();
		for(Character i : c) {
			if(map.containsKey(i)) {
				map.put(i, map.get(i)+1);
			}
			else {
				map.put(i, 1);
			}
		}
		for(Character i : map.keySet()) {
			if(i!=' ') {
				st = st + i + map.get(i);
			}
		}
		System.out.println(st);
	}

}
