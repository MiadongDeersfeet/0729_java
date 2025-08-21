package com.kh.chap04.model.vo;

public class Hong implements Jjimdak { // 홍수계찜닭 // 인터페이스를 사용할 이 클래스는 인터페이스를 '구현'한다. implement || 
	// 저기에는 호출을 했을 때 어떻게 쓸지 구체화가 안되어있어요. 오버라이딩 해야해요. 재정의 해야해요.
	@Override
	public void order() { // 홍수계찜닭이 주문이 돌아왔을 때 어떻게 실행해줄 건지 구체화를 해야함.
		System.out.println("비법양념에 숙성한 후 400도 가까운 온도로 조리해서 찜닭 만들기");
	}
	
	
	
	
	
	

}
