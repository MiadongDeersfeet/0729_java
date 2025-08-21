package com.kh.chap04.run;

import java.util.Arrays;
import java.util.Scanner;

import com.kh.chap04.controller.FieldController;
import com.kh.chap04.controller.StaticController;

public class Run {

	public static void main(String[] args) {
	
		System.out.println(StaticController.str);
		
		FieldController fc = new FieldController();
		// 1. FieldController 자료형으로 fc라는 이름의 지역변수를 선언
		// 2. 객체 생성 (new 키워드를 만났을 때) ★★★★★ 2번 시점이 중요하다구요   =>  2번에서 global 멤버변수의 공간이 할당
		// 3. 주소값을 대입
		
		//System.out.println(fc.global);
		
		
	fc.checkVariable(50);
	// checkVariable 호출 == parameter(매개변수) 할당 및 초기화
	
	// checkVariable 호출 종료시
	// parameter, local 지역변수 소멸   => 그러나 global은 여전히 살아있어요.
	
	System.out.println(fc.global);
	fc = null; // 널값을 대입하는 이 시점부터 글로벌은 사용불능이 된다.
	
	//System.out.println(fc.global);
	
	// 목표 : str 출력하기
	/*
	StaticController sc = new StaticController();
	System.out.println(sc.str);
	*/ //스태틱은 이렇게 안씁니다.
	System.out.println(StaticController.str); // 1절
	System.out.println(StaticController.JAVA_VERSION);
	
	System.out.println(Arrays.toString(new int[2])); //Arrays 대문자니까 클래스겠네?
	System.out.println(Math.random()); // 0.0 ~ 0.9999999999999999~ 객체생성 안했는데 메서드 호출이 되네? 랜덤 보니까 좀 누워있네? 스태틱이다~~~~더블형이 돌아왔다는 것은
	                                   // 이 메서드의 반환 타입이 더블이닷
	System.out.println(Math.PI); // 굵은데 눕기까지 했네 스태틱 파이널이군. 밖에서 다이렉트로 부를 수 있어요.
	
	Scanner sc = new Scanner(System.in);
	int num = sc.nextInt(); // 메서드가 생겨먹은게 반환타입이 인트니까 인트밖에 안되고
	String str = sc.nextLine(); // 얘는 메서드가 생겨먹은게 반환타입이 스트링이니까 스트링밖에 안되고

	/*
	 * AccessModifier(접근제어자 / 접근제한자)
	 * (+)public => 어디서든(같은 패키지, 다른 패키지, 클래스 내부, 클래스 외부 포함 전부) 접근 가능
	 * 
	 * (#)protected => 같은 패키지라면 무조건 접근 가능!
	 * 			 => 다른 패키지라면 상속구조인 클래스에서만 접근 가능
	 * 			 => 상속이라는 개념은 05_Object / 06_ObjectArray(객체배열) 끝나고 07번에서 배울 것
	 * 
	 * (~)default(package friendly) => 오로지 같은 패키지에서만 접근 가능
	 * 
	 * (-)private => 오직 클래스 내부에서만 접근 가능 (밖으로 벗어나는 순간 절대로 못들어가요)
	 * 
	 *
	 */
	}
	//public||protected||private in num; 이런 식으로 쓰는데 int num; 그냥 이렇게 접근제한자 없이 쓰면 디폴트임. (우리나라는 디폴트 선호, 외국권은 패키지 프렌들리라는 용어를 선호)
}
