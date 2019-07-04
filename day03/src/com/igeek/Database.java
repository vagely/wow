package com.igeek;

import java.util.List;
import java.util.ArrayList;

public class Database {
	List<Cd> cds=new ArrayList<>();
	List<Dvd> dvds=new ArrayList<Dvd>();
	public void add(Cd cd) {
		cds.add(cd);	
	}
	public void add(Dvd dvd) {
		dvds.add(dvd);	
	}
	public void list() {
		for (Cd cd : cds) {
			cd.print();			
		}
		for (Dvd dvd : dvds) {
			dvd.print();			
		}
	}
	public static void main(String[] args) {
		Cd cd = new Cd();
		System.out.println(cd);
		Database database=new Database();
		database.add(new Cd("����","�ܰغ�"));
		database.add(new Cd("�������","����Ѹ"));
		database.add(new Cd("ȫ����ʧ��","����Ѹ"));
		database.list();
		
	}
	

}
