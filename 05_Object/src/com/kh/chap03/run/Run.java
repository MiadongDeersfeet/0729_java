package com.kh.chap03.run;

import java.util.Scanner;

import com.kh.chap03.model.vo.Coffee;

public class Run {

	
	public static void main(String[] args) {
		/*
		Coffee coffee = new Coffee();
		
		coffee.setName("아메리카노");
		coffee.getName();
		String name = coffee.getName();
		
		coffee.setBean("에티오피아");
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
		
		Coffee coffee = new Coffee(); // <- 객체(Object) 생성     instance화
		// 1. 참조자료형(레퍼런스 타입) 여기서는 클래스명 Coffee    <= 개발자가 생각하는 현실세계의 커피 데이터가 들어갈 수 있는 자료형 / 내가 생각하는 커피 모양의 자료형
		// 자바는 기본자료형 빼고는 참조자료형이다. 
		// 클래스를 만든다는 행위 == 사용자 정의 자료형을 만들겠다.
		// 2. 여러 개의 자료형에 여러 개의 값을 보관 + 기능
		// 3. 주소값을 저장
		
		//System.out.print(coffee.info()); // 커피 클래스의 메소드:인포 를 출력했네.
		// 사용자에게 값을 입력받아서 입력값을 필드에 대입해보도록 할게요.
		
		// 참조 자료형들은 전부 다 4byte입니다. 주소값만 담으면 돼서.
		Scanner sc = new Scanner(System.in); // 1. 스캐너 타입의 변수를 선언합니다 Scanner sc; 2. Scanner 객체를 생성합니다.; 
		System.out.print("상품명을 입력하시오 > "); 
		String name = sc.nextLine();
		coffee.setName(name);
		String coffeeName = coffee.getName();
		
		System.out.print("원두를 입력하시오 > ");
		String bean = sc.nextLine();
		coffee.setBean(bean);
		String coffeeBean = coffee.getBean();
		
		System.out.print("크기를 입력하시오 > ");
		String size = sc.nextLine();
		coffee.setSize(size);
		String coffeeSize = coffee.getSize();
		
		System.out.print("가격을 입력하시오 > ");
		int price = sc.nextInt();
		coffee.setPrice(price);
		int coffeePrice = coffee.getPrice();
	
		//System.out.print("상품명 : " + coffeeName + ", 원두 : " + coffeeBean + ", 사이즈 : " + coffeeSize + ", 가격 : " + coffeePrice); // 이렇게도 되네^^!
		System.out.println("===========================================================");
		System.out.print(coffee.info());//
		
		 
		 
		
	
		
		
	}
}
