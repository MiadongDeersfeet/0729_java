package com.kh.plant;

public class Value {

	public static void main(String[] args) {

	//	String name = "김윤기";
	//	String name2 = "누르";
	//  하다보니 불편하네? 배열 써보자	
		
	//	String[] name = new String[10];
	//	int[] age = new int[10];
	//	String[] address = new String[10];
	// 써보니 따로따로 하기 힘드네? 중간에 넣고 빼고 하기도 힘드네? 이름/나이/주소를 묶을 수 있는 방법 없나?
	// 그래서 객체가 나왔어요.
	// 변수 선언은 여기서 안하고 이미 Person 클래스에 해놨어요.
		
		
		Person kim = new Person("김윤기", 28, "서울");
		Person noor = new Person("누르", 30, "서울");
		Person sung = new Person("춘향이", 20, "나주");
		
		// 이것도 불편하네 많아지니까? 이것도 하나의 배열에 담아보자!
		
		Person[] persons = new Person[20];
		persons[0] = new Person("김윤기", 28, "서울");
		persons[1] = new Person("누르", 30, "서울");
		persons[2] = new Person("춘향이", 20, "나주");
		
		// 하다보니 너무 많아지고 언제 추가/삭제 될지 몰라요.
		// 어라 근데 자바에서 이런 걸 할 수 있도록 List 라는 걸 만들어놨네?
		// 자유롭게 추가/삭제 하는 기능이 포함되어 있네?
		
		
	}

}
