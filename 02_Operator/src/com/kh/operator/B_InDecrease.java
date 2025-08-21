package com.kh.operator;

public class B_InDecrease {
	/*
	 * 증가연산자 : 단항연산자로 한 번에 1씩 증가(더하거나) / 감소(빼거나)하는 연산을 함
	 * 
	 * [ 표현법 ]
	 * ++ : 값을 1증가 시키는 연산자
	 * -- : 값을 1감소 시키는 연산자
	 * 
	 * => 증감을 먼저 할건지, 나중에 할건지에 따라 연산자의 위치가 달라짐
	 * 
	 * 연산자의 위치
	 * 전위 연산 : ++값, --값					--> 먼저 값을 증가 또는 시키고 나서 작업을 처리
	 * 후위 연산 : 값++, 값--					--> 먼저 값을 처리하고 나서 증가하거나 감소
	 */

	// 후위연산 첫 번째 메소드
	public void method1() {
		//System.out.println("중간점검");
		int num = 10;
		System.out.println("num : " + num); // "num : 10"
		num++;
		
		System.out.println("num : " + num); // "num : 11"
		num--;
		
		System.out.println("num : " + num); // "num : 10"
		System.out.println("num : " + num++); // "num : 10"
		System.out.println("num : " + num++); // "num : 11"
		System.out.println(num); //12
	}
	// 두 번째 메소드
	public void method2() {
		int a = 10;
		int b = a++;
		// 1번 35행ㅇ
		// 1. a라는 식별자를 가진 int형 변수공간을 할당받고
		// 2. 정수형 리터럴 값 10을
		// 3. 대입해버림
		
		// 2번 36행의 좌항 :
		// b라는 식별자를 가진 int형 변수공간을 할당받음
		
		// 3번 36행의 우항_1 :
		// a라는 변수 공간에 대입된 정수형 리터럴값을 가져옴
		
		// 4번 36행의 우항_2 : 
		// a라는 공간의 값을 1증가
		
		// 5번 35행의 가운데 :
		// 가져온 리터럴값을 b공간에 초기화
		
		System.out.println("a : " + a);
		System.out.println("b : " + b);
		
		int c = 20;
		int d = c--;
		
		System.out.println("c : " + c); // c : 19
		System.out.println("d : " + d); // d : 20
		
		
		int num = 20;
		int result = num++ * 3;
		
		System.out.println(num);
		System.out.println(result);
		//안녕 나는 정수담는 넘이라고 해. 20 대입할게. 안녕 나는 정수담는 리설트야 20 빼올게. ++ 하라고? 넘에다 +1 했어. 넘은 21이네. 빼온 값이 곱하기 3하라고? 리설트에 60이 되네.
		//이렇게 극단적으로 사용은 안하고 위에 시스템아웃출력 밑에 넘++ 한것처럼 쓰니까 돈 워리
	}
		// 전위연산
	public void method3() {
		
		int a = 10;
		int b = ++a;
		
		System.out.println("a : " + a); //a변수에 들어간 10을 먼저 1 상승 시키고 그 a(11)를 고대로 b에
		System.out.println("b : " + b);
		
		int num = 20;
		int result = ++num * 3;
	
		System.out.println(num); //a변수에 들어간 20을 먼저 1 상승 시키고 그 a(21)에 3을 곱해서 b에
		System.out.println(result);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
