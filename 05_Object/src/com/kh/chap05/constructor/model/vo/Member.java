package com.kh.chap05.constructor.model.vo;

public class Member {
	
	
	// [ 필드부 ]
	// 아이디, 비밀번호, 닉네임
	private String userId;
	private String userPwd;
	private String nickName;
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	
	public String getUserId() {
		return userId;
	}
	

	public String getUserPwd() {
		return userPwd;
	}
	
	public String getNickName() {
		return nickName;
	}
	
	public String info() {
		return "아이디 : " + userId + ", 비밀번호 : " + userPwd + ", 닉네임 : " + nickName;
	}
	
	
	// [ 생성자부 ]
	/*
	 * 생성자(Constructor) : 객체를 생성하는데 사용하는 특수한 유형의 메소드
	 * 
	 * [ 표현법 ]
	 * 접근제한자 클래스식별자(매개변수(생략가능)) {                    => public Constructor(???) {}
	 * 			해당 생성자를 통해서 객체 생성 시 실행하고자 하는 코드; (적을 수도 있고 안적을 수도 있고)
	 * 			
	 * }
	 * 
	 * 생성자의 역할
	 * -- 기술적인 관점 : 객체가 생성될 때 어떤 상태로 시작을 해야하는가 (커피 모양 객체를 내놔, 멤버 모양 객체를 내놔.....)
	 * -- 개념적인 관점 : 객체가 처음부터 유효한 상태를 가지도록 강제
	 * 
	 * 생성자의 종류
	 * 1. 매개변수가 없는 생성자 => 기본생성자
	 * 2. 매개변수가 존재하는 생성자 => 매개변수 생성자
	 * => 객체를 생성과 동시에 유효하게 만들기 위해서
	 * 
	 * 
	 * 
	 */
	public Member() {         // <= 얘는 무조건 있어야함           // 이게 생성자 끝~!
	   	// 기본생성자(매개변수 없음)
		System.out.println("안녕하세요. 제 이름은?");
		// 기본생성자는 객체를 생성할 목적으로 호출해서 사용
		// 기본생성자는 생략해도 에러가 발생하지 않음
		// 클래스 내부에 생성자를 하나도 작성하지 않으면 JVM이 기본생성자를 자동으로 만들어줌!
		// 생성자를 하나라도 만들어두면 JVM이 생성자를 자동으로 안만들어줘요.
		// 기본생성자를 항상 작성하자!!!! ★★★★★★
	}
	
	// 매개변수가 존재하는 생성자              클래스명 소문자로 적으면 메소드라고 인식해요. 대소문자 구분 확실히!!!!!!    ※ 반환타입 (void) 적어도 메소드라고 생각해요 !!!!
	public Member(String userId) {
		System.out.println("매개변수가 한 개인 생성자");
	}
	
	public Member(String userId, String userPwd) {
		//System.out.println("매개변수가 두 개인 생성자");
		//System.out.println("전달받은 아이디 값 : " + userId);
		//System.out.println("전달받은 비밀번호 값 : " + userPwd);
		this.userId = userId;
		this.userPwd = userPwd;
		
	}
	
	public Member(String userId, String userPwd, String nickName) {
		this.userId = userId;
		this.userPwd = userPwd;
		this.nickName = nickName;
	}
	/*
	 * 1. 반드시 생성자의 이름을 클래스의 이름과 동일하게 작성해야함(대/소문자 주의)
	 * 2. 반환형이 존재해서는 안된다. 반환형 있으면 메소드로 판단하기 때문.
	 * 3. 매개변수 생성자를 명시적으로 작성하면 기본 생성자를 만들어주지 않음!
	 * => 우리는 꼭 기본생성자를 억지로 열심히 작성하는 습관을 들여야한다!!!
	 * 4. 생성자는 동일한 이름으로 여러 개 생성이 가능하지만 매개변수가 중복되어선 안됨!! => 생성자 오버로딩
	 */
	
	// [ 메소드부 ]
	// 16:00는 여러분들이 힘든 시간이기 때문에, 실습을 드리겠습니다.
	// 모든 필드에 대한 getter() / setter() 만들기 + 모든 필드의 정보를 합쳐서 반환하는 info 만들기
	// 시작
	

}
