package org.java;

public class StringAddNumber {
	public static void main(String[] args) {
		
	String input1 = "santos1234";
    int sum = 0;
    StringBuilder result1 = new StringBuilder();
    for (int i = 0; i < input1.length(); i++) {
        char c = input1.charAt(i);
        if (Character.isDigit(c)) {
            sum += Character.getNumericValue(c);
        } else {
        	result1.append(c);
        }
    }
    result1.append(sum);
    System.out.println("Input1 : "+input1);
    System.out.println("Output1: "+result1+"\n");
//  ------------------------------------------------------->
    String input2 = "ABC11CDE33";
	String str = "";
	StringBuilder result2 = new StringBuilder();
	int num = 0;
	for(int i=0;i<input2.length();i++) {
		char c = input2.charAt(i);
		if(Character.isDigit(c)) {
			int j = input2.indexOf(c);
			str = c+"";
			for(int k=j+1;k<input2.length();k++) {
				c = input2.charAt(k);
				if(Character.isDigit(c)) {
					str+=c;
					i++;
				}
				else {
					break;
				}
			}
			num = num + Integer.parseInt(str);
		}
		else{
			result2.append(c);
		}
	}
	result2.append(num);
	System.out.println("Input2 : "+input2);
	System.out.println("Output2: "+result2+"\n");
	
//  ------------------------------------------------------->
    String input3 = "ABC11CDE33";
    StringBuilder sb = new StringBuilder();
	StringBuilder result3 = new StringBuilder();
	for (int i = 0; i < input3.length(); i++) {
        char c = input3.charAt(i);
        if (Character.isDigit(c)) {
            sb.append(c);
        } else {
        	result3.append(c);
        }
    }
	result3.append(sb);
	System.out.println("Input3 : "+input3);
	System.out.println("Output3: "+result3+"\n");
	}
}