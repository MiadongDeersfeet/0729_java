package com.kh.chap02.encapsulation.run;

import com.kh.chap02.encapsulation.model.vo.Cafe;

public class Run {

	public static void main(String[] args) {
		
		// ĸ��ȭ (encapsulation)
		// �Ӽ�(������)�� �ش� �����͸� �����ϴ� �ൿ(�޼ҵ�)�� �ϳ��� ������ ���� �� => ��� �̸��� �ٿ�����
		// ��������(information hiding)     <=  �ΰ������� �ٴ� ��
	
		// ���������� (�����) ��ȯ�� �޼ҵ�ĺ���(�Ű�����){	}
		
		//new �ϸ� �̹� �ö󰡴� �ſ���~! ��ü ����� �ſ���.
		/*new Cafe().cleaning(); // ������ �ּҰ��� �Ǵ� �ſ���. �����ʿ� ������ �� �ִ� �ſ���. // �̷��� ���� ��ȸ���̶� �ǹ̶� �� �� ���� G.C�� �ͼ� �����ع����ϴ�.*/
		
		// �������� ���Կ����� ��ü ���� == �޸𸮿� ����
		Cafe cafe = new Cafe();
		// ��ü�� ��ü ������ ������ ������ �𸣸� �𸦼��� ���� �˸� �˼��� ���� ��Ĩ�ϴ�.
		
		/*
		cafe.name = "KHī��"; // not visible �� �Ⱥ��δ� == �ܺο��� ������ �Ұ����ϴٴ� �ǹ�
		System.out.println(cafe.name);
		cafe.signatureMenu = "KHĿ��";
		cafe.signatureMenuPrice = -500; // ���̷�Ʈ�� ���� ����־��� ����****
		System.out.println(cafe.signatureMenu);
		System.out.println(cafe.signatureMenuPrice);
		*/
		
		// �ʵ尡 ������ �ʾƼ�(�ܺο��� ������ �Ұ����ؼ�) ���� �߻�!
		// ���������ڸ� public ���� private���� �����߱� ������ ���� ������ �Ұ��� 
		// ���� ������ �Ұ����ϱ� ������ ���������� ������ �� �ִ� ����� ������־�� ��
		// Cafe��� Ŭ������ getter / setter ��� �޼ҵ� �����
		// cafe.signatureMenuPrice = - 500;
		
		// *** ��ü�� ������ ���� / �ܺ��� ����
	//	cafe.dishWash(); // ī�� Ŭ������ �ش� �޼ҵ带 �����ߴ��� �� Ŭ�������� ������ ����. 
	//	cafe.cleaning();
	//	cafe.windowCleaning();
	//	cafe.open();
		// 5000
		// �޼ҵ� ȣ�� �ο����� ������ ���� �ѱ� �� ����
		cafe.setSignatureMenuPrice(5000); // ���� �ѱ�� ���� ��������.... // ��ȣ �ȿ� ���� ���ڰ� �ƱԸ�Ʈ/??? // ȣ���ϴ� �̰����� ���̰�, �޼���ο����� ��������.
		//System.out.println("���θ޼��忡�� �� cafe�� �ּ� : " + cafe);
		
		cafe.setName("�Ҽ��÷��̽�"); //���� ���ڰ�--��Ʈ���̴� ���ڿ��� �Ѱܾ���.
		cafe.setAddress("����� �߱� ���빮�� 120 �׷�����û�� 2��"); // ���ڰ�--���ڿ��� �Ѱܾ���.
		
		cafe.getName();
		String cafeName = cafe.getName(); // Cafe Ŭ���� getter ���� ���ϵ� ���� ���׿� �����ְ� ���� cafeName �� �����ϰ� ���� ����. // ���������δ� ������ �����ʵ尪 , �޼��� ȣ������.
		System.out.println(cafeName); // ��¹��� ����ϴµ� ������ �ȸ��� ����� �ȵƱ��� !
		/* System.out.print(cafe.getName()); // ���� �Ⱦ��� �̷��� �ص� �ǳ�~~~ */
		
		cafe.getAddress(); // 1. �ּ� ã�ư��� cafe --> 2. ���������� --> 3. ����!! get --> �� --> ();
		String cafeAddress = cafe.getAddress();
		System.out.println(cafeAddress);
		
		cafe.getSignatureMenuPrice();
		int signatureMenuPrice = cafe.getSignatureMenuPrice();
		System.out.println("�ñ״�ó �޴��� ���� : " + signatureMenuPrice + "��");
		
		cafe.info();
		String info = cafe.info();
		System.out.println(info);
		
		
		
		
		}
	
	
}
