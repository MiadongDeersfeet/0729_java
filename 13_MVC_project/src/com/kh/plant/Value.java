package com.kh.plant;

public class Value {

	public static void main(String[] args) {

	//	String name = "������";
	//	String name2 = "����";
	//  �ϴٺ��� �����ϳ�? �迭 �Ẹ��	
		
	//	String[] name = new String[10];
	//	int[] age = new int[10];
	//	String[] address = new String[10];
	// �Ẹ�� ���ε��� �ϱ� �����? �߰��� �ְ� ���� �ϱ⵵ �����? �̸�/����/�ּҸ� ���� �� �ִ� ��� ����?
	// �׷��� ��ü�� ���Ծ��.
	// ���� ������ ���⼭ ���ϰ� �̹� Person Ŭ������ �س����.
		
		
		Person kim = new Person("������", 28, "����");
		Person noor = new Person("����", 30, "����");
		Person sung = new Person("������", 20, "����");
		
		// �̰͵� �����ϳ� �������ϱ�? �̰͵� �ϳ��� �迭�� ��ƺ���!
		
		Person[] persons = new Person[20];
		persons[0] = new Person("������", 28, "����");
		persons[1] = new Person("����", 30, "����");
		persons[2] = new Person("������", 20, "����");
		
		// �ϴٺ��� �ʹ� �������� ���� �߰�/���� ���� �����.
		// ��� �ٵ� �ڹٿ��� �̷� �� �� �� �ֵ��� List ��� �� ��������?
		// �����Ӱ� �߰�/���� �ϴ� ����� ���ԵǾ� �ֳ�?
		
		
	}

}
