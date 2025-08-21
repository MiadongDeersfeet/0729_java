package com.kh.chap04.model.vo;

public class Bong implements Jjimdak {

	@Override // 인터페이스를 구현하는 이 곳에서 재정의를 해줘야 클래스명에 빨간줄이 안갑니다.
	public void order() {
		System.out.println("국내산 건청양고추로만 맵기를 조절해서 찜닭 만들기");
	}
}
