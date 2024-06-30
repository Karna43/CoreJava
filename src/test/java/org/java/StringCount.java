package org.java;

import java.util.*;

public class StringCount {
	public static void main(String[] args) {
		String s = "karunakaran";
		char[] c = s.toCharArray();
		
		Map<Character, Integer> m = new LinkedHashMap<>();
		for(char i : c) {
			if(m.containsKey(i)) {
				m.put(i, m.get(i)+1);
			}
			else {
				m.put(i, 1);
			}
		}
		for(Character i : m.keySet()) {
			System.out.println(i+": "+m.get(i));
		}
		System.out.println();
		
		Integer col = Collections.max(m.values());
		for(Character i : m.keySet()) {
				if(m.get(i)==col) System.out.println(i);
		}
		System.out.println();
		
		String result="";
		for(int  i=0;i<s.length()-1;i++) {
			int count = 1;
			if(!result.contains(""+s.charAt(i))) {
				for(int j=i+1;j<s.length();j++) {
					if((s.charAt(i)==s.charAt(j))) {
						count++;
						result+=s.charAt(i);
					}
				}
				if(count>1) System.out.println(s.charAt(i)+": "+count);
			}
		}
		System.out.println();
		String ss= "";
		char[] a = s.toCharArray();
		for(int  i=0;i<s.length()-1;i++) {
			for(int j=i+1;j<s.length();j++) {
//				if(s.charAt(i)==s.charAt(j) && 
//						(!ss.contains(""+s.charAt(i)))) {
//					ss+=s.charAt(i);
//					break;
//				}
				if(a[i]==a[j] && (!ss.contains(a[i]+""))) {
					ss+=a[i];
					break;
				}
			}
		}
		System.out.println(ss);
	}
}
