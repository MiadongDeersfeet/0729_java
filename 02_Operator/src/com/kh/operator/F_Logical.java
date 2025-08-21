package com.kh.operator;

import java.util.Scanner;


public class F_Logical {
/*
 * �� ������ : �� ���� ������ �����ϴ� �������Դϴ�.
 * 
 * [ ǥ���� ]
 * 
 * ���� �������� ���� => ������� ����
 * 
 * ����
 * 
 * 1. AND������ : ���� && ����
 * ���װ� ������ ���� ��� true���߸� ���� ������� true
 * 
 * 2. OR������ : ���� || ���� --> ������ ��ȭǥ�ø� ����Ʈ�� �Բ� ������ ������ ����������
 * ���װ� ������ �� �� �ϳ��� true�� ��� ���� ������� true
 */
// AND
	public void method1() {
		
		// ��ȹ
		//
		// 1. ����ڿ��� �������� �ϳ� �Է¹��� ��
		// 2. ����ڰ� �Է��� �������� 0���� ũ�鼭 ¦������ �Ǻ�
		// 3. �׸��� ���� ����� ���
		
		Scanner sc = new Scanner(System.in);
		
		// 1.
		System.out.println("���� ���� �Է����ּ��� > ");
		int num = sc.nextInt();
		System.out.println(num); //����ù��� �ؾ��� ��
		
		// 2.
		// ���� ��? == num
		// ���� ����??
		// 1. 0���� ū��(��Һ�) => num > 0
		// 2. ¦���ΰ�?(2�� ���� �������� 0�� ��ġ�ϴ°� => �����) (num % 2) == 0
		
		// AND ������
		// &&�� �ǹ� : �׸���, ~~�̸鼭, ~~�̰�
		
		boolean result = (num > 0) && (num % 2 == 0);
		// ����ڰ� �Է��� ������ 0���� ũ��(1) �׸���(3) ����ڰ� �Է��� ������ 2�� ������ �� �������� 0�ΰ���?(2)
		//System.out.println("���� �������� 10���� ũ�鼭 ¦���Դϱ�? > " + (num > 10 && num % 2 == 0)); /* ���� �ẻ �ڵ�
		System.out.println("���� �������� 10���� ũ�鼭 ¦���Դϱ�? > " + result);
		
	}
	
	public void method2() {
		
		// ����ڿ��� ���� ���� �Է¹޾Ƽ�
		// 1_1. ����ڰ� �Է��� ���� == number
		// 1_2. 1
		// 1_3. 100
		
		// 1 <= number <= 100 // => *�̰� �״�� ����ϸ� �տ� ���� Ʈ��/�޽��� ����ϱ⿡ �ڿ����� �ڷ����� �ȸ���*
		// (number >= 1) && (number <= 100)
		// 2_1. (0 < number) && (number < 101)
		// 2_2. (100 >= number) && (1 <= number)
		// 2_3. (1 <= number) && (number <= 100)  �ؾ˾ƺ��� ����ϱ� �̰� ��ȣ�մϴ�.�� �غ������� ��� �����ִϱ� �������� ����.��
		
		// ������ �������ּ���.
		
		// ����غ�����.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1���� 100������ ���ڸ� �Է����ּ��� > ");
		int num = sc.nextInt();
		
		System.out.println("�Է¹��� �� : " + num);
		
		//boolean result = (num <= 100);
		boolean result = (1 <= num) && (num <= 100);
		System.out.println("����ڰ� �Է��� ���� 1���� 100������ �����ΰ���? > " + result);
		
	}
	
	// OR
	
	public void method3() {
		
		// ����ڿ��� �� ���ڸ� �Է� �޾Ƽ�
		// �Է¹��� ���� 'A' �Ǵ� 'a'���� Ȯ���ؼ� ����ϱ�
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�� ���ڸ� �Է��ϼ��� > ");
		char letter = sc.nextLine().charAt(0);
		System.out.print(letter);
		boolean result = (letter == 'a') || (letter == 'A');
		System.out.println("\n����ڰ� �Է��� ���� 'A' �Ǵ� 'a'�ΰ���? > " + result);
		
	
		//String str = "KH����������"; // ���ڿ� == �������ڷ��� (������ �ִ� ���ڰ� ������) --> �� ������ �ε���(����)��� �ϰŵ� --> ���ڿ��鵵 �ε����� �޷��־�.
		//char ch = str.charAt(2);
		//System.out.println(ch);
		//char ch = str.charAt(5);
		//System.out.println(ch);
		//System.out.print("ABCDEFG");
		
		// ���� ��?
		// 1_1. ����ڰ� �Է��� �� ���� == letter�� ��Ƴ����.
		// 1_2. 'A'
		// 1_3. 'a'
		// 1_4.
		// ���� ����? ����� (==)
		// ���� ������ ��� ����� ������ �����Ѱ�?
		// �����ϴ�! =
		// char���� int������ �ڵ�����ȯ�� �Ͼ �� ������ �� => ���ڷ� �ν�
		
	}
	/* AND(&&) : �� ���� ������ ��� true�� ��� true
	 * 
	 * true && true : true
	 * true && false : false
	 * false && fasle : false
	 * false && true : false
	 * 
	 * OR(||) : �� ���� ���� �� �ϳ��� true�� ��� true
	 * 
	 * true || true : true
	 * true || false : true
	 * false || true : true
	 * false || false : false
	 */
	
	public void tip() {
		
		int num = 10;
		
		boolean result = false && (num > 0); //AND ���꿡�� ������ ù��°�ε� �ص忬�꿡�� �Ѵ� Ʈ�翩���ϴ� ���׺��� �ǹ̰� ����
		
		boolean result2 = (num < 0) && (num == 10); //�ڹٿ��� AND �����ϴµ� ���׿��� false�� ������ ��ǻ�Ͱ� �ڿ��� ���ع����ϴ�. �� ��Ŷ ����
		
		
		
		
	}
	
	
}
