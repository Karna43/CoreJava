package org.java;

import java.util.*;

public class Sample {
public static void main(String[] args) {
	String s = "karunakaran";
	for(int i=0;i<s.length();i++) {
		for(int j=i+1;j<s.length();j++) {
			if(s.charAt(i)==s.charAt(j)) {
				s.replaceAll(s.charAt(i)+"", "");
				break;
			}
		}
	}
	System.out.println(s);
}}
