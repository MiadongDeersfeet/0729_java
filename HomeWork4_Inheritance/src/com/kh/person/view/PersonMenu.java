package com.kh.person.view;

import java.util.Scanner;

import com.kh.person.controller.PersonController;

public class PersonMenu {
	// �ʵ�
	private Scanner sc = new Scanner(System.in);
	private PersonController pc = new PersonController();
	
	// �޼ҵ�
	public void mainMenu() {
		
		System.out.println("�л��� �ִ� " + pc.getCounts() + "����� ������ �� �ֽ��ϴ�.");
		
		System.out.println("���� ����� �л��� M���Դϴ�.");
		
		
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

