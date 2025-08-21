package com.kh.operator;

import java.util.Scanner;


public class F_Logical {
/*
 * 논리 연산자 : 두 개의 논리값을 연산하는 연산자입니다.
 * 
 * [ 표현법 ]
 * 
 * 논리값 논리연산자 논리값 => 결과값도 논리값
 * 
 * 종류
 * 
 * 1. AND연산자 : 논리값 && 논리값
 * 좌항과 우항의 값이 모두 true여야만 최종 결과값이 true
 * 
 * 2. OR연산자 : 논리값 || 논리값 --> 엔터위 원화표시를 쉬프트와 함께 누르면 나오는 파이프라인
 * 좌항과 우항의 값 중 하나라도 true일 경우 최종 결과값이 true
 */
// AND
	public void method1() {
		
		// 계획
		//
		// 1. 사용자에게 정수값을 하나 입력받은 후
		// 2. 사용자가 입력한 정수값이 0보다 크면서 짝수인지 판별
		// 3. 그리고 나서 결과를 출력
		
		Scanner sc = new Scanner(System.in);
		
		// 1.
		System.out.println("정수 값을 입력해주세요 > ");
		int num = sc.nextInt();
		System.out.println(num); //모범시민이 해야할 일
		
		// 2.
		// 무슨 값? == num
		// 무슨 연산??
		// 1. 0보다 큰가(대소비교) => num > 0
		// 2. 짝수인가?(2로 나눈 나머지가 0과 일치하는가 => 동등비교) (num % 2) == 0
		
		// AND 연산자
		// &&의 의미 : 그리고, ~~이면서, ~~이고
		
		boolean result = (num > 0) && (num % 2 == 0);
		// 사용자가 입력한 정수가 0보다 크다(1) 그리고(3) 사용자가 입력한 정수를 2로 나눴을 때 나머지가 0인가요?(2)
		//System.out.println("다음 정수값이 10보다 크면서 짝수입니까? > " + (num > 10 && num % 2 == 0)); /* 내가 써본 코드
		System.out.println("다음 정수값이 10보다 크면서 짝수입니까? > " + result);
		
	}
	
	public void method2() {
		
		// 사용자에게 정수 값을 입력받아서
		// 1_1. 사용자가 입력한 정수 == number
		// 1_2. 1
		// 1_3. 100
		
		// 1 <= number <= 100 // => *이걸 그대로 사용하면 앞에 값을 트루/펄스로 계산하기에 뒤에랑은 자료형이 안맞음*
		// (number >= 1) && (number <= 100)
		// 2_1. (0 < number) && (number < 101)
		// 2_2. (100 >= number) && (1 <= number)
		// 2_3. (1 <= number) && (number <= 100)  ※알아보기 쉬우니까 이걸 선호합니다.※ ※변수끼리 가운데 몰아주니까 가독성이 좋네.※
		
		// 변수에 대입해주세요.
		
		// 출력해보세요.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1부터 100사이의 숫자를 입력해주세요 > ");
		int num = sc.nextInt();
		
		System.out.println("입력받은 값 : " + num);
		
		//boolean result = (num <= 100);
		boolean result = (1 <= num) && (num <= 100);
		System.out.println("사용자가 입력한 값이 1부터 100사이의 숫자인가요? > " + result);
		
	}
	
	// OR
	
	public void method3() {
		
		// 사용자에게 한 글자를 입력 받아서
		// 입력받은 값이 'A' 또는 'a'인지 확인해서 출력하기
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("한 글자만 입력하세요 > ");
		char letter = sc.nextLine().charAt(0);
		System.out.print(letter);
		boolean result = (letter == 'a') || (letter == 'A');
		System.out.println("\n사용자가 입력한 값이 'A' 또는 'a'인가요? > " + result);
		
	
		//String str = "KH정보교육원"; // 문자열 == 시퀀스자료형 (순서가 있는 문자가 들어가야해) --> 이 순서를 인덱스(목차)라고 하거든 --> 문자열들도 인덱스가 달려있어.
		//char ch = str.charAt(2);
		//System.out.println(ch);
		//char ch = str.charAt(5);
		//System.out.println(ch);
		//System.out.print("ABCDEFG");
		
		// 무슨 값?
		// 1_1. 사용자가 입력한 한 글자 == letter에 담아놨어요.
		// 1_2. 'A'
		// 1_3. 'a'
		// 1_4.
		// 무슨 연산? 동등비교 (==)
		// 단일 문자의 경우 동등비교 연산이 가능한가?
		// 가능하다! =
		// char형이 int형으로 자동형변환이 일어난 뒤 연산을 함 => 숫자로 인식
		
	}
	/* AND(&&) : 두 개의 조건이 모두 true일 경우 true
	 * 
	 * true && true : true
	 * true && false : false
	 * false && fasle : false
	 * false && true : false
	 * 
	 * OR(||) : 두 개의 조건 중 하나라도 true일 경우 true
	 * 
	 * true || true : true
	 * true || false : true
	 * false || true : true
	 * false || false : false
	 */
	
	public void tip() {
		
		int num = 10;
		
		boolean result = false && (num > 0); //AND 연산에서 좌항이 첫번째인데 앤드연산에선 둘다 트루여야하니 좌항부터 의미가 없음
		
		boolean result2 = (num < 0) && (num == 10); //자바에서 AND 연산하는데 좌항에서 false가 나오면 컴퓨터가 뒤에는 안해버립니다. 숏 서킷 연산
		
		
		
		
	}
	
	
}
