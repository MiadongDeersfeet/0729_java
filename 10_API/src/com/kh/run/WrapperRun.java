package com.kh.run;

public class WrapperRun {

	public static void main(String[] args) {
		/*
		 * Wrapper Class
		 * => �⺻�ڷ����� �����ڷ������� �������ִ� Ŭ�������� ����Ŭ������� ��.
		 * 
		 * �⺻ �ڷ���								Wrapper Class
		 * 				 <--------------->
		 * boolean								Boolean
		 * char									Character	
		 * byte									Byte	
		 * short								Short	
		 * int									Integer	
		 * long									Long	
		 * float								Float	
		 * double								Double
		 */

		// �⺻�ڷ����� ��ü�� ����ؾ� �ϴ� ���
		// �޼ҵ� �Ű����� �ڷ����� �⺻�ڷ����� �ƴ� �����ڷ����� ��� ������ ���
		// �������� �����ؾ߰ڴ�!!!!
		
		int num1 = 10;
		int num2 = 15; 
		
		// Object.equals()
		//Integer i1 = new Integer(num1); // ��� = ����������Ƽ�� �� �ž�. ������ �� �� ������ �ڹ� ������ �� �ø��� �� ���� ��ü�� ������ ���ֹ����ž�. �̸��� �ٸ� �������� �ٲ㼭 ���~~~!
		
		// ���� int�� ���� ���ڵ������� ���Ǯ�� �ø��� �ʹ� ���̿���.
	//	System.out.println(i1);
		
		// �⺻�ڷ��� => Wrapper�� ����
		Integer i1 = num1;
		Integer i2 = num2;
		// 128 �̸��� �������� ���Ǯ�� ���⿡ �Ȱ��� ���� �Ȱ��� �ּҸ� �����Ѽ� �޸����� ���鿡�� ���� ���� �� �ִ�.
		// �⺻ �ڷ����� int �� ������ ������ ���� �ڷ��� Integer �� �������� �����Դϴ�.
		System.out.println(i1.equals(i2));
		System.out.println(i1.compareTo(i2));
		// a.compareTo(b)
		// a�� b���� ũ�� 1�� ��ȯ
		// a�� b���� ������ -1�� ��ȯ
		// ������ 0 ��ȯ
		
		// ������ �����͸� �޾Ҵµ� ���ڿ��� ������, ���ڿ��� ������ ��찡 ���ƿ�.
		// ������ �޾Ƶ� "123", �Ǽ��� �޾Ƶ� "1.1"
		// Ÿ���� ��Ʈ���� �ſ���.
		String str1 = "10";
		String str2 = "1.1";
		
		System.out.println(str1 + str2); // 101.1 ������ ���ϱ� ������ Ÿ������ ������ ����. �̰� ������ / �Ǽ������� �ٲ������.
		
		int i = Integer.parseInt(str1);
		double d = Double.parseDouble(str2);
		// �ش� WrapperŬ�����̸�.parseXXX(������);
		
		System.out.println(i + d);
		
		// �̷� ��Ȳ���� ĳ������ �ƴϰ�
		// �Ľ�(parsing)�� ������ؿ�. == Ư�� �����͸� ��Ģ�� ���� �м��ϰ� �ؼ��ϴ� ����
		
		//String strInteger = i + ""; // ==> "i" �� �Ǵ� ���� �ٵ� �ٺ������� ������ ?
		String strInteger = String.valueOf(i);
		
		
		
		
		
		
		
		
	}

}
