package org.java;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortAscending {

	public static void main(String[] args) {
		 Comparator<Integer> com = (i,j) -> i%10<j%10?-1:1;
		 String str = "Karunakaran";
		 String result = "";
		 char[] c = str.toCharArray();
		 Arrays.sort(c);
		 for(char i : c) {
			 result+=i;
		 }
		 System.out.println("Given String: "+str);
		 System.out.println("String Ascending Order: "+result);
		 
		 int a[] = {130,1,25,5,25,50};
		 System.out.println("Given Array: "+Arrays.toString(a));
		 Arrays.sort(a);
		 System.out.println("Array Ascending Order: "+Arrays.toString(a));
		 
		 List<Integer> l = Arrays.asList(80,42,45,74);
		 System.out.println("Given List: "+l);
		 Collections.sort(l);
		 System.out.println("List Ascending Order: "+l);
		 Collections.sort(l, com);
		 System.out.println("List Ascending Order based on second value: "+l);

	}

}
