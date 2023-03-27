package com.lms;

public class UseSportShoe {
	public static void main(String[] args) {
		SportShoe shoe=new SportShoe();
		shoe.price=Integer.parseInt(args[0]);
		shoe.color=args[1];
		shoe.discountAmount=Integer.parseInt(args[2]);
		shoe.netprice=shoe.price-shoe.discountAmount;
		System.out.println("COLOUR: "+shoe.color+"  ,NET PRICE:"+shoe.netprice);
		
		
	}

}


 class SportShoe {
	int price;
	String color;
	int discountAmount;
	int netprice;
}
