package org.java;
import java.util.*;

public class Reverse {

	public static void main(String[] args) {
		int num = 123;
		System.out.println("Given Number: "+num);
		int rem, resultNo = 0;
		while(num>0){
			rem = num%10;
			resultNo = (resultNo*10) + rem;
			num = num/10;
		}
		System.out.println("Reversed Number: "+resultNo);
		
		String str = "Karunakaran";
		String resultString = "";
		for(int i=str.length()-1;i>=0;i--){
			resultString+=str.charAt(i);
		}
		System.out.println("Given String: "+str);
		System.out.println("Reversed String: "+resultString);
		
		int[] arr = {1,2,1,0};
		System.out.print("Given Array: ");
		for(int i : arr) {
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.print("Reversed Array: ");
		for(int i=arr.length-1;i>=0;i--) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		List<Integer> l = new LinkedList<Integer>();
		l.add(1); l.add(2); l.add(0);
		System.out.println("Given List: "+l);
		Collections.reverse(l);
		System.out.println("Reversed List: "+l);
		
		Set<String> set = new HashSet<>();
		set.add("1");
		set.add("2");
		set.add("3");
		System.out.println("Given Set: "+set);
		System.out.print("Reversed Set: ");
		List<String> list = new ArrayList<>(set);
		Collections.reverse(list);
		Set<String> result = new LinkedHashSet<>(list);
		for (String item: result) {
		    System.out.print(item+" ");
		}
		System.out.println();
		
		Map<String, String> map = new LinkedHashMap<String, String>();
		Map<String, String> resultMap = new LinkedHashMap<String, String>();
		map.put("a", "1");
		map.put("c", "1");
		map.put("b", "2");
		map.put("c", "41");
		System.out.println("Given Map: "+map);
	    List<String> li = new ArrayList<String>(map.keySet());
	    Collections.reverse(li);
	    for(String i : li) {
	    	resultMap.put(i, map.get(i));
	    }
	    System.out.println("Reversed Map: "+resultMap);
	}

}
