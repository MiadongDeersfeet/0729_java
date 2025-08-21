package com.kh.operator;

import java.util.Scanner;

public class G_Triple {
	/*
	 * 삼항 연산자 : 피 연산자가 3개 => 값 3개와 1개의 연산자로 이루어짐(조건문의 형식으로 쓰임)
	 * 
	 * 조건문 : 값에 따라 연산을 처리하는 방식 => 조건에 따라서 여러 값을 사용하겠다.
	 * 			결과값이 true일 경우 첫 번째 문장을 처리~~~
	 * 			결과값이 false일 경우 두 번째 문장을 처리~~~
	 * 
	 * [ 표현법 ]
	 * 조건식 ? 조건식이 true일 경우 결과값 : 조건식이 false일 경우 결과값
	 */
	
	//뚝섬플레이스
	public void method1() {
		
		//Ctrl + Shift + o == 자동 임폴트
		Scanner sc = new Scanner(System.in);
		
		// 조건식 ? 조건식 앞에는 항상 물음표가 붙어요. => 어쩌구저쩌구가 맞니? (=)같니?
				// 조건식이 true일 경우 결과값 : 조건식이 false일 경우 결과값 // => : 땡땡을 기준으로 좌/우에 각 값을 쓰라는 의미
				// 1번 입력 시 == "씨솔트 카라멜크림 콜드브루 라떼를 주문하셨습니다."
				
				
		
		System.out.println("시즌 메뉴판 : ");
		System.out.println("1. 🥜씨솔트 카라멜크림 콜드브루 라떼");
		System.out.println("2. 🍯올타임 콜드브루");
		System.out.println("3. 🍑피치피치 복숭아 아샷추");
		System.out.println("4. 🍌카페 브륄레 프라푸치노");
		System.out.println("5. 🥨로스티드 마카다미아 라떼");
		System.out.println("6. ☕아이스 아메리카노 디카페인");
		System.out.println("7. 🥛아이스 카페라떼 디카페인");
		System.out.println();
		System.out.println("=========================");
		System.out.println();
		System.out.print("메뉴 번호를 입력해주세요 > ");
		int menuNo = sc.nextInt();
		
	
		String selectedMenu = (menuNo == 1) ? "씨솔트 카라멜크림 콜드브루 라떼를 주문하셨습니다."
							 : (menuNo == 2) ? "올타임 콜드브루를 주문하셨습니다."
							 : (menuNo == 3) ? "피치피치 복숭아 아샷추를 주문하셨습니다."
							 : (menuNo == 4) ? "카페 브륄레 프라푸치노를 주문하셨습니다."
							 : (menuNo == 5) ? "로스티드 마카다미아 라떼를 주문하셨습니다." 
							 : (menuNo == 6) ? "아이스 아메리카노 디카페인을 주문하셨습니다."
							 : (menuNo == 7) ? "아이스 카페라떼 디카페인을 주문하셨습니다."
		: "없는 메뉴를 주문하셨습니다.";
		System.out.println(selectedMenu);
	}
	
	// 홀짝 구하기
	public void method2() {
		
		
		
		// 사용자에게 정수 값을 하나 입력 받아서
		// 입력받은 정수가 홀 / 짝 판별해서 출력
		
		// 입력도구 별칭 짓기
		Scanner sc = new Scanner(System.in);
		System.out.print("정수값을 하나 입력하세요 > ");
		int number = sc.nextInt();
		//System.out.print(number);
		
		char oddEven = ((number % 2 == 0)) ? '짝' : '홀';
		System.out.println("입력하신 " + number + "은(는) " + oddEven + "수 입니다.");
	}
	
	public void practice() {
		
		// 사용자에게 알파벳 한 글자를 입력 받아서
		// 입력받은 알파벳이 소문자인지 / 대문자인지 판별 후 출력해주세요.
		// 출력형식
		// XXX(사용자가 입력한 알파벳은)은(는) 소문자 / 대문자 입니다.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("알파벳 한 글자를 입력해주세요 > ");
		char alpabet = sc.nextLine().charAt(0);
		//System.out.println(alpabet);
		
		char uplow = (97 <= alpabet) && (alpabet <= 122) ? '소' : '대';
		//char uplow = (('a' <= alpabet) && (alpabet <= 'z')) ? '소' : '대'; // 선생님이 쓰신 코드
		//char uplow = (alpabet < 97) ? '대' : '소'; // 더 간단하네
		System.out.print(alpabet + "은(는) " + uplow + "문자 입니다.");
		
	}
	
	
	
	
	
	
}