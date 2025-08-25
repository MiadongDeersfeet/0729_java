package com.kh.last;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Run {

	public static void main(String[] args) {

		List<String> names = Arrays.asList("홍길동", "고길동", "짱구");
		for(String name : names) {
			System.out.println(name + "씨는 정말 못말려~~");
			
		}
		System.out.println("======================================");
		names.stream()
			.map(name -> name + "씨는 못말려~~")
			.forEach(System.out::println);
		// 스트림 API 와 람다를 사용한 출력을 해보았다.
		// 스트림(Stream)
		// 컬렉션, 배열 등의 데이터를 선언적으로 처리해주는 API
		// for문 -> 어떻게 반복하는지가 구체적인데
		// 함수형 -> 무엇을 할지 행위에 집중 (그냥 반복할 거야)
		// 파이프라이닝 -> 여러 연산을 연결해서 데이터를 다룰 수 있다
		
		System.out.println("======================================");
		// 60점 이상인 점수의 평균을 구해봐야겠다.
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
		System.out.println("우리 반의 60점 이상 평균점수는 : " + average + "입니다.");
		
		
		
		
		System.out.println("============================================");
		
		//--------------------------------------------------------------------------------------
		
		
		double streamAvg = Arrays.stream(scores)
								 .filter(score -> score >= 60) // 람다, 에로우 펑션?
								 .average()
								 .orElse(0.0);
		
		System.out.println(streamAvg);
		
		/*
		 * 메소드식별자(매개변수) {
		 * 		return 값;
		 * }
		 * 
		 * print(int a) {
		 * 		return a;
		 * }
		 * 
		 * (int a) -> { // 이름이 없을 때 쓸 수 있는 '익명함수'
		 * 		return a;
		 * }
		 * 
		 * (int a) -> return a;  // 중괄호만 생략해서 사용 가능
		 * 
		 * (int a) -> a; // 리턴문을 또 생략할 수 있어요.
		 * 
		 * (a) -> a;
		 * 
		 * a -> a;
		 */
		// 익명클래스 -> 선언과 동시에 객체를 생성하는 것
		SimpleCal adder = new SimpleCal() { // 여기 안에서만 사용하는 일회용 객체가 됩니다.
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
		// map(), filter() 는 두고두고 많이 쓰는 친구들이에요.
		// 미리미리 맛보기식으로 사용을 해봅시다^^!
		
		// filter : 조건에 맞는 것만 필터링 할 수 있음. if문의 역할을 하는 친구라고 생각합시다.
		//※※※앞에서 배웠던 전통적인 방식※※※
		List<String> coffee = Arrays.asList("아메리카노", "라떼", "콜드브루", "에스프레소", "헤이즐넛");
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
	
	// 함수형 인터페이스 선언
	@FunctionalInterface        // 이거 인터페이스 함수형이야~ 컴파일러가 아 이거 함수형 인터페이스구나! 에노테이션
	interface SimpleCal {
		int cal(int a, int b);  // 하나의 추상메소드만 가지고 있어야함
	}
	

}
