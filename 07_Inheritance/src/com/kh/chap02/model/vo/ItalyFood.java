package com.kh.chap02.model.vo;

public class ItalyFood extends Food {
	
	// 필드부 (중복되는 것 빼고 나만 가지고 있어야하는 필드를 적어준다)
	private int oil;
	
	// 생성자부           -- 생성자는 상속을 받을 수 없어서 내꺼 내가 만들어야함.
	public ItalyFood() {
		super(); //super(); 가 생략되어있다고 봐야함.
	}
	
	public ItalyFood(String foodName, String material, int cookingTime, int oil) {
		
		// this.foodName = foodName;
		// super.foodName = foodName;
		// 접근제한자가 private이기 때문에 안보임
		// 해결방법
		// 1. 부모클래스의 접근제한자를 바꿔버림
		// 캡슐화 원칙 X => 적합한 방법은 아님
		// 2. 부모클래스의 접근제한자 public인 setter메소드를 호출한다.
		
	//	super.setFoodName(foodName);
	//	super.setMaterial(material);
	//	super.setCookingTime(cookingTime);
		
	//	super.foodName = foodName; // 부모 필드에 private 이면 super. 로 안되니까 접근제한자를 protected 로 바꾸는 방법도 있다. (상속 구조에서만 가능하게)
		
		// 3. 부모클래스가 가지고 있는 매개변수 생성자를 호출
		super(foodName, material, cookingTime);      // <= 부모 객체가 생성되기 전에 내 것 먼저 넣을 수 없어요. 순서를 지키세요.
		this.oil = oil;                              //  <= 부모껀 부모꺼고, 내 꺼는 내가 생성해야합니다.
	}
	
	// 메소드부
	public int getOil() {
		return oil;
	}
	public void setOil(int oil) {
		this.oil = oil;
	}
}
