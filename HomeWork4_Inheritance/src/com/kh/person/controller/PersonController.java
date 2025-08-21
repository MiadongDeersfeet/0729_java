package com.kh.person.controller;

import com.kh.person.model.vo.Employee;
import com.kh.person.model.vo.Student;

public class PersonController {
	// 필드
	private Student[] s = new Student[3];
	private Employee[] e = new Employee[10];
	
	/*
	public PersonController() {
		s[0] = new Student();
		s[1] = new Student();		s[2] = new Student();
		
	}*/

	public int[] personCount() {
	s[0] = new Student();
	s[1] = new Student();
	s[2] = new Student();
	{
			
		}
	}
			 
				
			}
	
	public Student[] getS() {
		return s;
	
		
	}
		
	public void insertStudent(String name, int age, double height, double weight, int grade, String major) {
		// ???
	}
	
	public Student printStudent() {
		// 나중에 점검필요
	}
	
	public void insertEmployee(String name, int age, double height, double weight, int salary, String dept) {
		// ???
	}
	
	public Employee printEmployee() {
		return null; //????
	}
}