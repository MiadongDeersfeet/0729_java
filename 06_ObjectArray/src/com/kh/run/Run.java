package com.kh.run;

import java.util.Scanner;

import com.kh.model.vo.Restaurant;

public class Run {

	public static void main(String[] args) {
		
		//Restaurant r1 = new Restaurant();
		//System.out.println(r1.info());
		
		// 1��
		// ����ڷκ��� �Ĵ��� ������ �Է¹޾Ƽ�
		// �Է¹��� �Ĵ��� ������ ������ִ� ���α׷�
		// 3���� �Ĵ������� �Է¹ްڴٰ� ����
		
		
		Scanner sc = new Scanner(System.in);
		//Restaurant r = new Restaurant(storeName, address, mainMenu);  // <= �Ű����� ����, �ʵ忡 �����ϰ� ���� ����, �ڷ����� ��ġ�ؾ��մϴ�.
		Restaurant r0 = null;
		Restaurant r1 = null;
		Restaurant r2 = null;
		
		for(int i = 0; i < 3 ; i++) {
		
		System.out.print("�Ĵ��� ��ȣ�� �Է����ּ��� > ");
		String storeName = sc.nextLine();
		
		System.out.print("�Ĵ��� �ּҸ� �Է����ּ��� > ");
		String address = sc.nextLine();
		
		System.out.print("�Ĵ��� ���θ޴��� �Է����ּ��� > ");
		String mainMenu = sc.nextLine();
		
		if(i == 0) {
			r0 = new Restaurant(storeName, address, mainMenu);
		} else if(i == 1) {
			r1 = new Restaurant(storeName, address, mainMenu);
		} else {
			r2 = new Restaurant(storeName, address, mainMenu);
		}
		
		}	
		
		System.out.println(r0.info());
		System.out.println(r1.info());
		System.out.println(r2.info());
		
		// 1�� setter ȣ��
				// 2�� ������ �Ű������� ���ڰ��� ����
	/*	
		System.out.print("�Ĵ��� ��ȣ�� �Է����ּ��� > ");
		String storeName2 = sc.nextLine();
		
		System.out.print("�Ĵ��� �ּҸ� �Է����ּ��� > ");
		String address2 = sc.nextLine();
		
		System.out.print("�Ĵ��� ���θ޴��� �Է����ּ��� > ");
		String mainMenu2 = sc.nextLine();
		
		Restaurant r2 = new Restaurant(storeName2, address2, mainMenu2);
		
		System.out.print("�Ĵ��� ��ȣ�� �Է����ּ��� > ");
		String storeName3 = sc.nextLine();
		
		System.out.print("�Ĵ��� �ּҸ� �Է����ּ��� > ");
		String address3 = sc.nextLine();
		
		System.out.print("�Ĵ��� ���θ޴��� �Է����ּ��� > ");
		String mainMenu3 = sc.nextLine();
		
		Restaurant r3 = new Restaurant(storeName3, address3, mainMenu3);
		
		System.out.println(r.info());
		System.out.println(r2.info());
		System.out.println(r3.info());
	*/
		// 2��
				// ����ڿ��� ��ȣ���� �Է� �޾Ƽ�
				// �Է¹��� ��ȣ�� ��ġ�ϴ� �Ĵ��� ���θ޴��� ������ִ� ���α׷�
		
		System.out.println("");
		System.out.print("���Ը��� �Է����ּ��� > ");
		String searched = sc.nextLine();
		if(searched.equals(r0.getStoreName())) {
			System.out.println("���θ޴� : " + r0.getMainMenu());
		}
		
		if(searched.equals(r1.getStoreName())) {
			System.out.println("���θ޴� : " + r1.getMainMenu());
		}
		
		if(searched.equals(r2.getStoreName())) {
			System.out.println("���θ޴� : " + r2.getMainMenu());
		}
		
		
		
		
		
	}

}
