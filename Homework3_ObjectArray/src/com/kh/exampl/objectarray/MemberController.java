package com.kh.exampl.objectarray;

import java.util.Scanner;

public class MemberController {
	
	private Member[] m = new Member[SIZE]; //����� �迭���� ���ó�� ���� ���� �ּҰ��� �� �� �־��. �⺻���� �ΰ�.
	public static final int SIZE = 10;
	Scanner sc = new Scanner(System.in);
	// static ��
	static{ // Ŭ������ �ҷ��� �� �׳� �� �ö󰡹����� ģ����. (��û ����)
		System.out.println("ȣ�� ���� ���� ������");
	}
	
	// �ʱ�ȭ �� => �ϳ��� �Ἥ � �����ڸ� ȣ���ϴ��� ��Ÿ� �� ���� �� �־��. �׷� �鿡�� �������̴�. // ������ ������ �ʱ�ȭ����� ���� ����.
	{
		System.out.println("���� 3��");
		m[0] = new Member("admin", "������", "ad1234", "admin@kh.com", 'M', 100);		
	}
	
	public MemberController() { //�⺻�����ںο� �̰� �ΰ� �̹� 1���� ���Ե� ���¶�� ������ ����� => �ٵ� ���ڱ� ������������ �ʱ�ȭ�� ���������� �Űܹ���.
		System.out.println("���� 4��");
	}
	
	public int existMemberNum() {
		
		int count = 0;
		
		/* �ߺ��Ǵ� �κ��� �ݺ����� ���ؼ� �ٲ��ݽô�
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
		 } // if ������
			
	} // for ������
		
	
  } // insertMember ������
		
		public Member searchId(String id) {
			
			// �Ű����� id : ����ڰ� �Է��� �˻��ϰ��� �ϴ� ���̵� ��
			for(int i = 0; i < m.length; i++) {
			if(m[i] != null && m[i].getId().equals(id)) {
			//���̵� �Ȱ��� �� �־��.
				return m[i];
			}
			}
			return null;
		
		} // searchId ������
		
		public Member[] searchName(String keyword) { // ����� �������ϱ� ��� �������� �ѹ��� ���� �� �ִ� ����� �迭�δٰ�
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
			
			// ���޹��� 3���� ���� ������
			// ��й�ȣ�� �ٲ��ְų� �ٲ����� �ʰų�
			
			// �迭�� ù��° ��� ���̵� ���ؾ���
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
				m[i] = null; // ���̻� ����Ű�� ����� �����ϱ� ���������.
				return 1;
				}
			}
		
			return 0;
		}
			
		
} // Ŭ���� �ٵ�
