package com.kh.chap03.escape;

import java.util.Scanner;

public class A_Break {
	/*
	 * ** ���ǻ��� : switch�� ���ο� �ۼ��ϴ� break������ ������ �ؾ��� �ʿ䰡 ����!
	 * 				switch�� ���ο� �ִ� break�� switch���� ���������� �뵵�� ���
	 * 
	 * break : break���� ������ ���� "���� ����� �ݺ���"�� ��������
	 *		   break;���� ���� �ִ� �ݺ��� "�� ��"�� ��������!!!!! 
	 */

	public void method1() {

		
		
		// ���� �ݺ��ϸ鼭 ������ ����(1 ~ 100)�� �����ؼ� ����ϴٰ�
		// 50�� �����Ǹ� �ݺ��� �ߴ�!
		
		while(true) {
			
			int num = (int)(Math.random() * 100) + 1;
			
			System.out.println(num);
			
			// ������ �������� 50�̸� ����!
			if(num == 50) {
				System.out.println("����!");
				break;
				}
		
			} // break �� ������ �ڽ��� ���Ե� ���� ����� �ݺ��� ������ ������ �����ϴ�. ����� while���� ������
		
			
			
		}
		
	public void method2() {
		
		// ���� �ݺ��ϸ鼭 ����ڿ��� �� �� ���ڿ��� �Է¹��� ��
		// �ش� ���ڿ��� ���̸� ���
		// ��, ����ڰ� �Է��� ���ڿ��� "exit"�� ���ٸ� �ݺ��� ����
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("�ƹ��ų�����(���Ḧ ���ϽŴٸ� 'exit'�� �Է����ּ���) > ");
			String keyword = sc.nextLine();
			
			System.out.println(keyword + "��(��) " + keyword.length() + "���� �Դϴ�!");
			
			if(keyword.equals("exit")) {
				System.out.println("�ķα������� �����մϴ�~");
				break;
			}
		}
		/*while(true) {
		System.out.println("���ڸ� �Է��ϼ��� > ");
		int num = sc.nextInt();
		//System.out.println(num);
		if(num < 0) {
			System.out.print("���α׷��� �����մϴ�.");
			break;
		}
		}*/
			
		//} // break Ż�ⱸ

		// �� �� ����ڷκ��� �������� �Է¹ް�
		// ���� �Է��� ���ڰ� 0���� �۴ٸ� "���α׷��� �����մϴ�."��� ������ ����ϰ� �����Ͻÿ�.
	
	}
	
	
	
	
	
	/*
	 * ����ڷκ��� �� ���� �������� �Է¹޾Ƽ�
	 * �Է¹��� ���ں��� 1������ ��� ���ڸ� ����غ��ƿ�.
	 * 
	 * ��, �Է¹޴� ������ 1���� Ŀ���մϴ�.
	 * 
	 * ���� 1�̸��� ���ڸ� �Է¹޾Ҵٸ� "1�̻��� ���ڸ� �Է����ּ���."��� ����� ��
	 * �ٽ� ����ڿ��� ���� �Է¹��� �� �ֵ��� �����ƿ�.
	 * 
	 * 
	 * ��� ���� )
	 * 1�̻��� ���ڸ� �Է��ϼ��� > 4
	 * 4 3 2 1
	 * 
	 * 1�̻��� ���ڸ� �Է��ϼ��� > -1
	 * 1�̻��� ���ڸ� �Է��ϼ���!!!!!!
	 * 1�̻��� ���ڸ� �Է��ϼ��� > 6
	 * 6 5 4 3 2 1
	 * 
	 */	

	public void method4() {
		
		Scanner sc= new Scanner(System.in);
		/*int num = sc.nextInt();
		int num1 = num - 3;
		int num2 = num - 2;
		int num3 = num - 1;
		
		while(true) {
		System.out.print("1�̻��� ���ڸ� �Է����ּ��� > ");
	
		//System.out.println(num);
	
		
		System.out.print(num);
		
		
		// 4�� �Է��ϸ� ������� 4 3 2 1 �� ���;��Ѵ�.
		
		if(num < 1) {
			System.out.println("�ڡڡ�1�̻��� ���ڸ� �Է��ϼ���!!!!!!�ڡڡ�");
		}
		}*/
	/*	
		while(true) {
		System.out.println("1���� ū ������ �Է��ϼ��� > ");
		int num = sc.nextInt();
		
		if(num >= 1) {
			for(int i = num; i > 0; i--) {
				System.out.print(i + " ");
		}
			System.out.println();
	} else { System.out.println("1�̻��� ���ڸ� �Է����ּ���.");
		
	}
	}
		*/
	
		int num = 0;
		
		do {
			
			System.out.print("1�̻��� ���ڸ� �Է��ϼ��� > ");
			num = sc.nextInt();
			if(num < 1) System.out.println("1�̻��� ���ڸ� �Է����ּ���.");
			
		} while(num < 1);
		
		for(; num > 0; num--) {
			System.out.print(num + " ");
		}
	}
}
