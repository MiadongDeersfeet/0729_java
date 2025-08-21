package com.kh.chap05.constructor.run;

import com.kh.chap05.constructor.model.vo.Member;

public class Run {
	
	public static void main(String[] args) {
		
		Member member = new Member();   // new 객체생성  ->   Member()  객체의 초기 상태를 생성하는 생성자 = 객체 생성자
		/*                                     => 회원가입을 했으니 Member 가 생겼을텐데 값들이 다 null 값이네? -- 유효하지 않은 상태(개념적 측면)
		member.setUserId("deersfeet");
		member.setUserPwd("ABC1234567890!");
		member.setNickName("사슴발");
		
		String info = member.info();
		System.out.println(info);
		*/
		Member member2 = new Member("하하호호");
		
		Member member3 = new Member("user01", "1234"); 
		// 좌항은 스택에 올라가요.  =>   우항 new 가 되는 순간 이미 필드가 올라가고 . => 기본값 null , null , null 도 들어가있겠죠 => 그러고나서 생성자를 호출
		// 생성자를 호출하면 인자값이 해당 매개변수로 들어가요 => 그 다음에 매개변수에 들어간 값이 필드에 있는 값에 초기화 돼요 => 그리고 주소값이 member3로 들어가요.
		System.out.println(member3.info());
		// 순서대로 매개변수 없는 거 호출 , 한 개 있는거 호출, 두 개 있는거 호출
		
		Member member4 = new Member("deersfeet", "392766", "미아동사슴발");
		System.out.println(member4.info()); // 우와 참 신기하다
	
		
	}

}
