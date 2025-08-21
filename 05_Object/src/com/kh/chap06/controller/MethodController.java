package com.kh.chap06.controller;

public class MethodController { // <= 사람은 사람같이 생긴 자료형, 커피는 커피같이 생긴 자료형 ; 우리는 클래스를 자료형으로 쓰고 있죠.
			/* 자료형 */
	/*
	 * 메소드(Method) == 멤버 함수 : 입력값을 가지고 특정동작을 수행한 뒤 결과물을 내놓는다.       <== 클래스가 가지고 있는 기능 : 메소드 
	 * 
	 * 프로그래밍 언어에서의 함수 : 특정 작업을 수행하기 위해서 만들어진 코드 블록
	 * 1. 재사용성
	 * 2. 모듈화 (작은 단위로 '부품'처럼 나눠서 사용하면 여기서도 사용할 수 있고, 저기서도 사용할 수 있고)
	 * 
	 * 객체지향 프로그래밍에서의 메소드란 : 객체가 수행할 수 있는 행동을 정의한 코드 블록
	 * 
	 * 메소드란 특정 자료형에서만 사용이 가능한 함수 (1+1, 2+2 는 가능하지만 a+가, b+나 는 안되잖아요. 정수형에서만 가능하잖아요.)
	 * 
	 * 
	 * [ 표현법 ]
	 * 
	 * 접근제한자 예약어 반환형 메소드식별자(매개변수의자료형 매개변수식별자) {
	 * 
	 * 				수행할 코드 ;
	 * 
	 * 				return 반환값;
	 * }
	 * 
	 * 생략 가능한 것 : 예약어, 매개변수, return문(void일 경우)
	 * 반환형 : return 시 반환할 값의 자료형을 적어야한다.
	 * 호출할 때 메소드 전달 인자값 => 매개변수의 자료형과 개수가 정확하게!!!!!! 일치해야합니다. ★
	 * 
	 * 한 번 정의해두면 필요할 때마다 언제든 호출이 가능~~~
	 * 
	 */
	
	// 더하기를 해서 결과를 반환해주는 코드 블럭을 만들고 싶다.
	public int add/*함수명*/(int a, int b) {  // <= 뭔가 두개의 정수값이 필요하겠다. // 메소드 시그니처 : 접근제한자 + 반환형 + 메소드명 +
		int sum = a + b; // 메소드 바디 본문
		return sum; // 반환값
	}
	
	// 1. 매개변수가 존재하지 않고 반환값도 존재하지 않는 메소드
	public void method1() {
		
		System.out.println("매개변수와 반환값이 둘 다 존재하지 않습니다.");
		
		// return; <= 기본 생성자 같은 것이죠 (?)
		// returnType이 void일 경우 return문을 생략할 수 있다. // JVM이 만들어준 것 뿐이다. 사실은 항상 존재했다. 
	}
	
	// 2. 매개변수는 존재하지 않지만 반환값은 존재하는 메소드
	public String method2() {
		
		System.out.println("매개변수는 존재하지 않지만 반환값은 존재합니다.");
		
		return "returnValue"; // <= void가 아니게 된 순간부터 반드시 return 구문이 들어가야 하는 거죠.
	}
	
	// 3. 매개변수가 존재하고 반환값도 존재하는 메소드
	public String method3() {
		
		return method2();
		
	}
	
	public void println(String parameter) {
		System.out.println(parameter);
	}
		

	
	// 4. 매개변수가 존재하지만 반환값은 존재하지 않는 메소드 // setter
	/* public void setName(String name) {
		this.name = name;
	}*/
	

	public void method4(int num) { // <= 메소드 시그니처 는 메소드 사용법이라고도 함.
		System.out.println("매개변수는 존재하고 반환값은 존재하지 않습니다.");
		System.out.println("전달받은값 + 100" + (num + 100));	
	}
	
	// 매개변수도 존재하고 반환값도 존재하는 메소드
	public int method5(int num) {
		System.out.println("매개변수도 있어요 ~ 반환값도 있어요 ~");
		return num + 50;
		
		
	}
	
	// 메소드를 사용할 때 주의해야할 점 ↓ 이렇게 a가 b를 부르고 b는 a를 부르고 반복하다가 스택이 터지는 현상이 발생. Stack OverFlow --- > 제일 유명한 개발자 사이트이기도 함.
	public void a() {
		System.out.println("메소드 a호출!");
		b();
	}
	
	public void b() {
		System.out.println("메소드 b호출!");
		a();
	}
	
	public void test(MethodController mc) { // <= 얕은복사 ☆★☆★ : 주소값을 대입하는 것이기 때문에 가리키고 있는 대상이 같다. 서로 다른 변수가 같은 주소를 가리킴.
		mc.method1();
	}
	
	public static void staticMethod() {
		System.out.println("안녕 나는 스태틱 메소드야~!");
		
	}
	
	public void haha(int number) {
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
