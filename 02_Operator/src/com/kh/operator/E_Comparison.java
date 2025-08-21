package com.kh.operator;

public class E_Comparison {
	
	/*
	 * 비교 연산자(관계 연산자) '3' == (int) '3'
	 * 
	 * 두 개의 값을 가지고 비교, 이항 연산자(항이 두 개라는 의미)
	 * 비교연산을 한 결과 -> 참인 경우 true, 거짓인 경우 false
	 * 특정 조건을 제시할 수 있는 조건문에서 조건식으로 사용할 예정~~ //연산자 파트에서 가장 중요하니 기억을 잘해둘 필요가 있어요.
	 */
	/*
	 * 종류
	 * 
	 * 동등비교, 대소비교, 
	 * 
	 * 1. 동등비교 : 일치함을 비교
	 * 
	 * a == b : a와 b가 일치합니까? // 작성 때나 다른 사람의 코드를 해석할 때나 ※의문형/의문문※으로 생각해야한다. // 결과값이 네, 아니오이니까!
	 * a != b : a와 b가 일치하지 않습니까? // 부정의문문형태
	 * 
	 *  2. 대소비교 :
	 * 
	 * a < b : a가 b보다 작습니까? // ※왼쪽부터 보세요※
	 * a > b : a가 b보다 큽니까?
	 * a <= b : a가 b보다 작거나 같습니까?
	 * a >= b : a가 b보다 크거나 같습니까?
	 *
	 * 결과값은 true / false
	 */
	
	public void method1() {
		
		//System.out.println("호호호");
		
		int firstNumber = 10;
		int secondNumber = 25;
		
		System.out.println("firstNumber < secondNumber :  " + (firstNumber < secondNumber)); //first가 second보다 작습니까?? 로 이해하셔야합니다.
		
		System.out.println("두 값이 같나요? : " + (firstNumber == secondNumber)); // a와 b가 같습니까? 로 이해하셔야합니다.
		
		System.out.println("a가 b보다 작거나 같습니까? : " + (firstNumber <= secondNumber));
		
																		// 무슨 값이 필요하지?
																		// firstNumber
																		// 무슨 연산을 해야하지?
																		// 비교연산 (짝수인지 아닌지)
																		// 2 4 6 8 10 ··· 2로 나눴을 때 나머지가 0이다.
		System.out.println("firstNumber가 짝수입니까? : " + (firstNumber % 2 == 0)); // 이것을 나누었을 때 0과 같다면 참이다.
		
		System.out.println("secondNumber가 홀 수가 아닙니까? : " + (secondNumber % 2 != 1));
		
		System.out.println("firstNumber가 홀수입니까? : " + (firstNumber % 2 != 0));
		
		
		
	}
	
	

	
	
	
	
}
