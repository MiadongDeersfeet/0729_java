package com.kh.chap02.loop;

import java.util.Scanner;

public class A_For {

	public void method0() {
		
		//System.out.println("�� ������ �������ƿ�~~!~!");
		//System.out.println("�� ������ �������ƿ�~~!~!");
		//System.out.println("�� ������ �������ƿ�~~!~!");
		// �ݺ��ؾ��ϴ� Ƚ���� 328,765���̶��...?
		// For (�ڹٿ����� ~���� �� �ǹ̿� ����� �� ���ƿ�.)
		// for(�ʱ��; ���ǽ�; ������;) �ȿ��� �� �� ������ ���� �ۼ��մϴ�.
		for(
				int i = 0;
				i < 5;
				i++
				) {
			System.out.println("��������~~");
		}
		/*
		 * for() {
		 * 
		 * }
		 * 
		 * ��ȣ���� �ݺ��� Ƚ���� �����ϴ� �κ�
		 * �ʱ��; ���ǽ�; ������; �� ������ �̷����
		 * ;; �����ݷ����� ������
		 * 
		 * [ ǥ���� ]
		 * 
		 * for(�ʱ��; ���ǽ�; ������) {
		 * 			�ݺ������� �����ϰ��� �ϴ� �ڵ�;
		 * }
		 * 
		 * 
		 * - �ʱ�� : �ݺ����� ������ �� "�ʱ⿡ �� �ѹ��� ����"�� ����
		 * 			�ݺ��� �� �� �ʿ��� ������ �����ϰ� �ʱ�ȭ �ϴ� ����(�����) => int i = 0;
		 * 
		 * - ���ǽ� : "�ݺ����� ����� ����"�� �ۼ��ϴ� ����
		 *           ���ǽ��� ����� true�� ��� �ݺ��� ����
		 *           ���ǽ��� ����� false�� ��� �ݺ����� ���߰� for�� ���� �������� => i < 5;
		 * 
		 * - ������ : "�ݺ����� �����ϴ� ������ ���Ե� ��"�� �����ϴ� ����
		 *           ���� �ʱ�Ŀ��� ����� ������ ������ ������ �ۼ�
		 *           �� ��, ���������� ���������ڸ� ����� => i++
		 */
		
		public void method1() {
			// ����~~~¥ �ܼ��ϰ�
			// 1
			// 2
			// 3
			// 4
			// 5
			//System.out.println(1);
			//System.out.println(2);
			//System.out.println(3);
			//System.out.println(4);
			//System.out.println(5);
			//System.out.println("1\n2\n3\n4\n5\n6\n7\n8\n9\n10\n11\n12\n13\n14\n15\n16\n17\n18\n19\n20");
			// �� ���Ƶ���!!!!!!!!!!!!!!
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			// for �� ������ �Ұ�ȣ �ϴ� ���� ������ �ȿ��� �ؾ߰ڳ� ?_? // ������ ���� i�� ������. (�ڷ��� = type �� �ڹٿ��� ���� �߿��մϴ�.)
			for(/* 1 */ int i = 1; /* 2 */ i <= 5; /* 4 */ i++) {
				/* 3 */ System.out.println(i + "�� �ݺ�");
			} // 3���� ������ �ݴ� �������� ������ 4�� ���������� �̵��մϴ�. // 4���� ������ 2������ ���ư��ϴ�.(1���� ó���� �� ���� �ϰ� ������ �Ŵϱ�) // for()�� 1������ ����, 
																																//2������ ����(������ ���� ������)
																																//2-3-4�� �ݺ�(������ ���� ������)
			//������ ������ �Ǽȿ� �������� �����غ��� ���߾�ü ȯ�濡���� int i = 0; i <= 2; i++ �⺻���̽��� �����ϴ� �� ���ٰ� �Ͻ�. (�ѱ� �Ϻ�)
			// �� �׷��� ¥��¥���̵�
			// for���� �̿��ؼ� �ݺ��� 3�� �Ѵٰ� ����
			// i, j, k �⺻ ���̽��� i �̰� ����for��, ����for�� �Ǹ� j, k ���ϴ�. //�ʱ�� ��������� �ʱ�ȭ�� �� ���������� 0; ���� �մϴ�.
			for(int i = 0; i < 3; i++) {
				System.out.println(i);
			}

			for(int i = 0; i < 240; i+=3) { //2�� ���, 3�� ���
				System.out.println(i);
			}
		
			System.out.println("===============================");
			
			for(int i = 100; i >= 1; i--) {
				System.out.println(i);
			}
		
			
			public void gugudan() {
				
				// ������ ���α׷�
				// ����ڿ��� ������ �Է¹޾Ƽ�
				// ����ڰ� �Է��� ������ �̿��ؼ� �������� ����غ���
				
				Scanner sc = new Scanner(System.in);
				System.out.println("�ڡڡڱ������� ����, �������� ���ڡڡڡ�");
				System.out.println("�� ���� ����Ͻðڽ��ϱ�? > ");
				int dan = sc.nextInt();
				System.out.println(dan + "���� ����ϰڽ��ϴ�.");
				for(int i = 1; i <= 9; i++) {
					System.out.println(dan + " X " + i + " = " + (dan * i));
				}
			}
				public void method2() {
					
					// ���簢�� ����
					// �ڡڡ�
					// �ڡڡ�
					// �ڡڡ�
					//System.out.println("�ڡڡ�");
					//System.out.println("�ڡڡ�");
					//System.out.println("�ڡڡ�");
					
					/*for(int i = 0; i < 3; i++) {
						System.out.print("��");
					}
					
					System.out.println();
					
					for(int i = 0; i < 3; i++) {
						System.out.print("��");
					}
					
					System.out.println();
					
					for(int i = 0; i < 3; i++) {
						System.out.print("��");
					}
					
					System.out.println();
					
				}*/
			
				for(int i = 0; i < 3; i++) {
					for(int j = 0; j < 3; j++) {
						System.out.print("��");
						
					}
					System.out.println();
				
				}
				
				//��� : X��° �ݺ��Դϴ�.
				//10��° �ݺ����� ���� �ϳ��� ����ֱ�
			for(int i = 0; i < 100; i++) {
				System.out.println((i + 1) + "��° �ݺ��Դϴ�.");
				
				// ���� �ϰ� �;��� �κ�
				// (i + 1) == 10 || (i + 1) == 20 || (i + 1) == 30
				// (i + 1) % 10 == 0
				if((i + 1) % 10 == 0) {
					System.out.println("��");
				}
				
				public void method3() {
					
					for(;;) { //�̷� ������� �Ⱦ��� �κ��� ������ �ݺ��˴ϴ�.
						
					
					System.out.println("������ ���α׷� ~~~");
					System.out.println("1. ������ ���α׷� �����ϱ�");
					System.out.println("2. ������ ���α׷� ������");
					System.out.println("3. ���α׷� �����ϱ�");
					Scanner sc = new Scanner(System.in);
					System.out.print("�޴��� �������ּ��� > ");
					int menuNo = sc.nextInt();
					sc.nextLine();
					
					if(menuNo == 1) {
						gugudan();
					} else if(menuNo == 2) {
						System.out.println("�������� ���۽����ּ���");
						System.out.println("�� ����־��");
					} else if(menuNo == 3 ) {
						System.out.println("���α׷��� �����մϴ�");
						return;
					} else {
						System.out.println("���� �޴��Դϴ�");
					}
					System.out.println();
					
					}
				
					
					
					
					
				}
				
			
				
			
		
				
		
	
	
}
