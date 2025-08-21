package com.kh.person.view;

import java.util.Scanner;

import com.kh.person.controller.PersonController;

public class PersonMenu {
	// 필드
	private Scanner sc = new Scanner(System.in);
	private PersonController pc = new PersonController();
	
	// 메소드
	public void mainMenu() {
		
		System.out.println("학생은 최대 " + pc.getCounts() + "명까지 저장할 수 있습니다.");
		
		System.out.println("현재 저장된 학생은 M명입니다.");
		
		
	}
	
	public void studentMenu() {
		
	}
	
	public void employeeMenu() {
		
	}

	public void insertStudent() {
		
	}
	
	public void printStudent() {
		
	}
	
	public void insertEmployee() {
		
	}
	
	public void printEmployee() {
		
	}
	
}

