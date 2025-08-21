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
		�߻�Ŭ������ ����Ǿ��� ������ ��ü ������ �Ұ����ϴ�.
		s.rule();
		// ��������� Ŭ������ �θ� Ŭ������ ����� �뵵�θ� ����� �ǵ� �̰����� ��ü�� �����ϴ� �� ���� �Ǵ���
		// ���⼭ ��µǴ� �������� ��¹��� �ƹ� �ǹ̰� ����.
		*/
		
		// �߻� Ŭ������ ��ü ������ �Ұ��� ������ Ÿ���� �������� ������ �������� ������ ���� �ִ�.
		Sports[] sports = new Sports[2];
		sports[0] = fb;
		sports[1] = bb;
		
		for(int i = 0; i < sports.length; i++) {
			sports[i].rule();
		}

	}

}
