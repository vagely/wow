package igeek;

import java.util.ArrayList;
import java.util.Scanner;

public class Smanage {
	
	public static void main(String[] args) {
		ArrayList<Student> arr = new ArrayList<>(); 
		while(true) {
		System.out.println("---��ӭ����ѧ������ϵͳ----");
		System.out.println("1:�鿴����ѧ��");
		System.out.println("2:���ѧ��");
		System.out.println("3:ɾ��ѧ��");
		System.out.println("4:�޸�ѧ��");
		System.out.println("5:�˳�");	
		Scanner scanner=new Scanner(System.in);
		System.out.println("���������ѡ��");
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
		    //�˳�
		    default:
		    	System.out.println("�������");
		    	System.exit(0);
		    	break;	
	        }
		}
	}
	public static void findStudent(ArrayList<Student> arr) {
		if(arr.size()==0) {
			System.out.println("������˼��Ŀǰ��û��ѧ����Ϣ���Բ�ѯ");
			return;
		}
		System.out.println("ѧ��\t����\t�Ա�\t����");
		for(int i=0;i<arr.size();i++) {
			Student s=arr.get(i);
			System.out.println(s.getSno()+"\t"+s.getName()+"\t"+s.getSex()+"\t"+s.getAge());
           		
		}
	}
	public static void addStudent(ArrayList<Student> arr) {
		Scanner sc = new Scanner(System.in);
		String sno;
		while(true) {
			System.out.println("������ѧ�ţ�");
			sno=sc.nextLine();
			boolean flag = false;
			for(int i=0;i<arr.size();i++) {
				Student s = arr.get(i);
				if(s.getSno().equals(sno)) {
					flag=true;
					break;
				}
			}if(flag) {
				System.out.println("��������˺ű�ռ�ã�����");
			}else {
				break;
			}
		}
		System.out.println("������������ ");
		String name =sc.nextLine();
		System.out.println("�������ձ� ");
		String sex =sc.nextLine();
		System.out.println("���������䣺 ");
		String age =sc.nextLine();
	//��������
		Student s = new Student();
		s.setSno(sno);
		s.setName(name);
		s.setSex(sex);
		s.setAge(age);
		//��ѧ��������ӵ�����
		arr.add(s);
		System.out.println("���ѧ���ɹ�");
		}
	public static void deleteStudent(ArrayList<Student> arr) {
		Scanner sc=new Scanner(System.in);
		System.out.print("������Ҫɾ����ѧ�ţ�");
		String dsno=sc.nextLine();
		int index=-1;
		for (int i = 0; i < arr.size(); i++) {
			Student s =arr.get(i);
			if(s.getSno().equals(dsno)) {
				index=i;
			}
			if(index==-1) {
				System.out.println("��Ҫɾ����ѧ�������ڣ�������ѡ��");
			}else {
				arr.remove(index);
				System.out.println("ɾ��ѧ���ɹ�����");
			}
			
		}
	}
	public static void changeStudent(ArrayList<Student> arr) {
		Scanner sc=new Scanner(System.in);
		System.out.print("��������Ҫ�޸ĵ�ѧ�ţ�");
		String csno=sc.nextLine();
		int index =-1;
		for(int i=0;i<arr.size();i++) {
			Student s = arr.get(i);
			if(s.getSno().equals(csno)) {
				index=i;
			}
		}
		if(index==-1) {
			System.out.println("��Ҫ�޸ĵ�ѧ�������ڣ�������ѡ��");
		}else {
			System.out.println("�������������� ");
			String name =sc.nextLine();
			System.out.println("���������ձ� ");
			String sex =sc.nextLine();
			System.out.println("�����������䣺 ");
			String age =sc.nextLine();
			
			Student s = new Student();
			s.setSno(csno);
			s.setName(name);
			s.setSex(sex);
			s.setAge(age);
			//��ѧ��������ӵ�����
			arr.set(index,s);
			System.out.println("�޸�ѧ���ɹ�����");
		}
	}

}


