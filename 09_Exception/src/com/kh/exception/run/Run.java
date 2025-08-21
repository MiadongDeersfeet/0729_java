package com.kh.exception.run;

import com.kh.exception.controller.CheckedException;
import com.kh.exception.controller.UnCheckedException;

public class Run {

	public static void main(String[] args) {
		/*
		 * 에러(Error)
		 * 
		 * - 시스템 에러 : 컴퓨터가 오작동으로 인해 발생하는 에러
		 * 				=> (심각) 소스코드로 해결이 안됨; 개발자 손을 떠난 것
		 * 
		 * - 컴파일 에러 :  프로그램 실행 전 소스코드상의 문법적인 문제로 발생하는 에러
		 * 				=> 소스코드를 수정해서 해결이 가능(빨간줄로 알려줌)
		 * 
		 * - 런타임 에러 : 프로그램 실행 중 발생하는 에러 문법적으로는 문제가 없는데 발생
		 *				=> 첫번째 고비예요. 문법은 빨간줄이라도 가있지. 이건 문제를 바로바로 못찾으니까요. 
		 * 				=> 실행을 하다가 갑자기 와장창~!
		 * 				=> 사용자의 잘못일 가능성이 높긴 하지만..?
		 * 				=> 개발자가 예측 가능한 경우 처리하지 않았을 때!
		 * 
		 * - 논리적 에러 : 소스코드 상 문제도 없고, 실행했을 때도 문제가 발생하지 않음
		 * 				=> 의도와는 다르게 동작 ★ 이게 사실 제일 머리 아파 (기획/ 설계를 잘못했을 때)
		 * 					=> 시원하게 날리고 다시 하는 게 제일 빨라요.
		 * 
		 * 예외 : 시스템 에러를 제외한 나머지 컴파일, 런타임, 논리적 에러와 같이 비교적 덜 심각한 애들
		 * 		 그 중에서도 주로 런타임 에러를 의미함.
		 */
		
		UnCheckedException e = new UnCheckedException();
		CheckedException ce = new CheckedException();
	//	e.method1();
		
	//	e.homeWork();
	//	e.method2();
	//	e.method3();
		try { // 체크드익셉션에서 throw 를 했지만, 어쨌든 런이든 저기든 예외처릴 해줘야함.
		ce.method1();
		} catch(Exception e1) {
			e1.printStackTrace();
		}
	}

}
