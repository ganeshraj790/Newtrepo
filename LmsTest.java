package com.lms;

public class LmsTest {
	public static void main(String[] args) {
		String a[]=args[0].split(",");
		String name=a[0];
		int num=Integer.parseInt(a[1]);
		float num1=Float.parseFloat(a[2]);
		boolean result=Boolean.parseBoolean(a[3]);
		long value=Long.parseLong(a[4]);
		System.out.println(name);
		System.out.println(num);
		System.out.println(num1);
		System.out.println(result);
		System.out.println(value);
	}

}
