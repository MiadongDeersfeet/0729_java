package com.kh.chap02.model.vo;

// 자식클래스 extends 부모클래스
public class JapanFood extends Food {

	// 필드부
	// 부모로부터 상속받은 부분은 기술하지 않는다!
	private int fresh;
	
	// 생성자부   <=  생성자는 클래스가 달라서 상속을 받을 수 없으니 새롭게 기술합시다.
	public JapanFood() {
		
	}
	
	// 매개변수 생성자
	// foodName, material, cookingTime : 부모클래스의 필드에 대입해야함
	// fresh :내 필드에 대입
	public JapanFood(String foodName, String material, int cookingTime, int fresh) {
		super(foodName, material, cookingTime);
		this.fresh = fresh;
	}
	
	// 메소드부    <= 부모껀 부모꺼고, 내 필드에 대한 getter/setter 있어야함.
	public int getFresh() {
		return fresh;
	}
	
	public void setFresh(int fresh) {
		this.fresh = fresh;
	}
	
	// 메소드를 상속받았는데 마음에 안들어 발전시키고 싶어
	// 다시 쓸 수 있음 ==> 재정의
	public String information() { // 재정의를 해줬어
		/* return "[음식명: " + super.getFoodName() + " / 주재료: " + super.getMaterial() + " / 조리시간: " + super.getCookingTime() + " / 신선도: " + fresh + "]";
		// 음식명부터 조리시간까지 이미 부모클래스에 존재하는 중복 내용임. 그럼 어떻게 중복을 없앨 수 있을까? */
		return super.information() + " / 신선도: " + fresh;
	}

}
