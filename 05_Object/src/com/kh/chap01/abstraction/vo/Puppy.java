package com.kh.chap01.abstraction.vo;
/*
 * public class 클래스식별자 { //앞으로 우리가 만들 클래스 모양
 * 
 * 		// 필드부
 * 
 * 
 * 		// 생성자부
 *
 * 
 * 		// 메소드부
 * 
 * }
 */
public class Puppy { //객체 지향 프로그래밍 : 현실세계에서의 독립적인 존재(개체)를 속성과 행위를 가진 객체로 만들어서
	 				//객체간의 상호작용을 통해 프로그래밍 하는 기법 -- 상호작용 하는 방법 => 메소드 호출
	// [ 필드부 ] 객체 지향 프로그래밍을 이야기할 때 존재(개체)의 속성을 의미함. 현실세계의 값들을 저장할 수 있는 공간이 필요하구나. 런 클래스에 적힌 정보들 종~몸무게까지가 속성이 됩니다.
	// 이 속성들을 담아둘 공간을 필드라고 합니다. => 접근제한자 자료형 필드식별자;   <= *변수선언이랑 비슷하네요. 
	
	// 접근제한자 : 이 필드에 접근할 수 있는 접근권한을 제어하는 역할
	// 			 public > protected > default > private
	// 클래스 내부에 필드를 선언할 때는 반드시 접근제한자를 붙일 것!!
	
	// 종, 이름, 나이, 성별, 색상, 몸무게 => 총 여섯개의 필드가 필요합니다.
	public String species;
	public String name;
	public int age;
	public String gender;
	public String color;
	public int weight;
	
	// [ 생성자부 ]
	
	// [ 메소드부 ] 여기엔 public void 가 아니라 Puppy 가 가질 수 있는 기능들을 넣어야해요.
	public void sniff() {
		
		System.out.println(name + "가 킁킁거리며 냄새를 맡습니다.");
	} // 설계도를 만들었으니 실제로 객체 생성해보자!
	
	public void bark() {
		
		if(weight > 15) {
		System.out.println(name + "가 왈왈거리며 짖습니다.");
		weight = weight - 5;
		} else {
			System.out.println("너나 짖어라~");
			
		}
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
