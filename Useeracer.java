package com.lms;

public class Useeracer {
	public static void main(String[] args) {
		String[]a=args[0].split(",");
		Eracer era=new Eracer();
		era.brand=a[0].toUpperCase();
		era.price=Integer.parseInt(a[1]);
		era.quality=Boolean.parseBoolean(a[2]);
		int len=a[0].length();
		char letter=era.brand.charAt(1);
		System.out.println("brand-"+era.brand+"price-"+era.price+"quality-"+era.quality+"length-"+len+"second letter-"+letter);
	}
}









class Eracer {
	String brand;
	int price;
	boolean quality;
}
