package com.lms;

public class Addnumbersplit {
	public static void main(String[] args) {
		String a[]=args[0].split(":");
		int num1=Integer.parseInt(a[0]);
		int num2=Integer.parseInt(a[1]);
		System.out.println(num1+num2);
	}

}
