package com.igeek;

public class PhoneDemo02 {
	public static void main(String[] args) {
		Phone p=new Phone();
		p.brand="vivo";
		p.price=3999;
		p.color="²ÊÉ«";
		System.out.println(p.brand+"---"+p.price+"---"+p.color);
		System.out.println("---------");
		Phone p2=p;
		p2.brand="oppo";
		p2.price=2999;
		p2.color="°×É«";
		System.out.println(p.brand+"---"+p.price+"---"+p.color);
		System.out.println(p2.brand+"---"+p2.price+"---"+p2.color);
		
	}

}
