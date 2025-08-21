package com.kh.exampl.objectarray;

import java.util.Scanner;

public class MemberController {
	
	private Member[] m = new Member[SIZE]; //멤버형 배열에는 멤버처럼 생긴 애의 주소값만 들어갈 수 있어요. 기본값은 널값.
	public static final int SIZE = 10;
	Scanner sc = new Scanner(System.in);
	// static 블럭
	static{ // 클래스를 불러올 때 그냥 슥 올라가버리는 친구임. (엄청 빠름)
		System.out.println("호잇 나는 정말 빠르닷");
	}
	
	// 초기화 블럭 => 하나만 써서 어떤 생성자를 호출하던지 요거를 다 돌릴 수 있어요. 그런 면에서 경제적이다. // 생성자 이전에 초기화블록이 먼저 돈다.
	{
		System.out.println("내가 3등");
		m[0] = new Member("admin", "관리자", "ad1234", "admin@kh.com", 'M', 100);		
	}
	
	public MemberController() { //기본생성자부에 이걸 두고 이미 1명은 가입된 상태라는 전제로 만들기 => 근데 갑자기 수업내용으로 초기화블럭 만들어버리고 옮겨버림.
		System.out.println("내가 4등");
	}
	
	public int existMemberNum() {
		
		int count = 0;
		
		/* 중복되는 부분을 반복문을 통해서 바꿔줍시다
		if(m[0] != null) count++;
		if(m[1] != null) count++;
		if(m[2] != null) count++;
		*/
		
		for(int i = 0; i < m.length; i++) {
			if(m[i] != null) {
				count++;
			}
		}
		return count;
		
		
		}
	
	public boolean checkId(String inputId) {
		
		for(int i = 0; i < m.length; i++) {
		//	if(m[i] != null) {
		if(m[i] != null && m[i].getId().equals(inputId)) {
			return true;
		}
		//}
		}
		return false;
		}
	
		
		public void insertMember(String id, String name, String password, String email, char gender, int age) {
			
			for(int i = 0; i < m.length; i++) {
			if(m[i] == null) {
			m[i] = new Member(id, name, password, email, gender, age);
			break;
		 } // if 스코프
			
	} // for 스코프
		
	
  } // insertMember 스코프
		
		public Member searchId(String id) {
			
			// 매개변수 id : 사용자가 입력한 검색하고자 하는 아이디 값
			for(int i = 0; i < m.length; i++) {
			if(m[i] != null && m[i].getId().equals(id)) {
			//아이디 똑같은 거 있어요.
				return m[i];
			}
			}
			return null;
		
		} // searchId 스코프
		
		public Member[] searchName(String keyword) { // 멤버가 여러개니까 멤버 여러개를 한번에 담을 수 있는 멤버형 배열로다가
			int count = existMemberNum();
			Member[] members = new Member[count];
			int index = 0;
			for(int i = 0; i < m.length; i++) {
				if(m[i] != null && m[i].getName().equals(keyword)) {
					members[index++] = m[i];
				}
			}
			return members;
		}
		
		public boolean updatePassword(String userId, String userPw, String newPassword) {
			
			// 전달받은 3개의 값을 가지고
			// 비밀번호를 바꿔주거나 바꿔주지 않거나
			
			// 배열의 첫번째 요소 아이디값 비교해야지
			for(int i = 0; i < m.length; i++) {
			if(m[i] != null && m[i].getId().equals(userId) && m[i].getPassword().equals(userPw)) {
				m[i].setPassword(newPassword);
				return true;
				
			 }
		}
			return false;
	}

		public Member[] deleteMember(String userId, String userPwd) {
			
			for(int i = 0; i < m.length; i++) {
				if(m[i] != null && m[i].getId().equals(userId) && m[i].getPassword().equals(userPwd)) {
				m[i] = null; // 더이상 가리키는 사람이 없으니까 사라지겠죠.
				return 1;
				}
			}
		
			return 0;
		}
			
		
} // 클래스 바디
