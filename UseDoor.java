package com.lms;

public class UseDoor {
	public static void main(String[] args) {
		Door door=new Door();
		String[]a=args[0].split(",");
		door.color=a[0].toUpperCase();
		door.materialtype=a[1].toUpperCase();
		door.issmarttype=Boolean.parseBoolean(a[2]);
	String result =a[0]+a[1];
	int re=result.length();
		System.out.println("COLOR="+door.color+",MATERIAL TYPE="+door.materialtype+",SMART LOCK TYPE="+door.issmarttype+",TOTAL LENGTH="+re);
	}

}





class Door {
	String color;
	String materialtype;
	boolean issmarttype;
}
