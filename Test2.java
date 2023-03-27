package com.lms;

public class Test2 {
	public static void main(String[] args) {
		String a=args[0];
		String b=args[1];
		System.out.println(a.toUpperCase());
		System.out.println(a.concat(b));
		System.out.println(a.equals(b));
		System.out.println(a.length());
		System.out.println(a.charAt(0));
		System.out.println(b.toUpperCase());
		System.out.println(a.startsWith("G"));
		System.out.println(a.indexOf("h"));
		System.out.println(a.substring(0,3));
	}

}
