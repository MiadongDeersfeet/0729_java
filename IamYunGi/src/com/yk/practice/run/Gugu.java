package com.yk.practice.run;

import java.util.Scanner;

public class Gugu {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�� ���� ����ұ��? > ");
		int i = sc.nextInt();
		System.out.println(i + "���� ����մϴ�.");
		System.out.print("�Է�ĭ2 > ");
		int j = sc.nextInt();
		for(j = 1; j <= 9; j++) {
			System.out.println(i + "X" + j + " : " + (i * j)); 
		}
	}

}
