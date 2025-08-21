package com.kh.run;

// import java.lang.*;
// 복습을 합시다~~~~

public class MathRun {

	public static void main(String[] args) {
		
		// Java API (자바라는 언어에서 응용프로그램을 만들 때 수월할 수 있도록 제공해주는 인터페이스들을 뜻한다.)
	    //	String str; // <= byte형 배열이에요.
		// Math 클래스(수학)
		
		// Math math = new Math(); <= 얘는 이렇게 못불러요. private 이거든요.
		/*
		 * - 모든 필드와 메소드가 전부 다 static
		 * - 객체를 생성할 필요가 없으므로 기본생성자의 접근제한자가 private 입니다.
		 * - java.lang 패키지에 있는 친구들은 전부 다 
		 */
		// 필드
		// 파이 => Math클래스 내에 상수필드로 정의되어있음
		System.out.println(Math.PI);
		
		// 메소드 => 파이는 잘 안쓰는데 메소드는 쓸 일이 좀 있어요.
		// 1. 제곱 => Math.pow()
		System.out.println("2의 10제곱 : " + Math.pow(2,  10));
		
		// 2. 절대값 => Math.abs(int, double, long, float)
		System.out.println("절대값 : " + Math.abs(-33));
		
		double num = 8.141414;
	
		// 1. 올림
		System.out.println("올림 : " + Math.ceil(num));
		
		// 2. 버림 => Math.floor(double) : double
		System.out.println("버림 : " + Math.floor(num));
		
		// 3. 반올림 => Math.round(double) : long <= 얘는 웃긴게 매개변수는 더블인데 반환타입은 롱이에요.
		System.out.println("반올림 : " + Math.round(num));
		
		
		
		
		
		
		
		
		
	}

}
