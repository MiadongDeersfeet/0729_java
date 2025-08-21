package com.kh.chap02.model.vo;
// 부모클래스 자식클래스 v
// 슈퍼클래스 서브클래스 v
// 상위클래스 하위클래스
// 조상클래스 후손클래스
// 확장클래스 파생클래스
public class KoreaFood extends Food {
	// 필드부
	// foodName, material, cookingTime, spicy
	// [ Food 클래스가 가지고 있음 ]
	private int spicy;
	
	// 생성자부
	public KoreaFood() {
		super(); // super : 부모객체의 주소값을 의미하는 키워드 // 코리아푸드의 슈퍼는 푸드 -- // 부모클래스의 객체생성 new Food(); 와 같음
		System.out.println("응애 나 자식");
	}
	
	// 메소드부
	public int getSpicy() {
		return spicy;
	}
	
	public void setSpicy(int spicy) {
		this.spicy = spicy;
	}
	

	
}
