package com.igeek;

public class PhoneDemo {
	public static void main(String[] args) {
		//��������
		Phone p=new Phone();
		//�����Ա����
		System.out.println("Ʒ�ƣ�"+p.brand);
		System.out.println("�۸�"+p.price);
		System.out.println("��ɫ��"+p.color);
		System.out.println("**********");
		
		//����Ա������ֵ
		p.brand="��ΪMate10";
		p.price=3999;
		p.color="��";
		//�ٴ������Ա����
		System.out.println("Ʒ�ƣ�"+p.brand);
		System.out.println("�۸�"+p.price);
		System.out.println("��ɫ��"+p.color);
		System.out.println("**********");
		
		//���ó�Ա����
		p.call("������");
		p.sendMessage();
		
	}

}
