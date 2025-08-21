package com.kh.chap02.encapsulation.run;

import com.kh.chap02.encapsulation.model.vo.Cafe;

public class Run {

	public static void main(String[] args) {
		
		// 캡슐화 (encapsulation)
		// 속성(데이터)과 해당 데이터를 조작하는 행동(메소드)를 하나의 단위로 묶는 것 => 묶어서 이름을 붙여버려
		// 정보은닉(information hiding)     <=  부가적으로 붙는 것
	
		// 접근제한자 (예약어) 반환형 메소드식별자(매개변수){	}
		
		//new 하면 이미 올라가는 거예요~! 객체 만드는 거예요.
		/*new Cafe().cleaning(); // 왼쪽은 주소값이 되는 거예요. 오른쪽에 참조할 수 있는 거예요. // 이렇게 쓰면 일회용이란 의미라 한 번 쓰면 G.C가 와서 삭제해버립니다.*/
		
		// 변수선언 대입연산자 객체 생성 == 메모리에 적재
		Cafe cafe = new Cafe();
		// 객체와 객체 간에는 서로의 정보를 모르면 모를수록 좋고 알면 알수록 서로 다칩니다.
		
		/*
		cafe.name = "KH카페"; // not visible 은 안보인다 == 외부에서 접근이 불가능하다는 의미
		System.out.println(cafe.name);
		cafe.signatureMenu = "KH커피";
		cafe.signatureMenuPrice = -500; // 다이렉트로 값을 집어넣었던 흔적****
		System.out.println(cafe.signatureMenu);
		System.out.println(cafe.signatureMenuPrice);
		*/
		
		// 필드가 보이지 않아서(외부에서 접근이 불가능해서) 오류 발생!
		// 접근제한자를 public 에서 private으로 변경했기 때문에 직접 접근이 불가능 
		// 직접 접근이 불가능하기 때문에 간접적으로 접근할 수 있는 방법을 만들어주어야 함
		// Cafe라는 클래스에 getter / setter 라는 메소드 만들기
		// cafe.signatureMenuPrice = - 500;
		
		// *** 객체의 내부적 관점 / 외부적 관점
	//	cafe.dishWash(); // 카페 클래스의 해당 메소드를 수정했더니 런 클래스에서 문제가 생김. 
	//	cafe.cleaning();
	//	cafe.windowCleaning();
	//	cafe.open();
		// 5000
		// 메소드 호출 부에서는 오로지 값만 넘길 수 있음
		cafe.setSignatureMenuPrice(5000); // 값을 넘기는 순간 빨간줄이.... // 괄호 안에 값은 인자값 아규먼트/??? // 호출하는 이곳에선 값이고, 메서드부에서는 변수예요.
		//System.out.println("메인메서드에서 찍어본 cafe의 주소 : " + cafe);
		
		cafe.setName("뚝섬플레이스"); //여긴 인자값--스트링이니 문자열값 넘겨야지.
		cafe.setAddress("서울시 중구 남대문로 120 그레이츠청계 2층"); // 인자값--문자열값 넘겨야지.
		
		cafe.getName();
		String cafeName = cafe.getName(); // Cafe 클래스 getter 에서 리턴된 값이 우항에 들어와있고 좌항 cafeName 에 대입하고 싶은 거죠. // 실제적으로는 우항이 네임필드값 , 메서드 호출이죠.
		System.out.println(cafeName); // 출력문을 써야하는데 변수를 안만들어서 출력이 안됐구나 !
		/* System.out.print(cafe.getName()); // 변수 안쓰고 이렇게 해도 되네~~~ */
		
		cafe.getAddress(); // 1. 주소 찾아가자 cafe --> 2. 참조연산자 --> 3. 내놔!! get --> 값 --> ();
		String cafeAddress = cafe.getAddress();
		System.out.println(cafeAddress);
		
		cafe.getSignatureMenuPrice();
		int signatureMenuPrice = cafe.getSignatureMenuPrice();
		System.out.println("시그니처 메뉴의 가격 : " + signatureMenuPrice + "원");
		
		cafe.info();
		String info = cafe.info();
		System.out.println(info);
		
		
		
		
		}
	
	
}
