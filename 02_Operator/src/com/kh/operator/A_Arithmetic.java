package com.kh.operator;

import java.util.Scanner;

public class A_Arithmetic {

	// ��������� -> ���׿�����, �켱������ ��������å�̶� �Ȱ���
	// + : ����
	// - : ����
	// * : ����
	// / : ������
	// % : ��ⷯ(Modular) => ������������ �������� ����
	
	public void method() {
		
		int num1 = 10;
		int num2 = 3;
		
		System.out.println("num1 : " + num1);
		System.out.println("num1 : " + num2);
		
		test();
		
		System.out.println("num1 + num2 : " + num1 + num2); // ��������å �տ������� ���Ѵ�.
						// 1�ܰ� "num1 + num2 : 10" ���ڿ��� ������ ���ϱ�
						// 2�ܰ� "num1 + num2 : 103" ���ڿ��� ������ ���ϱ�
		// ������� "num1 + num2 : 103"
		// ���� �켱������ �����ϰ� �ʹٸ� ()�� �̿��ؼ� �����־���� �ǵ��� �����
		// ����� �� ����
		System.out.println("num1 + num2 : " + (num1 + num2));
		
		int sum = num1 + num2; //�̷��� ������ ���� ���� �س��� ���� �� �� ���ϰڳ�?
		System.out.println("num1 + num2 : " + sum);
		System.out.printf("num1 + num2 : %d\n", num1 + num2);
		// ������ ��� ��ȣ�� �������� ������
		// ���ڿ��� num1�� �ϳ��� ��ģ �� ������ ���� ������ ������ �Ұ�����!
		System.out.println("num1 - num2 : " + (num1 - num2));
		System.out.printf("num1 - num2 : %d\n", num1 - num2);
		
		System.out.println("num1 X num2 : " + num1 * num2); //��������å�� ������ ���� �켱�����̱� ����.
		
		// *, /, % �� ģ������ �켱������ +, -���� ���� ������ �������� �ʴ���
		// ���� ������ �����ؼ� ����� ���� �� ���� �׷���,
		// ������ ����� ���� ��ȣ�� ����ϴ� ���� �����մϴ�.
		// System.out.println("num1 X num2 : " + (num1 * num2));
		
		System.out.println("num1 �� num2 : " + (num1 / num2));
		System.out.println("num1 mod num2 : " + (num1 % num2));
		
		// ���������ؾ��� �κ�
		
		System.out.println(10 / 0);
		
	}
	
	public void test() {
		System.out.println("�� ���θ޼ҵ忡�� ȣ���ؾ��ϴ� ���� �ƴմϴ�!");
		
		
		
			
	}
	
	// ���� ���� ���ϱ� ���α׷��� �����Ͻÿ�.
	
	// �޼ҵ� : presentToStudent() <== �޼ҵ� ����
	
	// ����ڿ��� ���� �Է¹������� <== Scanner
	// 1. ������ �л��� ��
	// 2. ���� ����
	
	// 1�δ� ���� �� �ִ� ������ ���� : ���� ���� / �л��� �� <= ���������
	// ���� ������ ���� : ���� ���� % �л��� �� <= ���������
	
	// �������
	// �л� �� ��� ���� �� �ִ� ������ ���� : X�� <== ��¹�
	// ���� ���� ���� : X�� <== ��¹�
	
	
	public void presentToStudent() {
	
		//Scanner sc = new Scanner(System.in);
		
		//System.out.println("�߰�����");
		
		//System.out.print("�� ���̼���?");
		//int students = sc.nextInt();
		//System.out.print("������ �л��� �� : " + students);
		
		//System.out.print("\n���� ���� > ");
		//int candies = sc.nextInt();
		//System.out.println("���� ���� : " + candies);
		
		//int giveCandy = candies / students;
		//int restCandy = candies % students;
		
		//System.out.println("�л� �� ��� ���� �� �ִ� ������ ���� : " + giveCandy + "�� �Դϴ�.");
		//System.out.println("���� ���� ���� : " + restCandy + "�� �Դϴ�."  );
		
		//System.out.println("============================");
		//System.out.println("�� �� �� �� �� ���� �� �� �� ?");
		//System.out.println("���� : " + giveCandy + "�� �Դϴ�.");
		//System.out.println("���� �� �� ����?");
		//System.out.println("���� : " + restCandy + "�� �Դϴ�.");
		//System.out.println("=======================");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//int students = 26;
        //int candies = 57;
        //int givingCandy = candies / students;   // 2
        //int leftCandy = candies % students;     // 5
        
		//Scanner sc = new Scanner(System.in);
	
		//System.out.println("�л��� ���� �Է��ϼ��� > ");
		//int num1 = sc.nextInt();
		
		//System.out.println("������ ������ �Է��ϼ��� > ");
		//int num2 = sc.nextInt();
		
		//System.out.println("�л� �� ��� ���� �� �ִ� ������ ���� : " + givingCandy + "�Դϴ�.");
		//System.out.println("���� ���� ���� : " + leftCandy + "�Դϴ�.");


		
	
		
		
	}
	
	
	
	
}
