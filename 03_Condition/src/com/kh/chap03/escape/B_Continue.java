package com.kh.chap03.escape;

import java.util.Scanner;

public class B_Continue {
/*
 * continue : 반복문 안에서 사용하는 문법
 * 
 * coutinue문을 만나면 continue 이후에 어떤 코드가 존재하던 실행하지 않고 pass
 * 반복문 scope 최상단으로 올라가는 것을 의미
 */
	
	
	
	
	//if(i % 2 == 1)  
	//for(int i = 1; i <= 10; i+=2) {
	//(i % 2 == 0) {
	//ontinue; //얘를 만나는 순간 밑에꺼 다 날리고 바로 for 문의 4번(증감식)으로 갑니다.
	public void method1() {
		
		// 1부터 10까지 반복을 하면서 정수값을 출력할 거예요.
		for(int i = 1; i <= 10; i++) {
		    //if(i % 2 == 1)
			if(i % 2 == 0) {
				continue;
			}
			System.out.println(i);
			
		
		}
		
	}
			
	
	
	//====================================================================================//
		public void method2() {
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("회원가입 서비스입니다.");
			
			while(true) {
			
				System.out.print("아이디를 입력해주세요(10자 이하) > ");
				String userId = sc.nextLine();
			
				if(userId.length() > 10) {
					System.out.println("아이디는 10자 이하만 작성 가능합니다.");
					continue;
				} else {
					System.out.println("사용 가능한 아이디 입니다.");
					break;
				}
			}
			while(true) {
				
			
				System.out.println("사용하실 비밀번호를 입력해주세요 > ");
				String userPwd = sc.nextLine();
				
				if(userPwd.length() > 6) {
					System.out.println("비밀번호는 6자 이하만 작성 가능합니다.");
					continue;
				} else {
					System.out.println("사용 가능한 비밀번호 입니다.");
					break;
				}
			}
		
		}
		
		
	}
