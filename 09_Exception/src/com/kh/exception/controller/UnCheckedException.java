package com.kh.exception.controller;

import java.util.InputMismatchException;
import java.util.Scanner;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;

public class UnCheckedException {
	/*
	 * ���α׷� ���� �� �߻��ϴ� ���ܵ��� ��κ� �����Ϸ��� üũ �������.	
	 * ��׵��� ��� RuntimeException �̶�� �մϴ�.
	 * 
	 * - NullPointerException : �ּҰ� ��ü�� �����ߴ��� �ּҰ��� �ȵ���ְ� null ���� ������� ��� �߻��ϴ� ���� (NPE)
	 * - ArrayIndexOutOfBoundsException : �迭�� �������� �ε����� �������� �� �߻��ϴ� ����
	 * - ClassCastException : ����� �� ���� ����ȯ�� ������ ��� �߻��ϴ� ����
	 * - ArithmeticException : ������ ������ 0���� ������ �߻��ϴ� ���� / by zero
	 * - NegativeArraySizeException : �迭�� �Ҵ��� �� ũ�⸦ ������ �����ϸ� �߻��ϴ� ����
	 * ... �ص� ���� ��� �� �� ���� �����.
	 * 
	 * 
	 * RuntimeException�� ���õ� ���ܵ��� �������� ����
	 * -> �����ڰ� ������ ������
	 */
	
	// ArithmeticException : ������ ���� 0����  �����
	public void method1() {
		// ����ڿ��� �� ���� �������� �Է¹޾Ƽ� �������� �� �� ����� ���
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ù ��° ������ �Է����ּ��� > ");
		int num1 = sc.nextInt();
		System.out.println("�� ��° ������ �Է����ּ��� > ");
		int num2 = sc.nextInt();
		
		/*
		// ��� 1. ���ܹ߻� ��ü�� ��õ �����ع��� (������ ���ڰ� �ƴ϶� �ѱ� ������ ���! ���ܰ� �ִٰ�)
		if(num2 != 0) {
		System.out.println("���� ��� : " + (num1 / num2));
	} else {
		System.out.println("�̳� ȥ�ٳ� ����ͳ�?");
	}
	*/
		// ��� 2. ����ó���� ����    <= �������� : ���ܶ�� �� ���� �� �����.
		// ����ó�� :								     // ���ܰ� �Ͼ�� ���α׷��� ���������.
		// ���ܻ�Ȳ�� �����ϰ� ���ܻ�Ȳ �߻� ��
		// ���α׷��� ���������� ���ᰡ �Ǵ� ���� �����ϰ� ������ ���� ��ġ�� ���ϴ� ��. 
		
		/*
		 * try ~ catch�� 
		 * 
		 * [ ǥ���� ]
		 * 
		 * try {
		 * 
		 * 		(num1 / num2) // ���ܰ� �߻��� ���� �ִ� ���� <= ���ܰ� �߻��� ������ ���� �����̶� ������ ������ Ʈ���̹��� �ֽ��ϴ�.
		 * 
		 * } catch(�߻��� ���� Ŭ������ ������) { => �Ű�����
		 * 
		 * 		�ش� ���ܰ� �߻����� �� ������ ����
		 * 
		 * }
		 * 
		 * 
		 */
		
		try {
			
		System.out.println(num1 / num2);
		
		System.out.println("�ùٸ� ���� �Է�!"); // ���� ��¹����� ���ܰ� �߻��ߴ�. �׷��� ���⸦ �ǳʶٰ� �ٷ� ĳġ�� �̵��մϴ�.
		
		} catch(ArithmeticException e) {
			
		System.out.println("�� ��° ������ 0�� �Է��Ͻø� ���� ���� �����ϴ�.");
		}
		
		System.out.println("���α׷� ����");
	
	
	
	}
	
	public void homeWork() {
		Scanner sc = new Scanner(System.in);
		while(true) {
			
			System.out.println("�޴��� �������ּ���");
			System.out.println("1. �߰��ϱ�");
			System.out.println("2. �˻��ϱ�");
			
			int menuNo = 0;
			try {
				menuNo = sc.nextInt();
			} catch(InputMismatchException e) {
			System.out.println("���ڸ� �־� �̳��");
			
			// ����ó�� �� catch���� ������ϴ� ������ ��¹��� �ƴ�
		}
		sc.nextLine();
			System.out.println(menuNo + "�� �޴��� �����ϼ̽��ϴ�.");
	}
	}
	
	public void method2() { // ���� �ٸ� ������ ���� �� ���� �Ͼ �� �ִ� ��Ȳ
		
		//System.out.println("����");
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �Է����ּ���(0�� ����) > ");
		try {
		int num = sc.nextInt();
		// InputMismatchException
		
		System.out.println("100�� �Է°����� ���� ��� : " + (100 / num));
		// ArithmeticException
		} catch(InputMismatchException e) { //1. ���� �Է¹��� ���� �������� �Ǵ�
			System.out.println("���ڷ� �� �������� �ƴմϴ�.");
		} catch(ArithmeticException e) {	
			System.out.println("0�� �ȵſ�!!");
		}
		System.out.println("���α׷� ����");
		
	}
	
	public void method3() {
		// �迭
		
		Scanner sc = new Scanner(System.in);
		// ����ڿ��� �������� �Է� �޾Ƽ�
		// �Է¹��� ��ŭ�� ũ�⸦ ���� �迭�� ���� �� �Ҵ��ϰ�
		// 100��° �ε��� ���� ���
		
		
		//InputMismatchException : ��ĳ�� �޼ҵ��� �ڷ����� ��ġ���� ������ �ľ�
		//NegativeArraySizeException : �迭�� ũ�⸦ ������ �����ϸ� �ľ�
		//ArrayIndexOutOfBoundException : �迭�� ũ�⺸�� ū �ε����� �����ϸ� �ľ�
		int num = 0;
		System.out.println("�������� �Է��ϼ��� > ");
		try {
		num = sc.nextInt();
		String[] arr = new String[num];
		System.out.print(arr[100]);
		
		} catch(InputMismatchException e) {
			e.printStackTrace(); // ��� �� ���ߴܰ迡����, ������ ���ֱ�
			System.out.println("������ �־��");
	//	} catch(NegativeArraySizeException e) {
	//		
	//	} catch(ArrayIndexOutOfBoundsException e) {
	//		
		} catch(RuntimeException e) {
			System.out.println("�Ƹ���...������ �Է��߰ų�...? 100���� ũ�� �ʾƼ�...?");
		}
	
		
	}
	
	
	
}
