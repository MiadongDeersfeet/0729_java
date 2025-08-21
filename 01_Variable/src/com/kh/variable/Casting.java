package com.kh.variable;

public class Casting {
	/*
	 * Type Casting(�ڷ�����ȯ) : �ڷ����� �ٲٴ� ����
	 * 
	 * �ءءءءءءءءءءءء� �ſ� �߿� �ءءءءءءءءءءءءءءء�
	 * 
	 * �����е��� ���� ���� ������ ������� ū�ϳ���!!!
	 * �ڹٿ��� ���� ó���ϴ� ��Ģ
	 * 
	 * 1. =(���� ������)�� �������� ���� / �������� ���� �ڷ����̾�� �Ѵ�. (������ġ������������)
	 * => ���� �ڷ����� �ش��ϴ� ���ͷ����� ������ �� ����
	 * => �ڷ����� �ٸ� ���? �¸� �ٲٰų�, �츦 �ٲٰų�, �� �� �ٲٰų�. 3���� �߿� ��
	 * 
	 * 2. ���� �ڷ����鳢���� ������ ������
	 * => �ڷ����� �ٸ��� ������ �ϰ� �ʹ�? �¸� �ٲٰų�, �츦 �ٲٰų�, �� �� �ٲٰų�. 3���� �߿� �� �غ��� �� �� �ϳ��� "����ȯ"�ؼ� ������ �ϳ��� �����ϰ� ����.
	 * 
	 * 3. ������ ������� ������ �ڷ����̾�� �Ѵ�.
	 * => 1 + 1 = 2 (���� + ���� = ����), 1.1 + 1.1 = 2.2 (�Ǽ� + �Ǽ� = �Ǽ�)
	 * 
	 * [ ǥ���� ] (�ٲٰ�����ڷ���)��
	 * ����ȯ������ / cast������
	 * 
	 *  ����ȯ�� ����
	 *  
	 *  1. �ڵ�����ȯ(promotion) : �ڵ����� ����ȯ�� �����
	 *  
	 *  	���� ũ���� �ڷ��� -> ū ũ���� �ڷ��� (1����Ʈ�� 2����Ʈ�� ������ ������ ���ݾ�)
	 *  	���� ����ȯ�� �� �ʿ䰡 ����
	 *  
	 *  2. ��������ȯ(Type Casting) : �ڵ�����ȯ�� �̷������ �ʴ� ��� ����
	 * 
	 *  	���� ����ȯ�� �ؾ��� �� => () �� ���ؼ� ����
	 *  
	 */
	/*
	 * boolean : 1Byte
	 * char : 2Byte
	 * byte : 1Byte
	 * short : 2Byte
	 * int : 4Byte
	 * long : 8Byte
	 * float : 4Byte
	 * double : 8Byte
	 */
	
	
	// �ڵ�����ȯ(promotion) : ���� �ڷ��� -> ū �ڷ���
	public void autoCasting() {
		//System.out.println("�� ������ �ܼ�â�� ����غ����� �ǽ� ����!");
		
		// 1. int(����, 4byte) => double(�Ǽ�, 8byte)
		
		// ���� ����!�� ���ÿ� �ʱ�ȭ
		int intNum = 10;
		System.out.println(intNum);
		double doubleNum = (double)intNum;
		System.out.println(doubleNum);
		System.out.println(intNum);
		
		
		// 2. int(����, 4Byte) -> long(8Byte, ����)
		int bigInteger = 120;
		long smallLong = /*(long)*/bigInteger;
		System.out.println(smallLong);
		
		
		// 3. long(����, 8Byte) -> float(�Ǽ�, 4Byte) ** Ư�����̽�
		
		long longNumber = 1000L;
		//int num = longNumber;
							// promotion XXXXX
		                    // type casting / type conversion 000
		float floatNumber = longNumber;
		System.out.println(floatNumber);
		// ������ �Ǽ��� ��ȯ�� �� ū �������� ���� ������ �Ǽ� Ÿ������ ����ȯ�� �Ͼ��.
		// 4Byte float���� long������ ǥ���� �� �ִ� ���� ������ �� �б� ����
		
		// 1 2 3
		// 1.00000001, 1.00000002, 1.0000~~~~
		
		System.out.println("--------------------------------------------------------");
		
		// 4. char(2Byte) -> int(4Byte)
		
		char ch = 'a';
		System.out.println(ch);
		int num = ch;
		System.out.println(num);
		char ch2 = 97;
		System.out.println(ch2);
		
		System.out.println("��������ð�~");
		System.out.println('a'); // a
		System.out.println((int)'a'); // 97
		System.out.println('a' + 3); // 100
		System.out.println('a' + '3'); // 148
		System.out.println((int)'3'); // 51
		System.out.println('a' + "3"); // a3
		
		System.out.println('3'); // 3 00110011
		System.out.println((char)3); //  00000011
		System.out.println((char)'3' + (char)3); // 54
		
		System.out.println("-------------------------------");
		
		System.out.println(3);
		System.out.println('3');
		System.out.println("3");
		
		// ����. byte �Ǵ� short������ ����
		
		// -128 ~ 127
		
		byte byteNum = (byte)128; //byte�� 1�ε� , 128�� 4byte ¥���ŵ�.
		System.out.println(byteNum);
		
		byte b2 = 126;
		byte b3 = 3;
		System.out.println(b2 + b3); // 129 byte �� ���� �� �ִ� ���� �ƴѵ�. �ֿܼ� ���� �� ����Ʈ�� �ƴ϶� ��� 
		// ������� int���Դϴ�. => ������ġ�� ���� ó���ϴ� ũ�Ⱑ int��ũ��(4Byte) //������ġ�� ��׵��� int������ �ٲ㼭 �ع���
		
		System.out.println("------------------------------------");
		
		// �񱳿�����( == )
		// ���װ� ������ ���� ���ؼ� ������� ��ȯ
		// true / false
		
		System.out.println("�� �����ڸ� ����غ���~");
		System.out.println(1 == 2); // false
		System.out.println('a' == 'b'); // false
		System.out.println(2 == (int)'2'); // 50 false
		System.out.println((char)2 == '2'); // false ��� ���� ���� ����...
		System.out.println((int)'2'); // 50
		System.out.println((int)'2' == '2'); // true
		
	}
		
		
		
		
		
		
		
		// ������ ��ȯ : ū ũ���� �ڷ��� -> ���� ũ���� �ڷ���
		public void forceCasting() {
			
			
			// ����� ����ȯ�̶�� ��(���谡 ������ �е�)
			// (�ٲ��ڷ���)��
			
			// double(8Byte) -> int(4Byte)
			double doubleNum = 10.123123;
			int intNum = (int)doubleNum;
			System.out.println(intNum);
			
			// 0.123123 ���� -> �������� �ս�
			
			double dNum = intNum;
			System.out.println(dNum);
			
			
			
		
	}
}
