package org.java;

public class StringCompare {
	public static void main(String[] args) {
		String s = "abcd";
		System.out.println(System.identityHashCode(s));
		String s1 = "abcd";
		System.out.println(System.identityHashCode(s1));
		boolean s3 = s==s1;
		System.out.println("==: "+s3);
		boolean s4 = s.equals(s1);
		System.out.println("equals: "+s4);
		s = s.concat(s1);
		System.out.println(System.identityHashCode(s));
		System.out.println();
		
		System.out.println("compare: "+s.compareTo(s1));
		System.out.println("compare: "+s.compareTo("a"));
		System.out.println("compare: "+s.compareTo("ab"));
		System.out.println("compare: "+s.compareTo("b"));
		System.out.println("compare: "+s.compareTo("c"));
		System.out.println("compare: "+s.compareTo("z"));
		System.out.println("compare: "+s.compareTo("$"));
		System.out.println("compare: "+s.compareTo("A"));
		System.out.println();
		System.out.println("compare: "+("a").compareTo(s));
		System.out.println("compare: "+("ab").compareTo(s));
		System.out.println("compare: "+("b").compareTo(s));
		System.out.println("compare: "+("c").compareTo(s));
		System.out.println("compare: "+("z").compareTo(s));
		System.out.println("compare: "+("$").compareTo(s));
		System.out.println("compare: "+("A").compareTo(s));
		System.out.println();
		
		String ss = new String("abcd");
		System.out.println(System.identityHashCode(ss));
		String ss1 = new String("abcd");
		System.out.println(System.identityHashCode(ss1));
		ss = ss.concat(ss1);
		System.out.println(System.identityHashCode(ss));
		boolean ss3 = ss==ss1;
		System.out.println("==: "+ss3);
		boolean ss4 = ss.equals(ss1);
		System.out.println("equals: "+ss4);
		
		System.out.println();
		
		StringBuffer build = new StringBuffer("abcd");
		System.out.println(System.identityHashCode(build));
		StringBuffer build2 = new StringBuffer("abcd");
		System.out.println(System.identityHashCode(build2));
		
		boolean build4 = build==build2;
		System.out.println("==: "+build4);
		
		boolean build5 = build.toString().equals(build2.toString());
		System.out.println("equals: "+build5);
		
		boolean build6 = build.equals(build2);
		System.out.println("equals: "+build6);
		
		build = build.append(build2);
		System.out.println(System.identityHashCode(build));
		
	}

}
