package com.kh.chap02.model.vo;

public class Food { //얘가 부모객체이구나. 챕터2 런에서 kf 참조해서 셋터푸드네임을 호출했는데 kf 에 세터가 없네 -> 부모객체로
					// 기본적으로 모든 클래스는 extends Object 가 생략되어 있다. 그래서 참조연산자를 찍어보면 notify 나 hashcode 등을 사용할 수 있는 것이다.
	protected String foodName; 
	private String material;
	private int cookingTime;
	
	public Food() {
		//super
		System.out.println("안녕하세요 부모입니다.");
	}
	
	public Food(String foodName, String material, int cookingTime) {
		this.foodName = foodName;
		this.material = material;
		this.cookingTime = cookingTime;
	
	}
	
	public String getFoodName() {
		return foodName;
	}
	
	public String getMaterial() {
		return material;
	}
	
	public int getCookingTime() {
	return cookingTime;
	}
	
	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}
	
	public void setMaterial(String material) {
		this.material = material;
	}
	
	public void setCookingTime(int cookingTime) {
		this.cookingTime = cookingTime;
	}
	
	public String information() {
		return "음식명: " + foodName + " / 주재료: " + material + " / 조리시간: " + cookingTime;
	}
	

}
	
