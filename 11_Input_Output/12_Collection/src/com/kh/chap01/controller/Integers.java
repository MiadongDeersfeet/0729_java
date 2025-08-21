package com.kh.chap01.controller;

import java.util.Arrays;

public class Integers {

	private int[] integers;
	private int size;
	
	public Integers() {
		integers = new int[3];
	}
	
	public void add(int element) { // ������ �迭�� �Է��� �ؾ��ϴϱ� int�� �ʿ��ϰ���.
		if(integers.length == size + 1) {									// ������ + 1�� ���� �÷��ְ� ���� ����.
		integers = Arrays.copyOf(integers, (integers.length * 2)); 			//  <= ���� ���� �׷��� �̷��� �ϸ� add �� ������ �迭�� ��� �þ �ſ���.��
		}																// 	�츮�� �迭 ������ á�� ���� �÷��ְ� ���� �Űŵ��. ������ �־��ָ� ���ڳ׿�?
		integers[size++] = element; // ù ��° add �� �� 0�� �ε����� ���Ե� ���̰�, �� ��° add �� �� 1�� �ε����� ���Ե� ���̰� ....
	}								// �迭�� ���� �����ϸ� ���������� �������. �׷��� ���������� ���� ������ �迭�� �Ű�����ϴµ� � ����� ������?
									// �� ���� ���簡 �־��. => ���� �迭�� ũ�⺸�� ū �迭�� �������ֱ�
		
		public int get(int index) {
			return integers[index];
		}
		
		
		
//	public boolean isEmpty() {
		
//	}
	
	@Override
	public String toString() {
		return Arrays.toString(integers);
	}
	
	
	
}
