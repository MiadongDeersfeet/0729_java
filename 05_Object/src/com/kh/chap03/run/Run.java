package com.kh.chap03.run;

import java.util.Scanner;

import com.kh.chap03.model.vo.Coffee;

public class Run {

	
	public static void main(String[] args) {
		/*
		Coffee coffee = new Coffee();
		
		coffee.setName("�Ƹ޸�ī��");
		coffee.getName();
		String name = coffee.getName();
		
		coffee.setBean("��Ƽ���Ǿ�");
		coffee.getBean();
		String bean = coffee.getBean();
		
		coffee.setSize("12oz");
		coffee.getSize();
		String size = coffee.getSize();
		
		coffee.setPrice(12000);
		coffee.getPrice();
		int price = coffee.getPrice();
		
		coffee.info();
		String info = coffee.info();
		System.out.println(info);
		*/
		
		Coffee coffee = new Coffee(); // <- ��ü(Object) ����     instanceȭ
		// 1. �����ڷ���(���۷��� Ÿ��) ���⼭�� Ŭ������ Coffee    <= �����ڰ� �����ϴ� ���Ǽ����� Ŀ�� �����Ͱ� �� �� �ִ� �ڷ��� / ���� �����ϴ� Ŀ�� ����� �ڷ���
		// �ڹٴ� �⺻�ڷ��� ����� �����ڷ����̴�. 
		// Ŭ������ ����ٴ� ���� == ����� ���� �ڷ����� ����ڴ�.
		// 2. ���� ���� �ڷ����� ���� ���� ���� ���� + ���
		// 3. �ּҰ��� ����
		
		//System.out.print(coffee.info()); // Ŀ�� Ŭ������ �޼ҵ�:���� �� ����߳�.
		// ����ڿ��� ���� �Է¹޾Ƽ� �Է°��� �ʵ忡 �����غ����� �ҰԿ�.
		
		// ���� �ڷ������� ���� �� 4byte�Դϴ�. �ּҰ��� ������ �ż�.
		Scanner sc = new Scanner(System.in); // 1. ��ĳ�� Ÿ���� ������ �����մϴ� Scanner sc; 2. Scanner ��ü�� �����մϴ�.; 
		System.out.print("��ǰ���� �Է��Ͻÿ� > "); 
		String name = sc.nextLine();
		coffee.setName(name);
		String coffeeName = coffee.getName();
		
		System.out.print("���θ� �Է��Ͻÿ� > ");
		String bean = sc.nextLine();
		coffee.setBean(bean);
		String coffeeBean = coffee.getBean();
		
		System.out.print("ũ�⸦ �Է��Ͻÿ� > ");
		String size = sc.nextLine();
		coffee.setSize(size);
		String coffeeSize = coffee.getSize();
		
		System.out.print("������ �Է��Ͻÿ� > ");
		int price = sc.nextInt();
		coffee.setPrice(price);
		int coffeePrice = coffee.getPrice();
	
		//System.out.print("��ǰ�� : " + coffeeName + ", ���� : " + coffeeBean + ", ������ : " + coffeeSize + ", ���� : " + coffeePrice); // �̷��Ե� �ǳ�^^!
		System.out.println("===========================================================");
		System.out.print(coffee.info());//
		
		 
		 
		
	
		
		
	}
}
