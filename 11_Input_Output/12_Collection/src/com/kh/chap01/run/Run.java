package com.kh.chap01.run;

import com.kh.chap01.controller.Integers;

public class Run {

	public static void main(String[] args) {
/*
		// 정수 값을 여러개 다루고 싶음 정확하게 몇 개의 정수를 다룰지 알 수 없는 상황
		 
		int[] integers = new int[3];
		integers[0] = 1;
		integers[1] = 5;
		integers[2] = 6;
		inergers = new int[5] // <= 이렇게 하면 이전에 있던 것들은 싹 날아가잖아요.
*/		
		Integers integers = new Integers(); // 위와 같이 하나 이렇게 하나 3칸짜리 배열인 건 똑같아요.
		integers.add(10); // 0번 인덱스에 대입
		integers.add(60); // 1번 인덱스에 대입
		integers.add(30); // 2번 인덱스에 대입
//		integers.add(20); // 3칸을 선언했었기 때문에 ArrayIndexOutOfBoundsException 발생함.
		integers.add(50);
		integers.add(100);
		integers.add(70);
		integers.add(90);
		
		int element = integers.get(2);
		System.out.println(element);
		
		System.out.println(integers);
		
		
		
	}

}
