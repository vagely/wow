package igeek;

import java.util.ArrayList;
import java.util.Scanner;

public class Smanage {
	
	public static void main(String[] args) {
		ArrayList<Student> arr = new ArrayList<>(); 
		while(true) {
		System.out.println("---欢迎来到学生管理系统----");
		System.out.println("1:查看所有学生");
		System.out.println("2:添加学生");
		System.out.println("3:删除学生");
		System.out.println("4:修改学生");
		System.out.println("5:退出");	
		Scanner scanner=new Scanner(System.in);
		System.out.println("请输入你的选择");
		int t=scanner.nextInt();	
	switch(t){
		case 1:
			findStudent(arr);
			break;
		case 2:
			addStudent(arr);
			break;
		case 3:
			deleteStudent(arr);
			break;
		case 4:
			changeStudent(arr);
			break;
		case 5:
		    //退出
		    default:
		    	System.out.println("输出错误");
		    	System.exit(0);
		    	break;	
	        }
		}
	}
	public static void findStudent(ArrayList<Student> arr) {
		if(arr.size()==0) {
			System.out.println("不好意思，目前还没有学生信息可以查询");
			return;
		}
		System.out.println("学号\t姓名\t性别\t年龄");
		for(int i=0;i<arr.size();i++) {
			Student s=arr.get(i);
			System.out.println(s.getSno()+"\t"+s.getName()+"\t"+s.getSex()+"\t"+s.getAge());
           		
		}
	}
	public static void addStudent(ArrayList<Student> arr) {
		Scanner sc = new Scanner(System.in);
		String sno;
		while(true) {
			System.out.println("请输入学号：");
			sno=sc.nextLine();
			boolean flag = false;
			for(int i=0;i<arr.size();i++) {
				Student s = arr.get(i);
				if(s.getSno().equals(sno)) {
					flag=true;
					break;
				}
			}if(flag) {
				System.out.println("您输入的账号被占用！！！");
			}else {
				break;
			}
		}
		System.out.println("请输入姓名： ");
		String name =sc.nextLine();
		System.out.println("请输入姓别： ");
		String sex =sc.nextLine();
		System.out.println("请输入年龄： ");
		String age =sc.nextLine();
	//创建对象
		Student s = new Student();
		s.setSno(sno);
		s.setName(name);
		s.setSex(sex);
		s.setAge(age);
		//把学生对象添加到集合
		arr.add(s);
		System.out.println("添加学生成功");
		}
	public static void deleteStudent(ArrayList<Student> arr) {
		Scanner sc=new Scanner(System.in);
		System.out.print("请输入要删除的学号：");
		String dsno=sc.nextLine();
		int index=-1;
		for (int i = 0; i < arr.size(); i++) {
			Student s =arr.get(i);
			if(s.getSno().equals(dsno)) {
				index=i;
			}
			if(index==-1) {
				System.out.println("你要删除的学生不存在，请重新选择");
			}else {
				arr.remove(index);
				System.out.println("删除学生成功！！");
			}
			
		}
	}
	public static void changeStudent(ArrayList<Student> arr) {
		Scanner sc=new Scanner(System.in);
		System.out.print("请输入你要修改的学号：");
		String csno=sc.nextLine();
		int index =-1;
		for(int i=0;i<arr.size();i++) {
			Student s = arr.get(i);
			if(s.getSno().equals(csno)) {
				index=i;
			}
		}
		if(index==-1) {
			System.out.println("你要修改的学生不存在，请重新选择");
		}else {
			System.out.println("请输入新姓名： ");
			String name =sc.nextLine();
			System.out.println("请输入新姓别： ");
			String sex =sc.nextLine();
			System.out.println("请输入新年龄： ");
			String age =sc.nextLine();
			
			Student s = new Student();
			s.setSno(csno);
			s.setName(name);
			s.setSex(sex);
			s.setAge(age);
			//把学生对象添加到集合
			arr.set(index,s);
			System.out.println("修改学生成功！！");
		}
	}

}


