package com.kh.chap01.condition;

import java.util.Scanner;

public class C_Switch {
	
	public void method0() {
		// ������ Ŭ����
		Scanner sc = new Scanner(System.in);
		System.out.print("�� �� ������?(B1 / B2 / B3) > ");
		String floor = sc.nextLine();
		// System.out.println(floor);
		
		// B1 B2 B3(���� ����� ��)
		switch(floor) {
		case "B1" : System.out.println("���� 1���Դϴ�. ���� �����ϴ�."); 
		break; //�극��ũ�� ������ ������ �ȳ������� �ݴ� ������ ������ �����ϴ�. ���� case���� break�� �޷��ִ�.
		case "B2" : System.out.println("���� 2���Դϴ�. ���� �����ϴ�."); 
		break;
		case "B3" : System.out.println("���� 3���Դϴ�. ���� �����ϴ�."); 
		break;
		}
		
		/*
		 * switch ��
		 * 
		 * [ ǥ���� ]
		 * 
		 * switch(case���� ����� ������� ���) {
		 * case "��" ����, ����, �Ǽ�, ���ڿ� : ������ �ڵ�; 
		 * 
		 * }
		 * 
		 * switch(���� || �Ǽ� || ���� || ���ڿ�) {
		 * case "(��1)���� || �Ǽ� || ���� || ���ڿ�" : ������ �ڵ�a; // ����񱳴�� == ��1 true�� ��� ������ �ڵ� a�� ����
		 * 
		 * case ��2 : ������ �ڵ�b; // ����񱳴�� == ��2 true�� ��� ������ �ڵ� b�� ����
		 * 
		 * case ��n : ������ �ڵ�n; // ����񱳴�� == ��n true�� ��� ������ �ڵ� n�� ����
		 * 
		 * 
		 * default : �������ڵ�; // == else
		 * 
		 * }
		 * 
		 * 
		 * 
		 */
		

	}
	
	// �޴� �ֹ�
	// �δ��, ������, ��������, Į����, ������
	public void method1() {
		
		// ����ڿ��� ������ ������ �̸��� �Է¹޾�
		// �� ���ĸ��� ������ ������� ��
		 
		// �δ��,   ������,   ��������,    Į����,   ������
		// 11000,    13000,    7000,     8000,   7000
		
		//Scanner sc = new Scanner(System.in);
		//System.out.print("�޴��� �������ּ���(�δ��, ������, ����, Į����, ������) > ");
		//String menu = sc.nextLine();
		//System.out.print(menu);
		//switch(menu) {
		//case "�δ��" : System.out.println("11,000�� �Դϴ�."); break;
		//case "������" : System.out.println("13,000�� �Դϴ�."); break;
		//case "����" : System.out.println("7,000�� �Դϴ�."); break;
		//case "Į����" : System.out.println("8,000�� �Դϴ�."); break;
		//case "����", "������" : System.out.println("7,000�� �Դϴ�."); break;
		//default : System.out.println("���� �޴��Դϴ�.");
		//}
		// �ߺ������ϱ�
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�޴��� �������ּ���(�δ��, ������, ����, Į����, ������) > ");
		String menu = sc.nextLine();
		//System.out.print(menu);
		/*
		switch(menu) {
		case "�δ��" : System.out.println("11,000�� �Դϴ�."); break;
		case "������" : System.out.println("13,000�� �Դϴ�."); break;
		case "����" : System.out.println("7,000�� �Դϴ�."); break;
		case "Į����" : System.out.println("8,000�� �Դϴ�."); break;
		case "������" : System.out.println("7,000�� �Դϴ�."); break;
		default : System.out.println("���� �޴��Դϴ�.");
		}
		//�ߺ������ϱ�
		// 1. �ߺ��� �κ��� �ϳ��� ����
		// 2. �ߺ��� �ƴ� �κ��� ������ ó��
		*/
		
		/*int result = switch(menu) {
		case "����", "������", "Į����" -> 3000; // -> ���ο� ������
		case "������", "�δ��" -> 5000;
		default -> 0;
		};
		System.out.println(result);
	}*/
		int price = 0;
		//sc.nextInt();
		switch(menu) {
		case "�δ��" : price = 11000; break;
		case "����" : price = 7000; break;
		case "������" : price = 13000; break;
		case "Į����" : price = 8000; break;
		case "������" : price = 7000; break;
		default : System.out.println("���� �޴��Դϴ�.");
		return; // ���� ����ǰ� �ִ� �޼ҵ� ������ �ƿ� ���������ϴ�.
		        // �޼ҵ带 ȣ���� ������ ���ư��ٴ� �ǹ�.
		} // break �ⱸ
		
		//if(price != 0) {
			System.out.println(price + "�� �Դϴ�.");
		} // return �ⱸ0.0 => ���� �޼ҵ�� �̵�
	
	public void login() {
		
		// �α��� �����ϱ�!
		// ��ȹ �� ���� �ܰ�(������Ʈ ���� ��)
		
		// ��ȹ -> �� ������?
		// ���� -> ��� ������?(�����ڿ��Դ� ���谡 �߿��ؿ�.)
		
		// �α��� ��� -> �м� -> ���� �ϴ� ������ �ʿ��� .
		// �α����̶� ����...?
		
		// ���̵� + ��й�ȣ
		// �Է�
		
		// �α��� ������ �� �ʿ��� �� :
		// 1. ����ڰ� �Է��� ���̵� �� -> (�ڷ����� �����ؾ���) ���ڿ�
		// 2. ����ڰ� �Է��� ��й�ȣ �� -> ���ڿ�
		
		// �α��� �� �ʿ��� ���� �۾� :
		// ȸ������
		
		// 1. ȸ������ �� ����ڰ� ���ϴ� ���̵� ���� ��й�ȣ ���� �Է��Ͽ� ȸ�������� ������
		// 2. ���� �� �Է��ߴ� ���̵�� ��й�ȣ�� �� �� ��Ȯ�� �Է��Ѵٸ� �α��� ���� ȭ�� ���
		// 3. ���� �� �Է��ߴ� ���̵�� ��й�ȣ�� �ϳ��� ��ġ���� �ʴٸ� �α��� ���� ȭ�� ���
		
		// �ϴ��� ������ ȸ�������� �����ߴٰ� ����
		String id = "user01";
		String password = "pass01";
		String name = "ȫ�浿";
		
		// --------------------------------------------------------------------------------------------------------------
		
		
		
		System.out.println("KH����");
		System.out.println("==================");
		System.out.println("�α��� ���� �Դϴ�.");
		System.out.println("==================");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("------------------");
		System.out.print("���̵� > ");
		String userId = sc.nextLine();
		System.out.println("------------------");
		System.out.print("��й�ȣ > ");
		String userPwd = sc.nextLine();
		System.out.println("------------------");
		
		
		// ���࿡ ����ڰ� �α��� �� �Է��� ���̵𰪰� ȸ�����Խ� ������ ���̵��� �����ϰ�
		// ����ڰ� �α��� �� �Է��� ��й�ȣ���� ȸ�����Խ� ������ ��й�ȣ���� �����ϴٸ�
		
		if(userId.equals(id) && userPwd.equals(password)) {
			System.out.println("�α��� ���� ~ " + name + "�� ȯ���մϴ� !");
			
		} else {
			System.out.println("���̵� �Ǵ� ��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
		}
		
		// �⺻�ڷ��� : boolean, char, byte, short, int, long, float, double
		// => �⺻�ڷ����� ��� ����� �����ڸ� �����ϴµ� �־� ������ ����(==, !=)
		
		// �����ڷ��� : �� ��
		// => ����� ������ (==, !=)�� ���ؼ� ���� ���ϴ� ���� �Ұ���!!
		// ���� ������ ���� ���� '�ּҰ�'�̱� ����
		// ���ڿ��� ���� �� : equals() => true / false
		
		
		
	}

	}
	

