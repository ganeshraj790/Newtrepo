package com.lms;

public class UsePen {
	public static void main(String[] args) {
		String[]a=args[0].split(",");
		Pen pen=new Pen();
		pen.brand=a[0].toUpperCase();
		pen.price=Integer.parseInt(a[1]);
		pen.isInk=Boolean.parseBoolean(a[2]);
		System.out.println(pen.brand+","+pen.price+","+pen.isInk);
		
		
		
		
		String[]b=args[1].split(",");
		Pen pen1=new Pen();
		pen1.brand=b[0];
		pen1.price=Integer.parseInt(b[1]);
		pen1.isInk=Boolean.parseBoolean(b[2]);
		System.out.println("Brand= "+pen1.brand+",Price= "+pen1.price+",Ink= "+pen1.isInk);
		if(pen.price>pen1.price) {
			System.out.println("pen is high");
		}
		else {
			System.out.println("pen2 is high");
		}
		
	}

}



class Pen {
	String brand;
	int price;
	boolean isInk;
}
