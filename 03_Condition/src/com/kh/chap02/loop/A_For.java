package com.kh.chap02.loop;

import java.util.Scanner;

public class A_For {

	public void method0() {
		
		//System.out.println("자 월요일 힘내보아요~~!~!");
		//System.out.println("자 월요일 힘내보아요~~!~!");
		//System.out.println("자 월요일 힘내보아요~~!~!");
		// 반복해야하는 횟수가 328,765번이라면...?
		// For (자바에서는 ~동안 의 의미에 가까운 것 같아요.)
		// for(초기식; 조건식; 증감식;) 안에는 총 세 가지의 식을 작성합니다.
		for(
				int i = 0;
				i < 5;
				i++
				) {
			System.out.println("돌려돌려~~");
		}
		/*
		 * for() {
		 * 
		 * }
		 * 
		 * 괄호안은 반복의 횟수를 지정하는 부분
		 * 초기식; 조건식; 증감식; 세 가지로 이루어짐
		 * ;; 세미콜론으로 구분함
		 * 
		 * [ 표현법 ]
		 * 
		 * for(초기식; 조건식; 증감식) {
		 * 			반복적으로 실행하고자 하는 코드;
		 * }
		 * 
		 * 
		 * - 초기식 : 반복문을 시작할 때 "초기에 단 한번만 실행"될 구문
		 * 			반복을 할 때 필요한 변수를 선언하고 초기화 하는 구문(제어변수) => int i = 0;
		 * 
		 * - 조건식 : "반복문이 실행될 조건"을 작성하는 구문
		 *           조건식의 결과가 true일 경우 반복을 수행
		 *           조건식의 결과가 false일 경우 반복문을 멈추고 for문 블럭을 빠져나옴 => i < 5;
		 * 
		 * - 증감식 : "반복문을 제어하는 변수에 대입된 값"을 증감하는 구문
		 *           보통 초기식에서 선언된 변수를 가지고 증감식 작성
		 *           이 때, 보편적으로 증감연산자를 사용함 => i++
		 */
		
		public void method1() {
			// 지인~~~짜 단순하게
			// 1
			// 2
			// 3
			// 4
			// 5
			//System.out.println(1);
			//System.out.println(2);
			//System.out.println(3);
			//System.out.println(4);
			//System.out.println(5);
			//System.out.println("1\n2\n3\n4\n5\n6\n7\n8\n9\n10\n11\n12\n13\n14\n15\n16\n17\n18\n19\n20");
			// ↓ 미쳤따리!!!!!!!!!!!!!!
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			// for 를 만나면 소괄호 하는 동안 스코프 안에꺼 해야겠네 ?_? // 정수형 변수 i를 선언함. (자료형 = type 이 자바에서 가장 중요합니다.)
			for(/* 1 */ int i = 1; /* 2 */ i <= 5; /* 4 */ i++) {
				/* 3 */ System.out.println(i + "번 반복");
			} // 3번이 끝나면 닫는 스코프를 만나고 4번 증감식으로 이동합니다. // 4번이 끝나면 2번으로 돌아갑니다.(1번은 처음에 한 번만 하고 끝나는 거니까) // for()는 1번에서 시작, 
																																//2번에서 종료(거짓이 나올 때까지)
																																//2-3-4의 반복(거짓이 나올 때까지)
			//선생님 개인적 피셜에 선생님이 경험해보신 개발업체 환경에서는 int i = 0; i <= 2; i++ 기본베이스를 좋아하는 것 같다고 하심. (한국 일본)
			// 자 그러면 짜잘짜잘이들
			// for문을 이용해서 반복을 3번 한다고 가정
			// i, j, k 기본 베이스는 i 이고 이중for문, 삼중for문 되면 j, k 들어갑니다. //초기식 제어변수선언 초기화할 때 보편적으로 0; 으로 합니다.
			for(int i = 0; i < 3; i++) {
				System.out.println(i);
			}

			for(int i = 0; i < 240; i+=3) { //2의 배수, 3의 배수
				System.out.println(i);
			}
		
			System.out.println("===============================");
			
			for(int i = 100; i >= 1; i--) {
				System.out.println(i);
			}
		
			
			public void gugudan() {
				
				// 구구단 프로그램
				// 사용자에게 정수를 입력받아서
				// 사용자가 입력한 정수를 이용해서 구구단을 출력해보기
				
				Scanner sc = new Scanner(System.in);
				System.out.println("★★★구구단을 외자, 구구단을 외자★★★");
				System.out.println("몇 단을 출력하시겠습니까? > ");
				int dan = sc.nextInt();
				System.out.println(dan + "단을 출력하겠습니다.");
				for(int i = 1; i <= 9; i++) {
					System.out.println(dan + " X " + i + " = " + (dan * i));
				}
			}
				public void method2() {
					
					// 정사각형 짓기
					// ★★★
					// ★★★
					// ★★★
					//System.out.println("★★★");
					//System.out.println("★★★");
					//System.out.println("★★★");
					
					/*for(int i = 0; i < 3; i++) {
						System.out.print("★");
					}
					
					System.out.println();
					
					for(int i = 0; i < 3; i++) {
						System.out.print("★");
					}
					
					System.out.println();
					
					for(int i = 0; i < 3; i++) {
						System.out.print("★");
					}
					
					System.out.println();
					
				}*/
			
				for(int i = 0; i < 3; i++) {
					for(int j = 0; j < 3; j++) {
						System.out.print("★");
						
					}
					System.out.println();
				
				}
				
				//출력 : X번째 반복입니다.
				//10번째 반복마다 ♡를 하나씩 찍어주기
			for(int i = 0; i < 100; i++) {
				System.out.println((i + 1) + "번째 반복입니다.");
				
				// 제가 하고 싶었던 부분
				// (i + 1) == 10 || (i + 1) == 20 || (i + 1) == 30
				// (i + 1) % 10 == 0
				if((i + 1) % 10 == 0) {
					System.out.println("♡");
				}
				
				public void method3() {
					
					for(;;) { //이런 양식으로 안아준 부분은 무한히 반복됩니다.
						
					
					System.out.println("구구단 프로그램 ~~~");
					System.out.println("1. 구구단 프로그램 시작하기");
					System.out.println("2. 구구단 프로그램 설명보기");
					System.out.println("3. 프로그램 종료하기");
					Scanner sc = new Scanner(System.in);
					System.out.print("메뉴를 선택해주세요 > ");
					int menuNo = sc.nextInt();
					sc.nextLine();
					
					if(menuNo == 1) {
						gugudan();
					} else if(menuNo == 2) {
						System.out.println("구구단을 동작시켜주세요");
						System.out.println("참 재미있어요");
					} else if(menuNo == 3 ) {
						System.out.println("프로그램을 종료합니다");
						return;
					} else {
						System.out.println("없는 메뉴입니다");
					}
					System.out.println();
					
					}
				
					
					
					
					
				}
				
			
				
			
		
				
		
	
	
}
