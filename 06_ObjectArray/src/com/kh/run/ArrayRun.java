package com.kh.run;

import java.util.Scanner;

import com.kh.model.vo.Restaurant;

public class ArrayRun {

	public static void main(String[] args) {
		
		// 배열의 특징   <=  자료구조에 대해서 물어보는 거니까
		//
		// 논리적인 구조와 물리적인 구조가 동일하다.   <=  이게 가장 먼저 나와야합니다.
		// 같은 자료형끼리만 담을 수 있다 => 동종 모음(homogeneous vowels)
		// 하나의 배열에 여러 값을 담을 수 있음
		// 메모리상에 공간
		// 참조자료형
		// 인덱스개념이 존재함
		// 명확한 크기를 명시해야함 => 크기를 바꾸는 것은 불가능함
		
//		int[] nums = new int[3];   //<= 처음 배웠던 방법
//		int[] num = {1, 2, 3, 4};    //<= 일반적인 배열 사용방법
//		String[] strs = new String[5];
		
		// 자바에서 기본자료형을 제외한 나머지는
		// 전부 참조자료형
		// 참조자료형 공간에 대입될 수 있는 값은 오로지 주.소.값

		// 객체배열의 선언 및 할당!
		// [ 표현법 ]
		// 참조자료형[] 배열식별자 = new 참조자료형[배열크기];             <= 똑같아요. 클래스명 --> 참조자료형으로 바뀔 뿐이야.
		
		Restaurant[] restaurants = new Restaurant[3];   // <= 나중에 여기서 인덱스 숫자만 늘리면 나머지 코드를 만질 필요 없이 확장이 가능합니다. 확장성이 매우 좋아졌습니다.
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < restaurants.length; i++) {
			System.out.print("상호명을 입력하세요 > ");
			String storeName = sc.nextLine();
			
			System.out.print("주소지를 입력하세요 > ");
			String address = sc.nextLine();
			
			System.out.print("대표메뉴를 입력하세요 > ");
			String mainMenu = sc.nextLine();
			
			restaurants[i] = new Restaurant(storeName, address, mainMenu);

		}
	/*	System.out.println(restaurants);
		System.out.println(restaurants[0]);
		// 주소값을 확인하고 싶었던 것은 아님
		System.out.println(restaurants[0].getMainMenu());
		
		System.out.println(restaurants[0].info());
		System.out.println(restaurants[1].info());
		System.out.println(restaurants[2].info());
	*/	
		for(int i = 0; i < restaurants.length; i++) {
			System.out.println(restaurants[i].info());	
		}  // <== 어메이징
		
		System.out.print("상호명을 입력해주세요 > ");
		String searched = sc.nextLine();
		
		for(int i = 0; i < restaurants.length; i++) {
			if(searched.equals(restaurants[i].getStoreName())) {
				System.out.println("대표 메뉴 : " + restaurants[i].getMainMenu());
			}
		}
	
		
		
		
		
		
		
		
		
	}

}
