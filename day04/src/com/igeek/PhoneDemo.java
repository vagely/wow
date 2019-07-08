package com.igeek;

public class PhoneDemo {
	public static void main(String[] args) {
		//创建对象
		Phone p=new Phone();
		//输出成员变量
		System.out.println("品牌："+p.brand);
		System.out.println("价格："+p.price);
		System.out.println("颜色："+p.color);
		System.out.println("**********");
		
		//给成员变量赋值
		p.brand="华为Mate10";
		p.price=3999;
		p.color="红";
		//再次输出成员变量
		System.out.println("品牌："+p.brand);
		System.out.println("价格："+p.price);
		System.out.println("颜色："+p.color);
		System.out.println("**********");
		
		//调用成员方法
		p.call("黄宗泽");
		p.sendMessage();
		
	}

}
