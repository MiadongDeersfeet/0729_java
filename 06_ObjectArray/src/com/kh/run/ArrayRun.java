package com.kh.run;

import java.util.Scanner;

import com.kh.model.vo.Restaurant;

public class ArrayRun {

	public static void main(String[] args) {
		
		// �迭�� Ư¡   <=  �ڷᱸ���� ���ؼ� ����� �Ŵϱ�
		//
		// ������ ������ �������� ������ �����ϴ�.   <=  �̰� ���� ���� ���;��մϴ�.
		// ���� �ڷ��������� ���� �� �ִ� => ���� ����(homogeneous vowels)
		// �ϳ��� �迭�� ���� ���� ���� �� ����
		// �޸𸮻� ����
		// �����ڷ���
		// �ε��������� ������
		// ��Ȯ�� ũ�⸦ ����ؾ��� => ũ�⸦ �ٲٴ� ���� �Ұ�����
		
//		int[] nums = new int[3];   //<= ó�� ����� ���
//		int[] num = {1, 2, 3, 4};    //<= �Ϲ����� �迭 �����
//		String[] strs = new String[5];
		
		// �ڹٿ��� �⺻�ڷ����� ������ ��������
		// ���� �����ڷ���
		// �����ڷ��� ������ ���Ե� �� �ִ� ���� ������ ��.��.��

		// ��ü�迭�� ���� �� �Ҵ�!
		// [ ǥ���� ]
		// �����ڷ���[] �迭�ĺ��� = new �����ڷ���[�迭ũ��];             <= �Ȱ��ƿ�. Ŭ������ --> �����ڷ������� �ٲ� ���̾�.
		
		Restaurant[] restaurants = new Restaurant[3];   // <= ���߿� ���⼭ �ε��� ���ڸ� �ø��� ������ �ڵ带 ���� �ʿ� ���� Ȯ���� �����մϴ�. Ȯ�强�� �ſ� ���������ϴ�.
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < restaurants.length; i++) {
			System.out.print("��ȣ���� �Է��ϼ��� > ");
			String storeName = sc.nextLine();
			
			System.out.print("�ּ����� �Է��ϼ��� > ");
			String address = sc.nextLine();
			
			System.out.print("��ǥ�޴��� �Է��ϼ��� > ");
			String mainMenu = sc.nextLine();
			
			restaurants[i] = new Restaurant(storeName, address, mainMenu);

		}
	/*	System.out.println(restaurants);
		System.out.println(restaurants[0]);
		// �ּҰ��� Ȯ���ϰ� �;��� ���� �ƴ�
		System.out.println(restaurants[0].getMainMenu());
		
		System.out.println(restaurants[0].info());
		System.out.println(restaurants[1].info());
		System.out.println(restaurants[2].info());
	*/	
		for(int i = 0; i < restaurants.length; i++) {
			System.out.println(restaurants[i].info());	
		}  // <== �����¡
		
		System.out.print("��ȣ���� �Է����ּ��� > ");
		String searched = sc.nextLine();
		
		for(int i = 0; i < restaurants.length; i++) {
			if(searched.equals(restaurants[i].getStoreName())) {
				System.out.println("��ǥ �޴� : " + restaurants[i].getMainMenu());
			}
		}
	
		
		
		
		
		
		
		
		
	}

}
