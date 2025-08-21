package com.kh.run;

import com.kh.variable.B_KeyboardInput;
//import com.kh.variable.A_Variable;
import com.kh.variable.Casting;

public class Run {

	public static void main(String[] args) {
		
		// 외부 클래스에 존재하는 메소드를 호출하고 싶다. (1) 생성하고
		//com.kh.variable.A_Variable a = new com.kh.variable.A_Variable();
		//a.findSeasonMenu();
		//a.declareVariable(); //(2) 접근하고 --> 위 클래스의 (나 기준) 97행으로 가서 위에서 아래로 왼쪽에서 오른쪽으로 진행
		//com.kh.variable.B_KeyboardInput b = new com.kh.variable.B_KeyboardInput();
		//b.inputTest();
		B_KeyboardInput b = new B_KeyboardInput();
		//b.inputTest();
		//A_Variable a = new A_Variable();
		//a.declareVariable();
		Casting c = new Casting();
		//c.autoCasting();
		c.forceCasting();
		
	
		
		
	
		
	}
	
}
