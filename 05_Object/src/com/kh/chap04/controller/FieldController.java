package com.kh.chap04.controller;
/*
 * 필드(field) == 멤버 변수 == 인스턴스 변수
 * 
 * 클래스를 구성하는 요소 중 하나    => 1. 필드부 2. 생성자부 3. 메소드부
 * 데이터를 저장하기 위한 역할(변수)
 * 클래스 내부에 정의하지만 메소드 영역 밖에 존재
 * 
 * 변수 구분
 * - field : 클래스 블록(Scope)에 바로 선언하는 변수!
 * - (local) variable : 클래스 영역 내부에 특정한 구역!!!       <= 변수
 * 						=> method, for, if 등등등...(스코프만 있으면 어디서든지 선언되고 사용될 수 있음)
 * 
 * 1. 전역 변수의 역할을 하는 친구들 (결론적으로 자바에는 전역 변수가 없습니다.)
 * 
 * - 필드(멤버변수, 인스턴스변수) : 
 * 							생성시점 => new 키워드 사용해서 해당 객체를 생성 하는 순간 heap에 할당
 * 							소멸시점 => 객체가 소멸될 때 
 * 								   => G.C가 일을 안하면 OOM(Out Of Memory) 발생
 * 
 * - 클래스 변수(static) : static이라는 예약어가 붙어있는 변수
 * 						생성시점 => 프로그램 시작과 동시에 static 영역에 올라감
 * 						소멸시점 => 프로그램 종료되면 소멸
 * 
 * 2. 지역 변수 :
 * 			  생성시점 => 특정 영역( { } ) 내부에서 선언되는 시점에메모리 영역에 할당 -> stack
 * 			  소멸시점 => 특정 영역( { } )이 종료될 때  
 * 
 * 
 * 우리반 스타일 : 때려놓고 확인하고 설명하기
 * 
 */
public class FieldController {

	//필드 선언
	public int global;
	
	public void checkVariable(int parameter) {
		
		// local(지역변수) 할당 및 초기화
		int local = 1; // 지역변수를 사용하려면 반드시 초기화를 해야합니다.
		
		System.out.println(global); // 필드, 멤버변수
		System.out.println(parameter); //매개변수(지역변수)   <= 똑같은 지역변수인데 왜 빨간줄이 안가냐? 얘는 강제예요. / 타입을 써놓고 매개변수를 사용하면 반드시 동일 자료형을 인자값에 써야만 작동됩니다.
		System.out.println(local); // 지역변수
	}
	
	
	
}
