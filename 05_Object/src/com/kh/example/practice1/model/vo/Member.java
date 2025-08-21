package com.kh.example.practice1.model.vo;

public class Member {

	
	private String memberId; // <== 멤버아이디 = 필드식별자
	private String memberPwd;
	private String memberName;
	private int age;
	private char gender;
	private String phone;
	private String email;
	
	public Member() {}
	
	public void changeName(String name) {
		this.memberName = name;
	}
	
	public void printName() {
		System.out.println("제 이름은 " + memberName + "입니다.");
	}
	
	
	
}
