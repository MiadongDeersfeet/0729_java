package com.kh.person.model.vo;

public class Student extends Person {
	// 필드
	private int grade;
	private String major;
	
	// 생성자
	public Student() {}
	public Student(String name, int age, double height, double weight, int grade, String major) {
		super(name, age, height, weight);
		this.grade = grade;
		this.major = major;
	}
	
	// 메소드
	public int getGrade() {
		return grade;
	}
	
	public String getMajor() {
		return major;
	}
	
	public void setGrade(int grade) {
		this.grade = grade;
	}
	
	public void setMajor(String major) {
		this.major = major;
	}
}
