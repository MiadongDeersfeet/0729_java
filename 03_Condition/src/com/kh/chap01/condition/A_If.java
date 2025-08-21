package com.kh.chap01.condition;

import java.util.Scanner;

public class A_If {
/*
 * (단일) if문
 * 
 * [ 표현법 ]
 * 
 * if(조건식) {
 * 
 * 		조건식이 true일 경우 실행하고자 하는 코드;
 * 
 * }
 * 
 * => 조건식의 결과가 true일 경우 : if문 Scope({})안의 코드가 수행
 * => 조건식의 결과가 false일 경우 : if문 Scope({})를 건너뜀!
 */
	
	public void method1() {
		
		//System.out.println("모범시민 맞다~");
		
		if(0 < 1) {
			System.out.println("0이 1보다 작아용");
			
		}
		
		// if문의 조건식자리에는 결론적으로 true 아니면 false 값이 들어가도록 만들어야함! 소괄호()는 값이 들어가는 자리예요.
		
		if(false) {
			System.out.println("얘는 죽었다 깨어나도 안나옴");
			
		}
		
		if(true) {
			
			System.out.println("조건식 자리에는 최종적으로 true가 와야함");
			
		}
		
		
			
		}
		
	public void method2() {
		
		boolean loginCheck = true; // 로그인 상태를 저장해둔 변수
		
		if(!loginCheck) {
			
			System.out.println("네이버를 더 안전하고 편리하게 이용해보세요.");
			System.out.println("NAVER 로그인");
			System.out.println("아이디 찾기 | 비밀번호 찾기 | 회원가입");
			
		}
		
		if(loginCheck) {
			System.out.println("김윤기님 환영합니다 :)");
			System.out.println("메일 | 카페 | 블로그 | 쇼핑 | 예약");
			
		}
		
		public void lunchMenu() {
			
			
			// 오늘의 날씨를 입력받아서
			Scanner sc = new Scanner(System.in);
			
			System.out.print("오늘의 날씨는 어떤가요?(더움 / 맑음 / 비옴) > ");
			// 더움 / 맑음 / 비옴
			String weather = sc.nextLine();
			//System.out.println(weather); //모범시민
			
			// 점심메뉴를 추천해주는 프로그램
			// 더움을 입력했다면 냉면나라 
			// ↓
			// 사용자가 입력한 값과 "비옴"이라는 문자열값을 동등비교해서 일치하는지 비교
			// weather 동등비교 "비옴"
			
			//System.out.println(weather == "비옴"); //문자열 "비옴"은 동등비교 연산이 불가능하다. (다음주에 배울 내용)
			                                      //대신에 비옴이 동등비교 일치하는지 연결해주는 메소드가 있다. => ※ .equals()
			//System.out.println(weather.equals("비옴"));
					
					// 조건
					// 만약에 사용자가 입력한 문자열이 "비옴"과 일치하다면
					//
					if(weather.equals("비옴")) {
						System.out.println("김밥천국 진라면을 추천합니다.");
					}
					
					if(weather.equals("더움")) {
						System.out.println("냉면나라 소바공주의 함흥냉면을 추천합니다.");
					}
					
					if(weather.equals("맑음")) {
						System.out.println("OO은행 사내식당 3층 한식을 추천합니다.");
					}
					//else {
						//System.out.println("잘못된 메세지입니다.");
					//}
	}
	
		public void method3() {
			
		
			// 사용자에게 정수값을 입력받아서 홀 / 짝을 판별 => 출력
			// if문을 이용해서 출력
			// 단, 입력받은 정수가 0보다 클 경우에만 조건문을 실행!
			
			//Scanner
			//Print + int num sc + 모범시민
			// if((num % 2 == 0))
			
			//if
			
			//조건식
			
			//비교연산 (값 이랑 연산자)
			
			
			Scanner sc = new Scanner(System.in);
			System.out.print("0보다 큰 숫자를 입력하세요 > ");
			int num = sc.nextInt();
			//System.out.println(num); //모범시민
			
			
			
			//char oddEven = (num % 2 == 0) ? '짝' : '홀';
			
			
				
			
			
			//if(num % 2 == 0 && num > 0) { System.out.println(num + "은(는) 짝수입니다."); }
			//if(num % 2 != 0) { System.out.println(num + "은(는) 홀수입니다."); }
			//if(num == 0) { System.out.println("잘못된 메세지입니다."); }
				
		    //선생님의 첨삭파트//
			//if(num % 2 == 0 && num > 0) { System.out.println("짝수"); }
			//if(num % 2 != 0 && num > 0) { System.out.println("홀수"); }
			//if(num > 0 && num % 2 == 0) { System.out.println("짝수"); }
			
			//boolean flag = num > 0;
			
			//if(flag && num % 2 == 0) { System.out.println("짝수"); }
			//if(flag && num % 2 != 0) { System.out.println("홀수"); }
					
			// 비교연산
			// 1. 입력받은 정수가 0보다 클 경우에만
			// number > 0
			
			// &&
			// 2. 홀/짝
			// 입력받은 정수를 2로 나눈 나머지를 0과 동등비교해서
			// number % 2 == 0 짝수(true 일 때)
			// !number % 2 == 0 홀수(true 일 때) 
				
				
			
			
			//if(num > 0 == true) {
			//	System.out.println(num + "은(는) " + oddEven + "수 입니다.");
			
			// if문 중첩
			if(num > 0) {
				if(num % 2 == 0) System.out.println("짝수");
				if(num % 2 != 0) System.out.println("홀수");
			}
			
		}
		
		// 뚝섬플레이스 if문 응용 
		public void method4() {
			
		​

		}
		
}