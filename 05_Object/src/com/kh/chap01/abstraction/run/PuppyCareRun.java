package com.kh.chap01.abstraction.run;

import java.util.Scanner;

import com.kh.chap01.abstraction.vo.Puppy;

public class PuppyCareRun {

	public static void main(String[] args) {
		
		// 사용자에게 강아지의 정보를 입력받아서
		// 입력받은 강아지의 정보를 출력해주고
		// 강아지와 함께 놀아줄 수 있는 프로그램
		
		/* 스캐너 타입의 변수 선언 */ Scanner sc = new Scanner(System.in); // 스캐너 객체 생성
		Puppy puppy = new Puppy(); // 강아지 속성 저장소
		
		System.out.println("=======귀여운 강아지 키우기=======");
		System.out.println(" ");
		System.out.print("강아지의 이름을 입력해주세요 > ");
		puppy.name = sc.nextLine();
		System.out.print("강아지의 견종을 입력해주세요 > ");
		puppy.species = sc.nextLine();
		System.out.print("강아지의 나이를 입력해주세요 > ");
		puppy.age = sc.nextInt();
		sc.nextLine();
		System.out.print("강아지의 성별을 입력해주세요 > ");
		puppy.gender = sc.nextLine();
		System.out.print("강아지의 몸무게를 입력해주세요 > ");
		puppy.weight = sc.nextInt();
		sc.nextLine();
		System.out.print("강아지의 색깔을 입력해주세요 > ");
		puppy.color = sc.nextLine();
		
		boolean exit = false;
		
		while(!exit) {
			
			System.out.println("🐶🐶🐶🐶🐶🐶🐶🐶🐶🐶🐶🐶🐶🐶🐶🐶🐶🐶🐶🐶🐶🐶🐶🐶");
			System.out.println(puppy.name + "의 정보!");
			System.out.println("나이 : " + puppy.age);
			System.out.println("성별 : " + puppy.gender);
			System.out.println("견종 : " + puppy.species);
			System.out.println("색깔 : " + puppy.color);
			System.out.println("무게 : " + puppy.weight);
			System.out.println("🐶🐶🐶🐶🐶🐶🐶🐶🐶🐶🐶🐶🐶🐶🐶🐶🐶🐶🐶🐶🐶🐶🐶🐶");
			System.out.println(" ");
			
			System.out.println("메뉴를 선택해주세요 > ");
			if(puppy.weight > 40) {
				System.out.println("※ 다이어트를 위해 짖기를 추천드려요.");
			}
			System.out.print("1. 냄새맡기 / 2. 짖기 / 3. 프로그램 종료 > ");
			int menuNo = sc.nextInt();
			sc.nextLine();
			
			switch(menuNo) {
			case 1 : puppy.sniff(); break;
			case 2 : puppy.bark(); break;
			case 3 : exit = true; break;
			default : System.out.println("메뉴를 다시 선택해주세요!");
			
			}

		}
		
		
	}
}
