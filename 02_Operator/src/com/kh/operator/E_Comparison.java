package com.kh.operator;

public class E_Comparison {
	
	/*
	 * �� ������(���� ������) '3' == (int) '3'
	 * 
	 * �� ���� ���� ������ ��, ���� ������(���� �� ����� �ǹ�)
	 * �񱳿����� �� ��� -> ���� ��� true, ������ ��� false
	 * Ư�� ������ ������ �� �ִ� ���ǹ����� ���ǽ����� ����� ����~~ //������ ��Ʈ���� ���� �߿��ϴ� ����� ���ص� �ʿ䰡 �־��.
	 */
	/*
	 * ����
	 * 
	 * �����, ��Һ�, 
	 * 
	 * 1. ����� : ��ġ���� ��
	 * 
	 * a == b : a�� b�� ��ġ�մϱ�? // �ۼ� ���� �ٸ� ����� �ڵ带 �ؼ��� ���� ���ǹ���/�ǹ��������� �����ؾ��Ѵ�. // ������� ��, �ƴϿ��̴ϱ�!
	 * a != b : a�� b�� ��ġ���� �ʽ��ϱ�? // �����ǹ�������
	 * 
	 *  2. ��Һ� :
	 * 
	 * a < b : a�� b���� �۽��ϱ�? // �ؿ��ʺ��� �������
	 * a > b : a�� b���� Ů�ϱ�?
	 * a <= b : a�� b���� �۰ų� �����ϱ�?
	 * a >= b : a�� b���� ũ�ų� �����ϱ�?
	 *
	 * ������� true / false
	 */
	
	public void method1() {
		
		//System.out.println("ȣȣȣ");
		
		int firstNumber = 10;
		int secondNumber = 25;
		
		System.out.println("firstNumber < secondNumber :  " + (firstNumber < secondNumber)); //first�� second���� �۽��ϱ�?? �� �����ϼž��մϴ�.
		
		System.out.println("�� ���� ������? : " + (firstNumber == secondNumber)); // a�� b�� �����ϱ�? �� �����ϼž��մϴ�.
		
		System.out.println("a�� b���� �۰ų� �����ϱ�? : " + (firstNumber <= secondNumber));
		
																		// ���� ���� �ʿ�����?
																		// firstNumber
																		// ���� ������ �ؾ�����?
																		// �񱳿��� (¦������ �ƴ���)
																		// 2 4 6 8 10 ������ 2�� ������ �� �������� 0�̴�.
		System.out.println("firstNumber�� ¦���Դϱ�? : " + (firstNumber % 2 == 0)); // �̰��� �������� �� 0�� ���ٸ� ���̴�.
		
		System.out.println("secondNumber�� Ȧ ���� �ƴմϱ�? : " + (secondNumber % 2 != 1));
		
		System.out.println("firstNumber�� Ȧ���Դϱ�? : " + (firstNumber % 2 != 0));
		
		
		
	}
	
	

	
	
	
	
}
