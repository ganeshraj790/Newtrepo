package com.lms;

public class Bignumber {
	public static void main(String[]args) {
		String a=args[0];
		String b=args[1];
		String c=args[2];
		int d=Integer.parseInt(args[0]);
		int e=Integer.parseInt(args[1]);
		int f=Integer.parseInt(args[2]);
		if(d>e&&d>f) {
			System.out.println("Higher number is"+d);
		}
		else if(e>d&&e>f) {
			System.out.println("Higher number is"+e);	
		}
		else {
			System.out.println("Higher number is"+f);
		}
	}

}
