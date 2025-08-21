package com.kh.controller;

import java.util.Scanner;
import java.util.StringTokenizer;

import com.kh.run.Run;

public class StringController {

	// String Ŭ���� => �Һ�(������ ������ �ǹ�)
	
	/*
	 * String Ŭ���� �����
	 * 
	 * 1. new �����ڸ� ����ؼ� String Ŭ������ �����ڸ� ȣ���ϴ� ��� <= ȸ�翡�� �� ������� ������� ��¦�� �����鼭 ������� �� �� �־��.
	 * 2. ���Կ����ڸ� �̿��ؼ� ���ڿ� ���ͷ����� �����ϴ� ���
	 */
	
	// �����ڸ� ȣ���ؼ� ���ڿ� ��ü�� �����ϴ� ���
	public void method1() {
		
		String str1 = new String("hello");
		String str2 = new String("hello");
		Run run = new Run();
		String str3 = "hello";
		
		System.out.println(str1); // �̰� ����? hello
		System.out.println(str2); // ����Ʈ���� �������̵��� �Ǿ��ְڱ���. hello
		System.out.println(run); // ���� �θ��� ������Ʈ�� ���� �θ� ���� ����Ʈ�� �޼ҵ带 ȣ���ؼ� ��ȯ���� ����� ����. �̷��� ���;� ��������. com.kh.run.Run@2ff4acd0
		// 1. String Ŭ������ toString()�� ���
		// ���� ����ִ� ���ڿ� ���ͷ� value ���� ��ȯ�ϰڴٰ� �������̵�
		
		Run run2 = new Run();
		System.out.println(run.equals(run2)); // false
		// �� �ּҶ� ���ڷ� ���� �ּҶ� �����

		// equals()
		System.out.println(str1.equals(str2)); // true
		// true => ����
		// ��Ʈ�� Ŭ�������� ������ �޼ҵ带 '��'�� ������ ���� �� �ֵ��� �������̵� �س��ڳ�? (�������� ���ٹ��)
		// �ּҰ� �񱳴� �����̰� ���ڿ� ���� ���ϵ��� �������̵�
		
		// hashCode()
		System.out.println(str1.hashCode()); // 99162322
		System.out.println(str2.hashCode()); // 99162322
		System.out.println("hello".hashCode()); // 99162322
		// 3. String Ŭ������ hashCode()
		// �ּҰ��� �ؽ��ϴ� ���� �ƴ϶� ���� ��� ���ڿ����� ������� �ؽ��ڵ� ���� ���鵵�� �������̵�
		
		// ��¥ �� ������ �������� �ĺ��� �� �ִ� ���� �˾Ƴ��� ��
		// System.identityHashCode(����������)
		System.out.println(System.identityHashCode(str1)); // 1421795058
		System.out.println(System.identityHashCode(str2)); // 1555009629
		
		
		System.out.println(str1 == str2); // false
		
	}
	
	// ���ڿ� ���ͷ� ���� ���
	public void method2() {
		String str1 = "hello";
		String str2 = "hello";
	
		// toString()
		System.out.println(str1); // hello
		System.out.println(str2); // hello
		
		// equals()
		System.out.println(str1.equals(str2)); // true
		
		// hashCode()
		System.out.println(str1.hashCode()); // 99162322
		System.out.println(str2.hashCode()); // 99162322
		
		// System.identityHashCode()
		System.out.println(System.identityHashCode(str1)); // 804564176
		System.out.println(System.identityHashCode(str2)); // 804564176
		
		System.out.println(str1 == str2); // true
		
		
	}
	
	// String Constant Pool => ��Ʈ�� Ǯ�̶�� ��.
	public void method3() {
		
		String exam = new String("hello");
		String str = "hello";
		
		// ���ڿ� ���ͷ��� ���� �����ڸ� ����� ������ ��
		// String Contant Pool ������ ��ϵ�
		// Ư : ������ ������ ���ڿ� ���ͷ��� ������ �� ����
		
		System.out.println(System.identityHashCode(str)); // 804564176
		
		str = "bye";
		System.out.println(System.identityHashCode(str)); // 1421795058
		
		// ���Ǯ�� �ö󰡴µ� hello ��� 5ĭ¥��? �ö󰬴µ�
		// bye ��� 3ĭ¥��? �� �ٲ�ϱ�
		// �ּҰ��� �޶��
		
		str += "!!";
		System.out.println(System.identityHashCode(str)); // 2001049719
		
		String a = "a";
		String b = "b";
		
		System.out.println("��� : " + a == b);
		System.out.println("�̸� : " + a + ", ���� : " + b);
		
		//StringBuilder ���ڿ��� ������ ��
	}
		public void method4() {
			//Arrays.toString(new int[2]);
			
			// StringBuffer
			// Buffer == �ӽ��������
			// ���ڿ��� �Һ���ü�� ���빰�� ����� ������ ���ο� ������ �Ҵ��ؼ� ����ִ´�.
			// �̸� �ذ��ϱ� ���ؼ� �ӽð���(Buffer)�� �غ��ؼ�
			// �ӽð����� �������� ��Ҵٰ� �� ���� ó�����ִ� Ŭ����
			
			StringBuffer sb = new StringBuffer();     // <= ��� ������������ ����־��. ȫ�浿�� ��浿�� ĩ�������Ż������ ������ ������ ���� �� �ִ� ����� ����.
			// System.out.println("Hello" + "World!");
			sb.append("Hello ");
			sb.append("World!");
			System.out.println(sb);
			// ���ϱ�� ���� ���ϴϱ� ���ϱ� ��ſ� ���� ����� append �Դϴ�.
			
			// StringBuilder    // <= ��� ������������ ������. �׷��� �̷������� �ӵ��� ������ �� �����ٰ� ��. ������������ �ٸ����� �̹� ���� ������ �ǰ� �־ �Ϲ������δ� ������ ���ϴ�.
			StringBuilder sr = new StringBuilder();
			sr.append("Hello ");
			sr.append("World!");
			System.out.println(sr);
			
			// ����������(Thread-Safe)��
			// �ܺο��� ������ ���� �ǰ� �ֱ� ������
			// �浹ȯ���� �ƴ϶�� ���� ������ �ʿ䰡 ����
	}
	
		// ���ڿ��� ���õ� �޼ҵ�� �� ����/�ڵ��׽�Ʈ �����ؼ� ���ڿ��� ���õ� �͵��� �� �˾Ƶδ� �� ���ƿ�.
	public void stringMethod() {
		
		String str1 = "��Ƿ������� ��ī����";
		
		// 1. ���ڿ�.length() : int
		// ���ڿ��� ���̸� ��ȯ
		System.out.println("str1�� ���� : " + str1.length()); // ���ڿ��� �迭�� �� �� �ۿ� ����� ???
		
		// 2. ���ڿ�.charAt(int index) : char
	char ch = str1.charAt(3);
	System.out.println("�� : " + ch);
	
	String phoneNumber = "010-1234-5678";
	// 3. ���ڿ�.substring(int beginindex) : String
	// => ���ڿ��� beginindex ��ġ���� ���ڿ� �������� ���ڿ��� �����ؼ� ��ȯ
	System.out.println(phoneNumber.substring(4)); 
	System.out.println(phoneNumber.substring(4, 8)); // <= �����ε��� �ߵǾ��־ �� �� �� ����.
	
	// 4. ���ڿ�.indexOf(str) : int
	System.out.println(str1.indexOf("��"));
	
	String[] emails = {"hong@kh.com", "kim@kh.com", "hitel@kh.com", "hhaahhoo@kh.com"};
	
	for(int i = 0; i < emails.length; i++) {
		System.out.println(emails[i].substring(0, emails[i].indexOf("@")));
		
	}
	
	// 5. ���ڿ�.toCharArray() : char[]      <= ���ڿ��� char�� �迭��
	// ���ڿ��� �� ���ڵ��� char[]�� ��ȯ���ִ� �޼ҵ�
	char[] chArr = emails[0].toCharArray();
		
	for(int i = 0; i < chArr.length; i++) {
		System.out.println(chArr[i]);
		
	}
	for(char c : chArr) {
		System.out.println(c);
	}
	
	new String(chArr).chars().mapToObj(c -> (char)c).forEach(System.out::println);
	
	// char[] -> String
	System.out.println(String.valueOf(chArr));
	
	// 6. ���ڿ�.replace(char old, char new) : String
	System.out.println(emails[0].replace("kh", "naver"));
	
	String str3 = "                         Java                               ";
	// 7. ���ڿ�.trim() : String
	System.out.println(str3.trim());
	
	// 8. ���ڿ�.toUpperCase() : String => �ϴ� �빮�ڷ� �ٲٱ�
	//    ���ڿ�.toLowerCase() : String => �ϴ� �ҹ��ڷ� �ٲٱ�
	Scanner sc = new Scanner(System.in);
	System.out.println("���� �Ͻðھ��?(Y/N) > ");
	String answer = sc.nextLine();//.toUpperCase();
	// String upperAnswer = answer.toUpperCase();

	if(answer.toUpperCase().equals("Y") || answer.equals("y")) {
		System.out.println("�� ������ �ؾ߰ڴ� ���� ���� ����.");
		
	}
	
	}
	public void split() {
		
		// ���ڿ� �и���Ű��
		String str = "����Ŀ�,������,�ϱ�Ⱦ��,��ſ���";
		
		// ���ڿ�.split(String ������) : String[]
		
		String[] arr = str.split(",");
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println();
		
		// ���� for��
		for(String s : arr) {
			System.out.println(s);
		}
		// �ʱ��, ���ǽ�, ������ �Ⱦ�
		// for(���� �޾��� ���� ���� : ���������� ��ҿ� ������ �迭 || �÷��� ){ }
		// �迭�� ��Ҹ� ������ �� ����
		
		
		// java.util.StringTokenizer Ŭ������ �̿��ϴ� ���
		StringTokenizer stn = new StringTokenizer(str, ",");
	/*	System.out.println(stn); //<= NoNoNo
		System.out.println("��ũ�������� �̾ƾ���~!");
		System.out.println(stn.nextToken());
		System.out.println(stn.nextToken());
		System.out.println(stn.nextToken());
		System.out.println(stn.nextToken());
		System.out.println(stn.nextToken()); // <= ���ܿ�� ���� �߻�!
		*/
		System.out.println("�������� ���м�");
		while(stn.hasMoreTokens()) {
			System.out.println(stn.nextToken());
		}
		
	
		
	}
	
		
		
		
		
		
		
	
}
