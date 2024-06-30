package org.java;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortDescending {

	public static void main(String[] args) {
		 
		 Comparator<Integer> com = (i,j) -> i%10<j%10?1:-1;
		 String str = "Karunakaran";
		 String result = "";
		 char[] c = str.toCharArray();
		 Arrays.sort(c);
		 for(int i=c.length-1;i>=0;i--) {
			 result+=c[i];
		 }
		 System.out.println("Given String: "+str);
		 System.out.println("String Decending Order: "+result);
		 
		 int a[] = {130,1,25,5,25,50};
		 int temp;
		 System.out.println("Given Array: "+Arrays.toString(a)+"\nArray Decending Order: ");
		 for(int i=0;i<a.length-1;i++) {
			 for(int j=i+1;j<a.length;j++) {
				 if(a[i]<a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				 }
			 }
		 }
		 for(int i : a) {
			 System.out.print(i+" ");
		}
		 System.out.println();
		 
		 int arr[] = {130,1,25,5,25,50};
		 int brr[] = new int[a.length];
		 System.out.println("Given Array: "+Arrays.toString(arr));
		 Arrays.sort(arr);
		 for(int i=arr.length-1;i>=0;i--) {
			 brr[(arr.length-1)-i] = arr[i];
		 }
		 System.out.println("Array Decending Order: "+Arrays.toString(brr));
		 
		 List<Integer> l = Arrays.asList(80,42,45,74);
		 System.out.println("Given List: "+l);
		 l.sort(Collections.reverseOrder());
		 System.out.println("List Decending Order: "+l);
		 //Collections.sort(l, com);
		 //System.out.println("List Decending Order using Comparator: "+l);


	}

}
