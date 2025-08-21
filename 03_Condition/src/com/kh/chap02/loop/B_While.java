package com.kh.chap02.loop;

public class B_While {
/*
 * while문
 * 
 * [ 표현법 ]
 * 
 * 초기식; //와일문 선언 전에 있어요. 단, 필수는 아니예요.
 * 
 * while(조건식) {
 * 
 *		반복적으로 실행하고자 하는 코드; 
 * 		증감식;		// 필수는 아님
 *
 * }
 *  
 * while문의 조건식의 결과값이 true일 경우 반복적으로 실행하고자 하는 코드가 실행됩니다. - 끝 !
 * 
 *   for			=> 개발자가 반복의 횟수를 명확하게 알고 있다.
 *   while			=> 개발자가 반복의 횟수를 가늠할 수 없음.
 *   
 *   무한반복
 *   
 *   for(;;) 		=> 개발자들이 아리까리 할 수 있음. 실수인가? 무한반복인가? but while문의 경우에는 무한반복이라는 의도를 알 수 있음.
 *  
 */
	
	public void method1() {
		while(true) { //무한반복의 용도
			System.out.println("계속 반복할거예요~~~~");
		}
		
	}
	
		public void method2() {
			
			// 초기식, 조건식, 증감식 써봐야지
			
			int i = 0;
			
			while(i < 3) {
				System.out.println(i);
				i++; // 위아래 순서가 바뀌면 0-1-2 에서 => 1-2-3 이 될 수도 있어요. 주의하세요.
			}
			
	}
	
		public void method3() {
			
			// 1 ~ 10까지의 정수 중 짝수의 합 출력
			// 55
			// 2550
			// System.out.println(2 + 4 + 6 + 8 + 10); // 요구사항이 있으면 항상 본질에 집중해야합니다.
			
			int i = 1;
			int save = 0; //합계를 저장해둘 변수

			while(i <= 10) {
				if(i % 2 == 0) {
					save += i;
				}
				
				i++;
				
			}
				System.out.println("합계 : " + save);


				
		}
		
		public void method4() {
			
			// 합계 sum
			// 1부터 시작해서
			// 1 ~ 10 사이의 랜덤한 정수까지를 모두 더한 합계를 출력
			// 1	   5
			// 1 2 3 4 5
			// 1   3
			// 1 2 3
			// random : 무작위
			// Random이라는 클래스가 존재
			// Math라는 클래스가 가지고 있는 random() 메소드를 호출해서 만들어 볼 예정
			
			// Math math = new Math(); // 별칭짓기 특이케이스 // 다음주에 합시다
			//Math.random();
			//System.out.println(Math.random());
			//0.10771321719494875
			//0.0031122875405408257 더블 타입의 실수
			// random()의 결과값 : 0.0 ~~~~ 0.9999999999999999
			
			// 1단계. random() 호출 결과 체크
			double num = Math.random();
			//System.out.println(num);
			// 1 ~ 10
			
			// 2_1. num 에 10을 곱하면??
			// 0.0 ~~~~ 9.9999999999999999
			//System.out.println(num * 10);
			// 2_2. int형을 강제형 변환
			//		0 ~~~~ 9
			//System.out.println((int)(num * 10)); //괄호 잘 치셔야해요.
			// 2_3. +1
			//		1 ~~~~ 10
			
			int randomNum = (int)(Math.random() * 10) + 1;
			System.out.println("가공이 끝난 무작위 정수 : " + randomNum); //8
			// (int)(Math.random() * 10) + 시작값; // +100 했다 그럼 100부터 시작, +10했다 그럼 10부터 시작
			// 그러면 곱하기 10은 뭐냐? 범위를, 몇개의 랜덤값을 만들어낼거냐~~의 문제 // 100까지 하고싶으면 블라블라 *100) + 1 이 되는거고....
			
			// 3단계. 누적합계 구하기
			// 1부터 랜덤한 수 (1 ~ 10)까지를 모두 더한 합계
			
			int i = 1;
			int sum = 0;
			
			// 1부터 10까지중 무작위까지 반복하겠다.
			while(i <= randomNum) {
				sum += i;
				i++;
			}
			System.out.println("1부터 " + randomNum + "까지 더한 결과 : " + sum); // 36
		}
		
		public void lotto() {
			
			// 로또 번호 생성기 ver_0.1
			// 범위 : 1 ~ 45
			// 6개 선택
			// 1 ~ 45 정수 중 랜덤한 수 하나만 뽑아 내려면?
			// (Math.random() * 45)  // 0~0.9999999999999999
			// 0.0 x 45 = 0.0 이고, 0.0 ~ 44.999999999
		int num1 = (int)(Math.random() * 45) + 1;
		int num2 = (int)(Math.random() * 45) + 1;
		int num3 = (int)(Math.random() * 45) + 1;
		int num4 = (int)(Math.random() * 45) + 1;
		int num5 = (int)(Math.random() * 45) + 1;
		int num6 = (int)(Math.random() * 45) + 1;
		
		System.out.println("이번주는 이걸로 사야겠다 > ");
		System.out.printf("%d, %d, %d, %d, %d, %d", num1, num2, num3, num4, num5, num6);
		
		
		
		}
		/*
		 * do-while
		 * 
		 * 별도의 조건검사 없이 무조건 한 번은 실행!!!!!!!!!!!!!!!!
		 * 조건이 true값이 아니더라도 한 번은 꼭 수행!!!!!!!!!!!!!!!
		 *
		 * [ 표현법 ]
		 * 
		 *  초기식; // 필수 X
		 * 
		 * do {
		 * 		실행할코드;
		 * 	 	증감식; // 필수 X
		 * } while(조건식);
		 */
		
		public void method5() { //do-while
			/*
			while(false) {
				System.out.println("먼데 이건");
				
			}
			*/
			
			do {
				System.out.println("나는 한 번은 돌아~~");
			} while(false);
		}
		
		
	
}
