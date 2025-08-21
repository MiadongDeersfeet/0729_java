package com.kh.chap02.model.vo;

public class Food { //�갡 �θ�ü�̱���. é��2 ������ kf �����ؼ� ����Ǫ������� ȣ���ߴµ� kf �� ���Ͱ� ���� -> �θ�ü��
					// �⺻������ ��� Ŭ������ extends Object �� �����Ǿ� �ִ�. �׷��� ���������ڸ� ���� notify �� hashcode ���� ����� �� �ִ� ���̴�.
	protected String foodName; 
	private String material;
	private int cookingTime;
	
	public Food() {
		//super
		System.out.println("�ȳ��ϼ��� �θ��Դϴ�.");
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
		return "���ĸ�: " + foodName + " / �����: " + material + " / �����ð�: " + cookingTime;
	}
	

}
	
