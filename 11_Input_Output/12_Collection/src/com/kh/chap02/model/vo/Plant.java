package com.kh.chap02.model.vo;

public class Plant {

	private String type;
	private String name;
	
	public Plant() {}
	
	public Plant(String type, String name) { // 런에서 104행 plants 출력 시 여기 this. 안해주니까 null 값으로 나왔음.
		this.type = type;
		this.name = name;
	}
	
	public String getType() {
		return type;
	}
	
	public String getName() {
		return name;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "식물정보 [이름 = " + name + ", 종류 = " + type + "]";
	}
	
}
