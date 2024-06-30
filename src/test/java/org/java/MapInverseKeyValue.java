package org.java;

import java.util.*;

public class MapInverseKeyValue {
public static void main(String[] args) {
	Map<String, String> test = new HashMap<String, String>();
	Map<String, String> test1 = new HashMap<String, String>();
    test.put("a", "1");
    test.put("c", "1");
    test.put("b", "2");
    test.put("c", "41");
//	MapUtils.inverseMap();
//  for(String i : test.keySet()) {
//  	test1.put(test.get(i), i);
//  }
    test.forEach((i, j) -> test1.put(j, i));
    System.out.println(test1);
}
}
