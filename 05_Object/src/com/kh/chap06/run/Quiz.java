package com.kh.chap06.run;

import java.util.Scanner;

public class Quiz {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int cnt1 = 0;
		int cnt2 = 0;
		// ���� �ΰ��� �Է¹޾Ƽ� �ΰ���ģ�Ÿ����������������
		
		while(true) { 
			
			System.out.println("���ϱ� ��������~~~~~~~(�׸��ϰ������ �׸��ϰ�;�並 �Է��ϼ���)");
			System.out.println("���̵��� �������ּ���(�� / �� / ��) > ");
			String level = sc.nextLine();
			
			int bound = 0;
			int quizCount = 1;
			
			if(level.equals("��")) {
				System.out.println("���̵� (��)�� �����ϼ̽��ϴ�. 1 ~ 3000 ������ ������ �����˴ϴ�.");
				bound = 3000;
				
			} else if(level.equals("��")) {
				System.out.println("���̵� (��)�� �����ϼ̽��ϴ�. 1 ~ 200 ������ ������ �����˴ϴ�.");
				bound = 200;
				
			} else if(level.equals("��")) {
				System.out.println("���̵� (��)�� �����ϼ̽��ϴ�. 1 ~ 10 ������ ������ �����˴ϴ�.");
				bound = 10;
				
			} else if(level.equals("�׸��ϰ�;��")) {
				System.out.println("�ȳ���������~");
				break;
			} else {
				System.out.println("�̻��� ���̵��� �����ϼ̽��ϴ�.");
				System.out.println("ó������ �ٽ� �õ����ּ���.");
				continue;
			}
			
			int firstNumber = (int)(Math.random() * bound) + 1;
			int secondNumber = (int)(Math.random() * bound) + 1;
			
			System.out.println(quizCount + "�� ���� ��");
			System.out.println(firstNumber + " + " + secondNumber + " = ? ");
			System.out.println("������ �Է����ּ��� > ");
			int answer = sc.nextInt();
			sc.nextLine();
			
			if(answer == (firstNumber + secondNumber)) {
				System.out.println("������~�� �����Դϴ�!");
				cnt1++; quizCount++;
			} else {
				System.out.println("�� ~ �����Դϴ�...��");
				cnt2++; quizCount++;
			}
			
			System.out.println("�� ���� Ǯ�� Ƚ�� : " + quizCount + "ȸ ��");
			System.out.println("�� ����Ƚ�� : " + cnt1 + "�� / ����Ƚ�� : " + cnt2 + "��");
			System.out.println();
		}
 
		
		
		
		
		
		

	}

}
