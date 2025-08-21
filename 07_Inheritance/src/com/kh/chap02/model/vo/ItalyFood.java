package com.kh.chap02.model.vo;

public class ItalyFood extends Food {
	
	// �ʵ�� (�ߺ��Ǵ� �� ���� ���� ������ �־���ϴ� �ʵ带 �����ش�)
	private int oil;
	
	// �����ں�           -- �����ڴ� ����� ���� �� ��� ���� ���� ��������.
	public ItalyFood() {
		super(); //super(); �� �����Ǿ��ִٰ� ������.
	}
	
	public ItalyFood(String foodName, String material, int cookingTime, int oil) {
		
		// this.foodName = foodName;
		// super.foodName = foodName;
		// ���������ڰ� private�̱� ������ �Ⱥ���
		// �ذ���
		// 1. �θ�Ŭ������ ���������ڸ� �ٲ����
		// ĸ��ȭ ��Ģ X => ������ ����� �ƴ�
		// 2. �θ�Ŭ������ ���������� public�� setter�޼ҵ带 ȣ���Ѵ�.
		
	//	super.setFoodName(foodName);
	//	super.setMaterial(material);
	//	super.setCookingTime(cookingTime);
		
	//	super.foodName = foodName; // �θ� �ʵ忡 private �̸� super. �� �ȵǴϱ� ���������ڸ� protected �� �ٲٴ� ����� �ִ�. (��� ���������� �����ϰ�)
		
		// 3. �θ�Ŭ������ ������ �ִ� �Ű����� �����ڸ� ȣ��
		super(foodName, material, cookingTime);      // <= �θ� ��ü�� �����Ǳ� ���� �� �� ���� ���� �� �����. ������ ��Ű����.
		this.oil = oil;                              //  <= �θ� �θ𲨰�, �� ���� ���� �����ؾ��մϴ�.
	}
	
	// �޼ҵ��
	public int getOil() {
		return oil;
	}
	public void setOil(int oil) {
		this.oil = oil;
	}
}
