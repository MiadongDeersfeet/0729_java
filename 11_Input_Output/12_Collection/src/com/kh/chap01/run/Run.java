package com.kh.chap01.run;

import com.kh.chap01.controller.Integers;

public class Run {

	public static void main(String[] args) {
/*
		// ���� ���� ������ �ٷ�� ���� ��Ȯ�ϰ� �� ���� ������ �ٷ��� �� �� ���� ��Ȳ
		 
		int[] integers = new int[3];
		integers[0] = 1;
		integers[1] = 5;
		integers[2] = 6;
		inergers = new int[5] // <= �̷��� �ϸ� ������ �ִ� �͵��� �� ���ư��ݾƿ�.
*/		
		Integers integers = new Integers(); // ���� ���� �ϳ� �̷��� �ϳ� 3ĭ¥�� �迭�� �� �Ȱ��ƿ�.
		integers.add(10); // 0�� �ε����� ����
		integers.add(60); // 1�� �ε����� ����
		integers.add(30); // 2�� �ε����� ����
//		integers.add(20); // 3ĭ�� �����߾��� ������ ArrayIndexOutOfBoundsException �߻���.
		integers.add(50);
		integers.add(100);
		integers.add(70);
		integers.add(90);
		
		int element = integers.get(2);
		System.out.println(element);
		
		System.out.println(integers);
		
		
		
	}

}
