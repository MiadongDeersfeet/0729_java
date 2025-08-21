package com.kh.chap02.model.vo;

// �ڽ�Ŭ���� extends �θ�Ŭ����
public class JapanFood extends Food {

	// �ʵ��
	// �θ�κ��� ��ӹ��� �κ��� ������� �ʴ´�!
	private int fresh;
	
	// �����ں�   <=  �����ڴ� Ŭ������ �޶� ����� ���� �� ������ ���Ӱ� ����սô�.
	public JapanFood() {
		
	}
	
	// �Ű����� ������
	// foodName, material, cookingTime : �θ�Ŭ������ �ʵ忡 �����ؾ���
	// fresh :�� �ʵ忡 ����
	public JapanFood(String foodName, String material, int cookingTime, int fresh) {
		super(foodName, material, cookingTime);
		this.fresh = fresh;
	}
	
	// �޼ҵ��    <= �θ� �θ𲨰�, �� �ʵ忡 ���� getter/setter �־����.
	public int getFresh() {
		return fresh;
	}
	
	public void setFresh(int fresh) {
		this.fresh = fresh;
	}
	
	// �޼ҵ带 ��ӹ޾Ҵµ� ������ �ȵ�� ������Ű�� �;�
	// �ٽ� �� �� ���� ==> ������
	public String information() { // �����Ǹ� �����
		/* return "[���ĸ�: " + super.getFoodName() + " / �����: " + super.getMaterial() + " / �����ð�: " + super.getCookingTime() + " / �ż���: " + fresh + "]";
		// ���ĸ���� �����ð����� �̹� �θ�Ŭ������ �����ϴ� �ߺ� ������. �׷� ��� �ߺ��� ���� �� ������? */
		return super.information() + " / �ż���: " + fresh;
	}

}
