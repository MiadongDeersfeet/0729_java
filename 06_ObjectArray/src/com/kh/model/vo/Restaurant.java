package com.kh.model.vo;

public class Restaurant {
	
	// ��ȣ, �ּ�, ���θ޴�
	private String storeName;
	private String address;
	private String mainMenu;
	
	// �⺻������
	public Restaurant() {
		
	}
	
	// ��� �ʵ带 �Ű������� ���� ������
	public Restaurant(String storeName, String address,  String mainMenu) {
		this.storeName = storeName;
		this.address = address;
		this.mainMenu = mainMenu;
	}
	
	// setter()
	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public void setmainMenu(String mainMenu) {
		this.mainMenu = mainMenu;
	}
	
	// getter()
	public String getStoreName() {
		return storeName;
	}
	
	public String getAddress() {
		return address;
	}
	
	public String getMainMenu() {
		return mainMenu;
	}
	
	// information()
	public String info() {
		return "[��ȣ : " + storeName + " / �ּ� : " + address + " / ���θ޴� : " + mainMenu + "]";
	}
	

	


}
