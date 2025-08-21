package com.kh.chap06.run;

//import com.kh.chap06.controller.MethodController;
import com.kh.chap06.controller.OverloadingController;

public class Run {

	public static void main(String[] args) {
		
	//	Human human = new Human(); // 휴먼 타입의 주소 공간을 선언하고 new 와 함께 휴먼이라는 객체의 생성자를 호출해서 생성된 값을 휴먼 타입의 주소 공간에 대입해준다 ???
	//	MethodController mc = new MethodController();
	//	int a = mc.add(1, 2);
	//	int b = mc.add(2, 3);
	//	int c = mc.add(5, 6);
	//	int d = mc.add(a, b);
	//	int e = mc.add(c, d);
	//	System.out.println("총합 : " + e);
		
	//	MethodController mc = new MethodController();
		// int[] dd = new int[3] ;
		//mc.method1();
		// String returnValue = mc.method2();
		// System.out.println(returnValue);
		//System.out.println(mc.method2());
		//System.out.println("method3 호출 결과 : " + mc.method3());            // <= 뭐지?          매개변수는 존재하지 않지만 반환값은 존재합니다.
		                                                                                     // method3 호출 결과 : returnValue
		//mc.println("method3 호출 결과 : " + mc.method3());
		//mc.method4(2);
		
		//int result = mc.method5(5);
		//System.out.println(result);
		//mc.a();
		// mc.test(mc); 얕은복사 : 서로 다른 변수가 같은 주소를 가리킴 (배열에서 배움) ☆★☆★☆★☆★☆★
		
		//mc.staticMethod();
		
		// 객체를 생성하지 않고 메소드를 호출할 수 있음 -- static과 뭔 상관?
		/*
		Math.random();
		int[] arr = {1, 2, 3, 4, 5};
		System.out.println(Arrays.toString(arr)); // toString 기울었네? 스태틱이네. 객체 생성 없이 참조해서 사용 갸능하네.
	
		MethodController.staticMethod();
		
		mc.haha();;
		System.out.println(1);
		System.out.println(1.1);
		System.out.println('a');
		System.out.println("어라?");
		System.out.println(mc);
		System.out.println();
		*/ // <=== 얘네 왜 돼요? 메소드 오버로딩이 구현되어있기 때문입니다.
		
		OverloadingController oc = new OverloadingController();
		
		// 정적 바인딩(Static Binding <= 여기 스태틱은 메모리 이야기 아닙니다.)
		// 컴파일이 끝난 시점 어떤 메소드가 호출될지 결정
		// 컴파일러가 알아서 코드를 분석하여 메소드 호출 연결
		oc.test();
		oc.test(2);
		oc.test("3");
		oc.test(4, 4);
		oc.test(5, 5, 5);
		
		
		
		
	}

}
