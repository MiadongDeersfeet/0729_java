package com.kh.last;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Run {

	public static void main(String[] args) {

		List<String> names = Arrays.asList("ȫ�浿", "��浿", "¯��");
		for(String name : names) {
			System.out.println(name + "���� ���� ������~~");
			
		}
		System.out.println("======================================");
		names.stream()
			.map(name -> name + "���� ������~~")
			.forEach(System.out::println);
		// ��Ʈ�� API �� ���ٸ� ����� ����� �غ��Ҵ�.
		// ��Ʈ��(Stream)
		// �÷���, �迭 ���� �����͸� ���������� ó�����ִ� API
		// for�� -> ��� �ݺ��ϴ����� ��ü���ε�
		// �Լ��� -> ������ ���� ������ ���� (�׳� �ݺ��� �ž�)
		// ���������̴� -> ���� ������ �����ؼ� �����͸� �ٷ� �� �ִ�
		
		System.out.println("======================================");
		// 60�� �̻��� ������ ����� ���غ��߰ڴ�.
		int[] scores = {88, 50, 72, 90, 100, 20, 40};
		int sum = 0;
		int count = 0;
		
		
		//-------------------------------------------------------------------------------------
		
		for(int score : scores) {
			if(score >= 60) {
				sum += score;
				count++;
			}
		}
		
		double average = (double)sum / count;
		System.out.println("�츮 ���� 60�� �̻� ��������� : " + average + "�Դϴ�.");
		
		
		
		
		System.out.println("============================================");
		
		//--------------------------------------------------------------------------------------
		
		
		double streamAvg = Arrays.stream(scores)
								 .filter(score -> score >= 60) // ����, ���ο� ���?
								 .average()
								 .orElse(0.0);
		
		System.out.println(streamAvg);
		
		/*
		 * �޼ҵ�ĺ���(�Ű�����) {
		 * 		return ��;
		 * }
		 * 
		 * print(int a) {
		 * 		return a;
		 * }
		 * 
		 * (int a) -> { // �̸��� ���� �� �� �� �ִ� '�͸��Լ�'
		 * 		return a;
		 * }
		 * 
		 * (int a) -> return a;  // �߰�ȣ�� �����ؼ� ��� ����
		 * 
		 * (int a) -> a; // ���Ϲ��� �� ������ �� �־��.
		 * 
		 * (a) -> a;
		 * 
		 * a -> a;
		 */
		// �͸�Ŭ���� -> ����� ���ÿ� ��ü�� �����ϴ� ��
		SimpleCal adder = new SimpleCal() { // ���� �ȿ����� ����ϴ� ��ȸ�� ��ü�� �˴ϴ�.
			@Override
			public int cal(int a, int b) {
				return a + b;
			}
		};
		
		SimpleCal minuser = new SimpleCal() {
			@Override
			public int cal(int a, int b) {
				return a - b;
			}
		
		};
		System.out.println("5 + 3 = " + adder.cal(5, 3));
		System.out.println("5 - 3 = " + minuser.cal(5, 3));
		
		SimpleCal adder2 = (a, b) -> a + b;
		SimpleCal minuser2 = (a, b) -> a - b;
		System.out.println("2 + 4 = " + adder2.cal(2, 4));
		System.out.println("2 - 4 = " + minuser2.cal(2, 4));
		
		
		//-------------------------------------------------------------------------------------
		// map(), filter() �� �ΰ�ΰ� ���� ���� ģ�����̿���.
		// �̸��̸� ����������� ����� �غ��ô�^^!
		
		// filter : ���ǿ� �´� �͸� ���͸� �� �� ����. if���� ������ �ϴ� ģ����� �����սô�.
		//�ءءؾտ��� ����� �������� ��ġءء�
		List<String> coffee = Arrays.asList("�Ƹ޸�ī��", "��", "�ݵ���", "����������", "�������");
		List<String> longNameCoffee = new ArrayList();
		
		for(String c : coffee) {
			if(c.length() == 5) {
				longNameCoffee.add(c);
			}
		}
		System.out.println(longNameCoffee);
		//-------------------------------------------------------------------------------------
		
		List<String> coffeeList = coffee.stream()
									.filter(c -> c.length() == 5)
									.collect(Collectors.toList());
		System.out.println(coffeeList);
		
		
	}
	
	// �Լ��� �������̽� ����
	@FunctionalInterface        // �̰� �������̽� �Լ����̾�~ �����Ϸ��� �� �̰� �Լ��� �������̽�����! �������̼�
	interface SimpleCal {
		int cal(int a, int b);  // �ϳ��� �߻�޼ҵ常 ������ �־����
	}
	

}
