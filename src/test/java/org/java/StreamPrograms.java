package org.java;

import java.util.Comparator;
import java.util.*;
import java.util.stream.Stream;

public class StreamPrograms {

	public static void main(String[] args) {
		Comparator<Integer> com = (i,j) -> i%10<j%10?1:-1;
		List<Integer> l = Arrays.asList(80,42,45,74);
		Stream<Integer> a = l.stream()
				.filter(i -> i%2==0)
				.map(i -> i*1)
				.sorted(com)
				.distinct();
		a.forEach(i -> System.out.println(i));

	}

}
