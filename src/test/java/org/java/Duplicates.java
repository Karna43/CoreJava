package org.java;

import java.util.*;

public class Duplicates {
public static void main(String[] args) {
	//List<Integer> l = Arrays.asList(80,42,45,42,80,80,74);
	int[] l = {1,2,31,2,2,5,1};
	Set<Integer> li = new HashSet<Integer>();
	for(int i=0;i<l.length;i++) {
		for(int j=i+1;j<l.length;j++) {
			if(l[i]==l[j]) {
				li.add(l[i]);
				break;
			}
		}
	}
	System.out.println(li+"\n");
	
	Map<Integer, Integer> m = new LinkedHashMap<>();
	for(int i : l) {
		if(m.containsKey(i)) {
			m.put(i, m.get(i)+1);
		}
		else {
			m.put(i, 1);
		}
	}
	for(Integer i : m.keySet()) {
		System.out.println(i+": "+m.get(i));
	}
	System.out.println();
}
}
