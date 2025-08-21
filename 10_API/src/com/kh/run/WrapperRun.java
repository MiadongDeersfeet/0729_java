package com.kh.run;

public class WrapperRun {

	public static void main(String[] args) {
		/*
		 * Wrapper Class
		 * => 기본자료형을 참조자료형으로 포장해주는 클래스들을 래퍼클래스라고 함.
		 * 
		 * 기본 자료형								Wrapper Class
		 * 				 <--------------->
		 * boolean								Boolean
		 * char									Character	
		 * byte									Byte	
		 * short								Short	
		 * int									Integer	
		 * long									Long	
		 * float								Float	
		 * double								Double
		 */

		// 기본자료형을 객체로 취급해야 하는 경우
		// 메소드 매개변수 자료형이 기본자료형이 아닌 참조자료형만 사용 가능한 경우
		// 다형성을 적용해야겠다!!!!
		
		int num1 = 10;
		int num2 = 15; 
		
		// Object.equals()
		//Integer i1 = new Integer(num1); // 까만줄 = 디프리케이티드 될 거야. 지금은 쓸 수 있지만 자바 버전을 더 올리면 이 문법 자체를 못쓰게 없애버릴거야. 미리밀 다른 버전으로 바꿔서 써라~~~!
		
		// 위에 int형 작은 숫자들일지라도 상수풀에 올리고 싶단 말이에요.
	//	System.out.println(i1);
		
		// 기본자료형 => Wrapper로 포장
		Integer i1 = num1;
		Integer i2 = num2;
		// 128 미만의 정수값은 상수풀에 들어가기에 똑같은 값은 똑같은 주소를 가리켜서 메모리적인 측면에서 낭비를 줄일 수 있다.
		// 기본 자료형인 int 에 대입한 값들을 참조 자료형 Integer 로 포장해준 상태입니다.
		System.out.println(i1.equals(i2));
		System.out.println(i1.compareTo(i2));
		// a.compareTo(b)
		// a가 b보다 크면 1을 반환
		// a가 b보다 작으면 -1을 반환
		// 같으면 0 반환
		
		// 웹에서 데이터를 받았는데 문자열로 들어오고, 문자열로 들어오는 경우가 많아요.
		// 정수를 받아도 "123", 실수를 받아도 "1.1"
		// 타입이 스트링인 거예요.
		String str1 = "10";
		String str2 = "1.1";
		
		System.out.println(str1 + str2); // 101.1 문자형 더하기 문자형 타입으로 나오는 거죠. 이걸 정수형 / 실수형으로 바꿔줘야죠.
		
		int i = Integer.parseInt(str1);
		double d = Double.parseDouble(str2);
		// 해당 Wrapper클래스이름.parseXXX(데이터);
		
		System.out.println(i + d);
		
		// 이런 상황에선 캐스팅이 아니고
		// 파싱(parsing)을 해줘야해요. == 특정 데이터를 규칙에 따라서 분석하고 해석하는 과정
		
		//String strInteger = i + ""; // ==> "i" 가 되는 거지 근데 근본적으로 가려면 ?
		String strInteger = String.valueOf(i);
		
		
		
		
		
		
		
		
	}

}
