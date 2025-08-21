package com.kh.chap03.run;

import com.kh.chap03.model.vo.BaseBall;
import com.kh.chap03.model.vo.FootBall;
import com.kh.chap03.model.vo.Sports;
/*import com.kh.chap03.model.vo.Sports;*/

public class Run {

	public static void main(String[] args) {
		
		FootBall fb = new FootBall();
		fb.rule();
		
		BaseBall bb = new BaseBall();
		bb.rule();
		
		/*
		Sports s = new Sports();
		추상클래스로 선언되었기 때문에 객체 생성이 불가능하다.
		s.rule();
		// 스포츠라는 클래스는 부모 클래스로 상속을 용도로만 사용할 건데 이것으로 객체를 생성하는 게 말이 되느냐
		// 여기서 출력되는 스포츠의 출력문은 아무 의미가 없죠.
		*/
		
		// 추상 클래스는 객체 생성이 불가능 하지만 타입을 상속해줬기 때문에 다형성은 적용할 수가 있다.
		Sports[] sports = new Sports[2];
		sports[0] = fb;
		sports[1] = bb;
		
		for(int i = 0; i < sports.length; i++) {
			sports[i].rule();
		}

	}

}
