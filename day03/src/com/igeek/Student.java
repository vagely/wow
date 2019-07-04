package com.igeek;


public class Student  {
	
	
	 String name;
	int age; 
	public Student() {
		super();
		System.out.println("student");
	}
	public Student(String name,int age) {
		super();
		this.name=name;
		this.age=age;
	}

	public void eat() {
		System.out.println("Student eat");
	}

	public static void main(String[] args) {
		Student student=new Student();
		student.eat();
		
//		¶àÌ¬
//		Person person = new Student();
//		person.eat();
	}
}
