package com.lms;

public class Usebottle {
	public static void main(String[]args) {
		String[]a=args[0].split(",");
		Bottle b1=new Bottle();
		b1.brand=a[0];
		b1.price=Integer.parseInt(a[1]);
		b1.colour=a[2];
		b1.isMattel=Boolean.parseBoolean(a[3]);
		b1.tax=Integer.parseInt(a[4]);
		b1.netprice=b1.price+b1.tax;
		String num=b1.brand+b1.colour;
		char re=b1.brand.charAt(0);
		System.out.println("brand="+b1.brand+"mattel="+b1.isMattel+
				"net price="+b1.netprice+"  ,length"+num.length()+"   ,letter="+re);
		
	}
}
 


class Bottle {
	 String brand;
	 int price;
	 String colour;
	 boolean isMattel;
	 int netprice;
	 int tax;

}
